import { Component } from '@angular/core';
import { MemberTypeService } from 'src/app/common/services/member-type.service';

declare var $: any

@Component({
  templateUrl: './member-types.component.html',
  styles: [
  ]
})
export class MemberTypesComponent {

  list: any[] = []
  target: any

  constructor(private service: MemberTypeService) {
    this.reload()
  }

  private reload() {
    this.service.getAll().subscribe(page => this.list = page.list)
  }

  addNew() {
    this.target = null
    $('#editDialog').modal('show')
  }

  edit(data: any) {
    this.target = data
    $('#editDialog').modal('show')
  }

  save(data: any) {
    this.service.save(data).subscribe(() => {
      this.reload()
      $('#editDialog').modal('hide')
    })
  }

}
