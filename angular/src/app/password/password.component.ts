import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-password',
  templateUrl: './password.component.html',
  styleUrls: ['./password.component.css']
})
export class PasswordComponent implements OnInit {

  msg:string="";
  flag:boolean=false;

  constructor(public customerSer:CustomerService) { }

  ngOnInit(): void {
  }

  changePassword(passInfo:any){
    this.flag=true;
    this.customerSer.updatePassword(passInfo).subscribe(data=>this.msg=data);
  }

}
