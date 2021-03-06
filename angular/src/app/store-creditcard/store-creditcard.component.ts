import { Component, OnInit } from '@angular/core';
import { CreditcardService } from '../creditcard.service';
import { FormControl, FormGroup } from '@angular/forms';


@Component({
  selector: 'app-store-creditcard',
  templateUrl: './store-creditcard.component.html',
  styleUrls: ['./store-creditcard.component.css']
})
export class StoreCreditcardComponent implements OnInit {

  msg:string="";
  creditcardInfo = new FormGroup({
    custId:new FormControl(),
    creditCardNum:new FormControl(),
    accNum:new FormControl(),
    password:new FormControl(),
    debitCardNum:new FormControl()
    });

  constructor(public creditcardSer:CreditcardService) { }

  ngOnInit(): void {
  }

  storeCreditcard(){
    let ccRef = this.creditcardInfo.value;
    this.creditcardSer.storeCreditcardData(ccRef).subscribe(result=>this.msg=result);
  }

}
