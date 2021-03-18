import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-store-product',
  templateUrl: './store-product.component.html',
  styleUrls: ['./store-product.component.css']
})
export class StoreProductComponent implements OnInit {

  msg:string="";
  flag:boolean=false;
  
  productInfo = new FormGroup({
    pid:new FormControl(),
    pname:new FormControl(),
    price:new FormControl(),
    piid:new FormControl(),
    });

  constructor(public productSer:ProductService) { }

  ngOnInit(): void {
  }

  storeProduct() {
    let productRef = this.productInfo.value;
    this.flag=true;
    this.productSer.storeProductData(productRef).subscribe(result=>this.msg=result);
  }

}
