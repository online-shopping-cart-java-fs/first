import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(public httpClient:HttpClient) { }
  
  getCustomerByusername(user:any):Observable<any>{
    return this.httpClient.get("http://localhost:9191/home/getCustomer/"+user);
  }

  storeCustomerData(customerRef:any):Observable<string>{
    return this.httpClient.post("http://localhost:9191/user/storeCustomerData",customerRef,{responseType:'text'})
  }

  updateCustomerData(updateRef:any):Observable<string>{
    return this.httpClient.put("http://localhost:9191/user/updateCustomerData",updateRef,{responseType:'text'})
  }

  deleteCustomerData(username:any):Observable<string>{
    return this.httpClient.delete("http://localhost:9191/user/deleteCustomerData/"+username,{responseType:'text'})
   }
  
}
