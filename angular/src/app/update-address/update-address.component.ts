import { Component, OnInit } from '@angular/core';
import { AddressService } from '../address.service';

@Component({
  selector: 'app-update-address',
  templateUrl: './update-address.component.html',
  styleUrls: ['./update-address.component.css']
})
export class UpdateAddressComponent implements OnInit {
  msg:string="";

  constructor(public addressSer:AddressService) { }

  ngOnInit(): void {
  }
  updateAddressInfo(addressInfo:any){
    this.addressSer.updateAddressInfo(addressInfo).subscribe(data=>this.msg=data);
  }

}
