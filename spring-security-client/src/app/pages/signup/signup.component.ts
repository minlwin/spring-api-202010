import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { SecurityContext } from 'src/app/security/SecurityContext';
import { SecurityService } from 'src/app/services/security.service';

@Component({
  templateUrl: './signup.component.html',
  styles: [
  ]
})
export class SignupComponent {

  message?: string
  form: FormGroup

  constructor(builder: FormBuilder, private service: SecurityService, private router: Router) {
    this.form = builder.group({
      name: ['', Validators.required],
      loginId: ['', Validators.required],
      password: ['', Validators.required]
    })
  }

  signUp() {
    if (this.form.valid) {
      this.service.signUp(this.form.value).subscribe(result => {
        if (result.message) {
          this.message = result.message
        } else {
          SecurityContext.context.loginUser = result.loginUser
          this.router.navigateByUrl('/members')
        }
      })
    }
  }

}
