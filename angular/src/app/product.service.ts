import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Product } from "./product.model";
import { ProductItem } from "./productitem.model";

@Injectable({
    providedIn: 'root'
  })

  export class ProductService {
  
    constructor(public httpClient:HttpClient) { }
  
    getProductData():Observable<ProductItem[]>{
      return this.httpClient.get<ProductItem[]>("http://localhost:9191/admin/getAllProducts")
    }

    getProductById(pid:any):Observable<any>{
      return this.httpClient.get("http://localhost:9191/user/getProduct/"+pid);
    }

    getProductDataById(itemid:any):Observable<ProductItem[]>{
      return this.httpClient.get<ProductItem[]>("http://localhost:9191/admin/getAllProductsByCategory/"+itemid);
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
  