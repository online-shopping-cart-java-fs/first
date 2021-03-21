import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cart } from '../cart.model';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-storeto-cart',
  templateUrl: './storeto-cart.component.html',
  styleUrls: ['./storeto-cart.component.css']
})
export class StoretoCartComponent implements OnInit {

  cart:any;
  constructor(public router:Router,public cartSer:CartService) { }

  ngOnInit(): void {
    this.cart=this.cartSer.getFromCart();  
  }

  remove(pi:any){
    this.cart=this.cartSer.removeFromCart();
  }

  checkout(){
    this.router.navigate(["/customer/orderdetails"])
  }
}
