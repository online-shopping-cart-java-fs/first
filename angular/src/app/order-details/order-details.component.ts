import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartService } from '../cart.service';
import { Customer } from '../customer.model';
import { CustomerService } from '../customer.service';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css']
})
export class OrderDetailsComponent implements OnInit {

  msg:string="";
  user:string="";
  cart:any;
  customerRef=new Customer();

  constructor(public router:Router,public cartSer:CartService,public customerSer:CustomerService,public orderSer:OrdersService) { }

  ngOnInit(): void {

    let obj = sessionStorage.getItem("name");
    if(obj!=null){
      this.user=obj;
      this.customerSer.getCustomerByusername(this.user).subscribe(data=>this.customerRef=data)
    }
    this.cart=this.cartSer.getFromCart();  
  }

  cancel(){
    this.router.navigate(["/customer/cart"])
  }

  storeOrder(orderInfo:any){
    this.orderSer.storeOrderData(orderInfo).subscribe(data=>this.msg=data)
    this.cart=this.cartSer.removeFromCart();
  }

}
