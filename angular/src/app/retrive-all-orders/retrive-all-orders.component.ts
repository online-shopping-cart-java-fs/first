import { Component, OnInit } from '@angular/core';
import { Orders } from '../orders.model';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-retrive-all-orders',
  templateUrl: './retrive-all-orders.component.html',
  styleUrls: ['./retrive-all-orders.component.css']
})
export class RetriveAllOrdersComponent implements OnInit {

  orderInfo:Array<Orders>=[];
  flag:boolean = false;
  constructor(public orderSer:OrdersService) { }

  ngOnInit(): void {
  }
  getAllOrders(){
    this.flag=true;
    //this.orderSer.getOrderData().subscribe(data=>this.orderInfo=data);

  }

}
