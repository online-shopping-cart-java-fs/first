import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Orders } from './orders.model';
import { CustomerOrders } from './customerorders.model';
//import { Orders} from './creditcard.model';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

  constructor(public httpClient:HttpClient) { }
  
  getOrdersByCustomer(username:any):Observable<CustomerOrders[]>{
    return this.httpClient.get<CustomerOrders[]>("http://localhost:9191/user/getAllOrdersByCustomer/"+username);
  }

  storeOrderData(orderRef:any):Observable<string>{
    return this.httpClient.post("http://localhost:9191/user/storeOrderData",orderRef,{responseType:'text'})
  }

  deleteOrderData(orderid:any):Observable<string>{
    return this.httpClient.delete("http://localhost:9191/user/deleteOrderData/"+orderid,{responseType:'text'})
  }
}
