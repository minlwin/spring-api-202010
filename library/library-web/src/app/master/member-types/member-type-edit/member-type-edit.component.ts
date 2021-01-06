import { Component, EventEmitter, Input, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-member-type-edit',
  templateUrl: './member-type-edit.component.html',
  styles: [
  ]
})
export class MemberTypeEditComponent {

  form: FormGroup

  @Input()
  set data(data: any) {
    if (data) {
      this.form.patchValue(data)
    }
  }

  @Output()
  saveListener = new EventEmitter

  constructor(builder: FormBuilder) {
    this.form = builder.group({
      id: 0,
      name: ['', Validators.required],
      inHand: [0, Validators.min(1)],
      duration: [0, Validators.min(1)],
      extensionDays: [0, Validators.min(1)],
    })
  }

  get edit(): boolean {
    return this.form.get('id')?.value > 0
  }

  save() {
    if (this.form.valid) {
      this.saveListener.emit(this.form.value)
      this.form.reset()
    }
  }

}
