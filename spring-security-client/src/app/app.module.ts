import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MembersComponent } from './pages/members/members.component';
import { SigninComponent } from './pages/signin/signin.component';
import { SignupComponent } from './pages/signup/signup.component';
import { TokenInterceptor } from './security/token.interceptor';


@NgModule({
  declarations: [
    AppComponent,
    SigninComponent,
    SignupComponent,
    MembersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: TokenInterceptor, multi: true }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
