import { Component, OnInit } from '@angular/core';
import { Address } from '../address.model';
//import { Address } from 'cluster';
import { AddressService } from '../address.service';

@Component({
  selector: 'app-retrive-address',
  templateUrl: './retrive-address.component.html',
  styleUrls: ['./retrive-address.component.css']
})
export class RetriveAddressComponent implements OnInit {

  addressinfo:Array<Address>=[];
  flag:boolean = false;

  constructor(public addressSer:AddressService) { }

  ngOnInit(): void {
  }
  loadData(){
    this.flag=true;
    this.addressSer.loadAddressDetails().subscribe(data=>this.addressinfo=data);
  }

}
