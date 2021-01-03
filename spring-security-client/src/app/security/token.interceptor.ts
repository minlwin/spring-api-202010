import {
  HttpEvent, HttpHandler,

  HttpInterceptor, HttpRequest, HttpResponse
} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';
import { SecurityContext } from './SecurityContext';

const token = "jdc-jwt-token"

@Injectable()
export class TokenInterceptor implements HttpInterceptor {

  constructor() { }

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {

    // add token into header
    let cloneRequest = request

    if (SecurityContext.context.token) {
      cloneRequest = request.clone({
        headers: request.headers.append(token, SecurityContext.context.token)
      })
    }

    return next.handle(cloneRequest).pipe(
      tap(event => {
        if (event instanceof HttpResponse) {
          SecurityContext.context.token = event.headers.get(token)
        }
      })
    );
  }
}
