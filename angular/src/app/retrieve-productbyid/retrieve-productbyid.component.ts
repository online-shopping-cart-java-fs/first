import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-retrieve-productbyid',
  templateUrl: './retrieve-productbyid.component.html',
  styleUrls: ['./retrieve-productbyid.component.css']
})
export class RetrieveProductbyidComponent implements OnInit {

  itemid:any;
  msg:string=""
  //productRef= new Product();
  productRef:Array<ProductItem>=[];
  constructor(private route:ActivatedRoute,public productSer:ProductService) {

   }

  ngOnInit(): void {
  this.route.paramMap.subscribe(params=>{
    this.itemid=params.get('item.itemid');
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

}
