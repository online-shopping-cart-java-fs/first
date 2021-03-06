import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-dashboard',
  templateUrl: './customer-dashboard.component.html',
  styleUrls: ['./customer-dashboard.component.css']
})
export class CustomerDashboardComponent implements OnInit {
  userName:string="";
  constructor(public router:Router) { }

  ngOnInit(): void {
    let obj = sessionStorage.getItem("name");
    if(obj!=null){
      this.userName=obj;
    }
  }

  logout(){
    sessionStorage.removeItem("name");
    this.router.navigate(["login"]);
  }

}
