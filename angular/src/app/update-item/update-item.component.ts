import { Component, OnInit } from '@angular/core';
import { ItemService } from '../item.service';

@Component({
  selector: 'app-update-item',
  templateUrl: './update-item.component.html',
  styleUrls: ['./update-item.component.css']
})
export class UpdateItemComponent implements OnInit {

  msg:string="";

  constructor(public itemSer:ItemService) { }

  ngOnInit(): void {
  }

  updateItem(itemInfo:any){
    this.itemSer.updateItemData(itemInfo).subscribe(data=>this.msg=data);
  }
}
