import { Component, OnInit } from '@angular/core';
import { ItemService } from '../item.service';

@Component({
  selector: 'app-update-item',
  templateUrl: './update-item.component.html',
  styleUrls: ['./update-item.component.css']
})
export class UpdateItemComponent implements OnInit {

  msg:string="";
  flag:boolean=false;

  constructor(public itemSer:ItemService) { }

  ngOnInit(): void {
  }

  updateItem(itemInfo:any){
    this.flag=true;
    this.itemSer.updateItemData(itemInfo).subscribe(data=>this.msg=data);
  }
}
