import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from "./customer.model";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(public httpClient:HttpClient) { }
  checkCustomer(userRef:any):Observable<Customer[]>{
     return this.httpClient.get<Customer[]>("http://localhost:9191/admin/getAllCustomerData")
     
  }
  storeCustomerInfo(customerRef:any):Observable<string>{
    return this.httpClient.post("http://localhost:9191/user/storeCustomerData",customerRef,{responseType:'text'})
    }

    updateCustomerInfo(customerRef:any):Observable<string>{
      return this.httpClient.put("http://localhost:9191/user/updateCustomerData",customerRef,{responseType:'text'})
    }
  
}
