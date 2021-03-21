import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CartService } from '../cart.service';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-retrieve-productbyidcustomer',
  templateUrl: './retrieve-productbyidcustomer.component.html',
  styleUrls: ['./retrieve-productbyidcustomer.component.css']
})
export class RetrieveProductbyidcustomerComponent implements OnInit {

  itemid:any;
  msg:string=""
  //productRef= new Product();
  productRef:Array<ProductItem>=[];

  constructor(public router:Router,private route:ActivatedRoute,public cartSer:CartService,public productSer:ProductService) { }

  ngOnInit(): void {

    this.route.paramMap.subscribe(params=>{
      this.itemid=params.get('itemid');
      this.productSer.getProductDataById(this.itemid).subscribe(data=> {
        if(data==null){
        this.msg = "No products under this category";
        }else {
          this.msg = "";
          this.productRef=data;        
        }
      })
      })
  }

  storeCart(product:any){
    this.cartSer.storeToCart(product);
    this.router.navigate(["/customer/cart"])
  }

}
