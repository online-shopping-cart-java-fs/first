import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Orders } from './orders.model';
//import { Orders} from './creditcard.model';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

  constructor(public httpClient:HttpClient) { }
  getOrderData():Observable<Orders[]>{
    return this.httpClient.get<Orders[]>("http://localhost:9191/admin/getOrderInfo")
  
  }

  storeOrderData(orderRef:any):Observable<string>{
    return this.httpClient.post("http://localhost:9191/user/storeOrderInfo",orderRef,{responseType:'text'})
  }
  deleteOrderData(orderid:any):Observable<string>{
    return this.httpClient.delete("http://localhost:9191/user/deleteOrderInfo/"+orderid,{responseType:'text'})
  }
}
