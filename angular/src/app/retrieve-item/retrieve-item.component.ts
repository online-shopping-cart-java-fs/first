import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Item } from '../item.model';
import { ItemService } from '../item.service';

@Component({
  selector: 'app-retrieve-item',
  templateUrl: './retrieve-item.component.html',
  styleUrls: ['./retrieve-item.component.css']
})
export class RetrieveItemComponent implements OnInit {

  itemInfo:Array<Item>=[];

  constructor(public router:Router,public itemSer:ItemService) { }

  ngOnInit(): void {
    this.itemSer.getItemData().subscribe(data=>this.itemInfo=data);
  }

}
