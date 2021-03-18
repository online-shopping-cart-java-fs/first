import { Component, OnInit } from '@angular/core';
import { ItemService } from '../item.service';


@Component({
  selector: 'app-delete-item',
  templateUrl: './delete-item.component.html',
  styleUrls: ['./delete-item.component.css']
})
export class DeleteItemComponent implements OnInit {

  msg:string="";
  flag:boolean=false;

  constructor(public itemSer:ItemService) { }

  ngOnInit(): void {
  }

  deleteItem(itemid:any){
    this.flag=true;
    this.itemSer.deleteItemData(itemid).subscribe(result=>this.msg=result);
  }

}
