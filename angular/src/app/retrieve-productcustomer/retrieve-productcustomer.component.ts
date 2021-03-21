import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartService } from '../cart.service';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-retrieve-productcustomer',
  templateUrl: './retrieve-productcustomer.component.html',
  styleUrls: ['./retrieve-productcustomer.component.css']
})
export class RetrieveProductcustomerComponent implements OnInit {

  productInfo:Array<ProductItem>=[];

  constructor(public router:Router,public cartSer:CartService,public productSer:ProductService) { }

  ngOnInit(): void {
    this.productSer.getProductData().subscribe(data=>this.productInfo=data);
  }

  storeCart(product:any){
    this.cartSer.storeToCart(product);
    this.router.navigate(["/customer/cart"])
  }

}
