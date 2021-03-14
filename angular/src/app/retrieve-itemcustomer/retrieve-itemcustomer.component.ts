import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Item } from '../item.model';
import { ItemService } from '../item.service';

@Component({
  selector: 'app-retrieve-itemcustomer',
  templateUrl: './retrieve-itemcustomer.component.html',
  styleUrls: ['./retrieve-itemcustomer.component.css']
})
export class RetrieveItemcustomerComponent implements OnInit {

  itemInfo:Array<Item>=[];

  constructor(public router:Router,public itemSer:ItemService) { }

  ngOnInit(): void {
    this.itemSer.getItemData().subscribe(data=>this.itemInfo=data);
  }

}
