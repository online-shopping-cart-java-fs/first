import { Injectable } from "@angular/core";

@Injectable({
    providedIn: 'root'
  })

  export class CartService {

    cart:Array<string>=[];
    constructor() { }
  
    storeToCart(product:any){
      this.cart.push(product);
    }

    getFromCart(){
      return this.cart;
    }

    removeFromCart(){
      this.cart=[];
      //this.cart.pop(item)
      return this.cart;
    }
     
  }
  