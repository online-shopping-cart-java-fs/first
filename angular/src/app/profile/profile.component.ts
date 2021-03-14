import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from '../customer.model';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  msg:string="";
  user:string="";
  customerRef=new Customer();

  constructor(public router:Router,public customerSer:CustomerService) {}

  ngOnInit(): void {

    let obj = sessionStorage.getItem("name");
    if(obj!=null){
      this.user=obj;
      this.customerSer.getCustomerByusername(this.user).subscribe(data=>this.customerRef=data)
    }
  }

  updateCustomer(){
    this.customerSer.updateCustomerData(this.customerRef).subscribe(data=>{
      this.msg=data
      alert(this.msg)
    })
  }
  
  deleteCustomer(){
    this.customerSer.deleteCustomerData(this.customerRef.username).subscribe(data=>{
      this.msg=data
      alert(this.msg)
      sessionStorage.removeItem("name");
      this.router.navigate(["/signup"])
    })
  }

}
