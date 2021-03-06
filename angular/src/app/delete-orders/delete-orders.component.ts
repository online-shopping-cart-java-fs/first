import { Component, OnInit } from '@angular/core';
import { OrdersService } from '../orders.service';


@Component({
  selector: 'app-delete-orders',
  templateUrl: './delete-orders.component.html',
  styleUrls: ['./delete-orders.component.css']
})
export class DeleteOrdersComponent implements OnInit {
  msg:string="";
  constructor(public orderSer:OrdersService) { }

  ngOnInit(): void {
  }
  deleteOrder(orderid:any){
    this.orderSer.deleteOrderData(orderid).subscribe(result=>this.msg=result);
  }

}
