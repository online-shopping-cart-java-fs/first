import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-delete-product',
  templateUrl: './delete-product.component.html',
  styleUrls: ['./delete-product.component.css']
})
export class DeleteProductComponent implements OnInit {

  msg:string="";
  flag:boolean=false;

  constructor(public productSer:ProductService) { }

  ngOnInit(): void {
  }

  deleteProduct(pid:any){
    this.flag=true;
    this.productSer.deleteProductData(pid).subscribe(result=>this.msg=result);
  }

}
