import { Component } from '@angular/core';
import { MemberService } from 'src/app/services/member.service';

@Component({
  templateUrl: './members.component.html',
  styles: [
  ]
})
export class MembersComponent {

  list: any[] = []

  constructor(service: MemberService) {
    service.getAll().subscribe(data => this.list = data)
  }

}
