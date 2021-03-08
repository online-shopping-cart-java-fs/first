import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-page-home',
  templateUrl: './page-home.component.html',
  styleUrls: ['./page-home.component.css']
})
export class PageHomeComponent implements OnInit {

  productInfo:Array<ProductItem>=[];

  constructor(public productSer:ProductService,public router:Router) { }

  ngOnInit(): void {
    this.productSer.getProductData().subscribe(data=>this.productInfo=data);
  }

}
