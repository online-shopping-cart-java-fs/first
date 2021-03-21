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
  flag:boolean=false;
  
  constructor(public router:Router,public customerSer:CustomerService) { }

  ngOnInit(): void {
  }

  storeCustomer(customerRef:any){
    this.flag=true;
    this.customerSer.storeCustomerData(customerRef).subscribe(result=>this.msg=result)
  }

}
