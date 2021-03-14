import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerOrders } from '../customerorders.model';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {

  msg:string="";
  user:string="";
  orderInfo:Array<CustomerOrders>=[];

  constructor(public router:Router,public orderSer:OrdersService) { }

  ngOnInit(): void {

    let obj = sessionStorage.getItem("name");
    if(obj!=null){
      this.user=obj;
      this.orderSer.getOrdersByCustomer(this.user).subscribe(data=>this.orderInfo=data)
    }

  }

  cancelOrder(orderid:any){
    this.orderSer.deleteOrderData(orderid).subscribe(data=>{
      this.msg=data
      alert(this.msg)
    })
  }

}
