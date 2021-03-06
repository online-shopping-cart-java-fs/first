import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Product } from "./product.model";

@Injectable({
    providedIn: 'root'
  })

  export class ProductService {
  
    constructor(public httpClient:HttpClient) { }
  
    getProductData(): Observable<Product[]>{
      return this.httpClient.get<Product[]>("http://localhost:9191/admin/getAllProducts")
    }
  
    storeProductData(prodRef:any):Observable<string>{
      return this.httpClient.post("http://localhost:9191/admin/storeProductData",prodRef,{responseType:'text'})
    }
     
    updateProductData(prodRef:any ):Observable<string>{
      return this.httpClient.put("http://localhost:9191/admin/updateProductData",prodRef,{responseType:'text'});
    }
     
    deleteProductData(pid:any):Observable<string>{
     return this.httpClient.delete("http://localhost:9191/admin/deleteProductData/"+pid,{responseType:'text'})
    }
     
  }
  