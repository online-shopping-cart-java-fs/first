import { Component, OnInit } from '@angular/core';
import { CreditcardService } from '../creditcard.service';

@Component({
  selector: 'app-delete-creditcard',
  templateUrl: './delete-creditcard.component.html',
  styleUrls: ['./delete-creditcard.component.css']
})
export class DeleteCreditcardComponent implements OnInit {

  msg:string="";
  constructor(public creditcardSer:CreditcardService) { }

  ngOnInit(): void {
  }

 
  deleteCreditcard(creditCardNum:any){
    this.creditcardSer.deleteCreditcardData(creditCardNum).subscribe(result=>this.msg=result);
  }

}
