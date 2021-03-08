import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  msg:string="";

  customerInfo=new FormGroup({
    custid:new FormControl(),
    accnum:new FormControl(),
    custname:new FormControl(),
    password:new FormControl(),
    debitnum:new FormControl()
  })
  
  constructor(public router:Router,public customerSer:CustomerService) { }

  ngOnInit(): void {
  }

  storeCustomerDetails(){
    let customerRef=this.customerInfo.value;
    this.customerSer.storeCustomerInfo(customerRef).subscribe(result=>this.msg=result)
    this.router.navigate(['/login']);
  }

}
