import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CustomerService } from '../customer.service';
import {Customer} from '../customer.model';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  msg:string="";
  flag:boolean=false;


  /*customerInfo=new FormGroup({
    username:new FormControl(),
    accnum:new FormControl(),
    custname:new FormControl(),
    password:new FormControl(),
    email:new FormControl(),
    address:new FormControl(),
    mobnum:new FormControl()
  })*/

  
  constructor(public router:Router,public customerSer:CustomerService) { }

  ngOnInit(): void {

  }


 
  storeCustomer(customer:Customer){
    //let customerRef=this.customerInfo.value;

    this.flag=true;
    //this.customerSer.storeCustomerData(customer).subscribe(result=>this.msg=result)
    this.customerSer.storeCustomerData(customer).subscribe(result=>this.msg=result)
  }

}
