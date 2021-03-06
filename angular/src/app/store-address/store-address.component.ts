import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { AddressService } from '../address.service';

@Component({
  selector: 'app-store-address',
  templateUrl: './store-address.component.html',
  styleUrls: ['./store-address.component.css']
})
export class StoreAddressComponent implements OnInit {
  addressInfo=new FormGroup({
    addId:new FormControl(),
    streetName:new FormControl(),
    city:new FormControl(),
    state:new FormControl(),
    pin:new FormControl(),
    custId:new FormControl()
  });
  msg:string="";

  constructor(public addressser:AddressService) { }

  ngOnInit(): void {
  }
  storeAddressDetails(){
    let addressRef=this.addressInfo.value;
    this.addressser.storeAddressInfo(addressRef).subscribe(result=>this.msg=result);
  }

}
