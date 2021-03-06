import { Component, OnInit } from '@angular/core';
import { AddressService } from '../address.service';

@Component({
  selector: 'app-delete-address',
  templateUrl: './delete-address.component.html',
  styleUrls: ['./delete-address.component.css']
})
export class DeleteAddressComponent implements OnInit {
  msg:string="";

  constructor(public addressSer:AddressService) { }

  ngOnInit(): void {
  }
  deleteAddress(addId:any){
    this.addressSer.deleteAddressInfo(addId).subscribe(result=>this.msg=result);
  }

}
