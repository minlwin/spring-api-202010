import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

const API = `${environment.baseApi}/members`

@Injectable({
  providedIn: 'root'
})
export class MemberService {

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get<any[]>(API)
  }
}
