import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../product.model';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  productInfo:Array<Product>=[];

  constructor(public productSer:ProductService,public router:Router) { }

  ngOnInit(): void {
   this.productSer.getProductData().subscribe(data=>this.productInfo=data);
  }

}
