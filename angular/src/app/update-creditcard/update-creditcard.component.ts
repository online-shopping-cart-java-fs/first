import { Component, OnInit } from '@angular/core';
import { CreditcardService } from '../creditcard.service';

@Component({
  selector: 'app-update-creditcard',
  templateUrl: './update-creditcard.component.html',
  styleUrls: ['./update-creditcard.component.css']
})
export class UpdateCreditcardComponent implements OnInit {

  msg:string="";
  constructor(public creditcardSer:CreditcardService) { }

  ngOnInit(): void {
  }

  updateCreditcard(creditcardInfo:any){
    this.creditcardSer.updateCreditcardData(creditcardInfo).subscribe(data=>this.msg=data);
  }

}
