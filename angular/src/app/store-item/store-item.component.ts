import { Component, OnInit } from '@angular/core';
import { ItemService } from '../item.service';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-store-item',
  templateUrl: './store-item.component.html',
  styleUrls: ['./store-item.component.css']
})
export class StoreItemComponent implements OnInit {

  msg:string="";
  itemInfo = new FormGroup({
    itemid:new FormControl(),
    itemname:new FormControl()
    });

  constructor(public itemSer:ItemService) { }

  ngOnInit(): void {
  }

  storeItem() {
    let itemRef = this.itemInfo.value;
    this.itemSer.storeItemData(itemRef).subscribe(result=>this.msg=result);
  }
}
