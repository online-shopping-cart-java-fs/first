import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Item } from './item.model';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor(public httpClient:HttpClient) { }

  getItemData(): Observable<Item[]>{
    return this.httpClient.get<Item[]>("http://localhost:9191/admin/getAllItems")
  }

  storeItemData(itemRef:any):Observable<string>{
    return this.httpClient.post("http://localhost:9191/admin/storeItemData",itemRef,{responseType:'text'})
  }
   
  updateItemData(itemRef:any ):Observable<string>{
    return this.httpClient.put("http://localhost:9191/admin/updateItemData",itemRef,{responseType:'text'});
  }
   
  deleteItemData(itemid:any):Observable<string>{
   return this.httpClient.delete("http://localhost:9191/admin/deleteItemData/"+itemid,{responseType:'text'})
  }
   
}
