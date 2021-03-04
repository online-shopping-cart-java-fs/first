import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  msg:string="";

  constructor(public router:Router) { }

  ngOnInit(): void {
  }

  checkUser(userRef:any) {
    let user = userRef.user;
    let pass  = userRef.pass;
    let cat = userRef.cat;
    if(cat=="admin"){
      if(user=="Raj" && pass=="123"){
        console.log("Successfully Login")
        sessionStorage.setItem("name",user); 
        this.router.navigate(["admin"])
      }else {
        console.log("Failure try once again")
        this.msg = "UserName or password is wrong";
      }
    }else{
    }
  }

}
