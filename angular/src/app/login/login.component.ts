import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer.model';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  msg:string="";
  flag:boolean=false
  customer:Array<Customer>=[]

  constructor(public router:Router,public customerRef:CustomerService) { }

  ngOnInit(): void {
  }

  checkUser(userRef:any) {
    let user = userRef.user;
    let pass  = userRef.pass;
    let cat = userRef.cat;
    if(cat=="admin"){
      if(user=="admin" && pass=="admin"){
        console.log("Successfully Login")
        sessionStorage.setItem("name",user); 
        this.router.navigate(["admin"])
      }else {
        console.log("Failure try once again")
        this.msg = "UserName or password is wrong";
      }
    }
    else{

      this.customerRef.checkCustomer(userRef).subscribe(data=>{
            this.customer=data;
            for(let var1 of this.customer){
              if(var1.custname==user && var1.password==pass) {
                console.log("Successfully Login")
                this.router.navigate(["customer"])
        }else{
          console.log("Failure try once again")
          this.msg = "UserName or password is wrong";
        }
      }
      })
    }
  }

}
