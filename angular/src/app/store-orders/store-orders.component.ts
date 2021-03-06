import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-store-orders',
  templateUrl: './store-orders.component.html',
  styleUrls: ['./store-orders.component.css']
})
export class StoreOrdersComponent implements OnInit {

  msg:string="";
 
  orderInfo=new FormGroup({
    cudtid:new FormControl(),
    orderid:new FormControl(),
    orderdate:new FormControl(),
    pid:new FormControl(),
    pname:new FormControl(),
    price:new FormControl(),
  });
  constructor(public orderSer:OrdersService) { }

  ngOnInit(): void {
  }
  storeOrderDetails(){
    let orderRef = this.orderInfo.value;
    this.orderSer.storeOrderData(orderRef).subscribe(result=>this.msg=result);

  }
  

}
