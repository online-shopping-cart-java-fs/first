import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-delete-product',
  templateUrl: './delete-product.component.html',
  styleUrls: ['./delete-product.component.css']
})
export class DeleteProductComponent implements OnInit {

  msg:string="";

  constructor(public productSer:ProductService) { }

  ngOnInit(): void {
  }

  deleteProduct(pid:any){
    this.productSer.deleteProductData(pid).subscribe(result=>this.msg=result);
  }

}
