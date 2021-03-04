import { Component, OnInit } from '@angular/core';
import { Item } from '../item.model';
import { ItemService } from '../item.service';

@Component({
  selector: 'app-retrieve-item',
  templateUrl: './retrieve-item.component.html',
  styleUrls: ['./retrieve-item.component.css']
})
export class RetrieveItemComponent implements OnInit {

  itemInfo:Array<Item>=[];
  flag:boolean = false;

  constructor(public itemSer:ItemService) { }

  ngOnInit(): void {
  }

  getAllItems() {
    this.flag=true;
    this.itemSer.getItemData().subscribe(data=>this.itemInfo=data);
  }

}
