import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-storecustomer-data',
  templateUrl: './storecustomer-data.component.html',
  styleUrls: ['./storecustomer-data.component.css']
})
export class StorecustomerDataComponent implements OnInit {
  customerInfo=new FormGroup({
    custid:new FormControl(),
    accnum:new FormControl(),
    custname:new FormControl(),
    password:new FormControl(),
    debitnum:new FormControl()
  })
  msg:string="";
  constructor(public customerSer:CustomerService) { }

  ngOnInit(): void {
  }

  storeCustomerDetails(){
    let customerRef=this.customerInfo.value;
    this.customerSer.storeCustomerInfo(customerRef).subscribe(result=>this.msg=result)
  }

}
