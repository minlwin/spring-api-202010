import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { SecurityContext } from 'src/app/security/SecurityContext';
import { SecurityService } from 'src/app/services/security.service';

@Component({
  templateUrl: './signin.component.html',
  styles: [
  ]
})
export class SigninComponent {

  form: FormGroup
  message: string = ''

  constructor(builder: FormBuilder, private service: SecurityService, private router: Router) {
    this.form = builder.group({
      loginId: ['', Validators.required],
      password: ['', Validators.required]
    })
  }

  signIn() {
    if (this.form.valid) {
      this.message = ''
      this.service.signIn(this.form.value).subscribe(data => {
        if (data.loginUser) {
          SecurityContext.context.loginUser = data.loginUser
          this.router.navigateByUrl('/members')
        } else {
          this.message = data.message
        }
      })
    }
  }

}
