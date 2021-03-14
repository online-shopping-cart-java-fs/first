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

  customerRef=new Customer();
  msg:string="";

  constructor(public router:Router,public customerSer:CustomerService) { }

  ngOnInit(): void {
  }

  checkUser(userRef:any) {
    
    let user = userRef.user;
    let pass  = userRef.pass;
    let cat = userRef.cat;
    
    if(cat=="admin"){
      if(user=="admin" && pass=="admin"){
        alert("Login Successful")
        sessionStorage.setItem("name",user); 
        this.router.navigate(["/admin"])
      }else {
        alert("Invalid Username or Password")
      }
    }
    else{
      this.customerSer.getCustomerByusername(user).subscribe(data=> {
        if(data==null){
        alert("Invalid Username")
        }else {
          this.msg = "";
          this.customerRef=data;
          console.log(this.customerRef.password)
          if(user==this.customerRef.username && pass==this.customerRef.password){
            alert("Login Successful")
            sessionStorage.setItem("name",user); 
            this.router.navigate(["/customer"])
          }else {
            alert("Invalid Password")
          }
        }
      })
    }
  }
  
}