import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-updatecustomer-data',
  templateUrl: './updatecustomer-data.component.html',
  styleUrls: ['./updatecustomer-data.component.css']
})
export class UpdatecustomerDataComponent implements OnInit {
  msg:string=""
  constructor(public customerSer:CustomerService) { }

  ngOnInit(): void {
  }

  /*updateCustomerInfo(customerInfo:any){

    this.customerSer.updateCustomerInfo(customerInfo).subscribe(data=>this.msg=data);
  } */

}
