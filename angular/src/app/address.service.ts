import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { Address } from './address.model';

@Injectable({
  providedIn: 'root'
})
export class AddressService {
  abc:string="Info";

  constructor(public httpClient:HttpClient) { }

  loadAddressDetails():Observable<Address[]>{
    return this.httpClient.get<Address[]>("http://localhost:9191/user/getAddressData")
  }
  storeAddressInfo(addressRef:any):Observable<string>{
    return this.httpClient.post("http://localhost:9191/user/storeAddressData",addressRef,{responseType:"text"})
  }
  updateAddressInfo(addressRef:any):Observable<string>{
    return this.httpClient.put("http://localhost:9191/user/updateAddressData",addressRef,{responseType:"text"})
  }
  deleteAddressInfo(addId:any):Observable<string>{
    return this.httpClient.delete("http://localhost:9191/user/deleteAddressData/"+addId,{responseType:"text"})
  }
}
