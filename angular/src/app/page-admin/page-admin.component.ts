import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartService } from '../cart.service';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-page-admin',
  templateUrl: './page-admin.component.html',
  styleUrls: ['./page-admin.component.css']
})
export class PageAdminComponent implements OnInit {

  productInfo:Array<ProductItem>=[];

  constructor(public cartSer:CartService,public productSer:ProductService,public router:Router) { }

  ngOnInit(): void {
    this.productSer.getProductData().subscribe(data=>this.productInfo=data);
  }

  storeCart(product:any){
    this.cartSer.storeToCart(product);
    this.router.navigate(["/customer/cart"])
  }
}
