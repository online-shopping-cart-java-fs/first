import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CreditCard} from './creditcard.model';

@Injectable({
  providedIn: 'root'
})
export class CreditcardService {

  constructor(public httpClient:HttpClient) { }

  storeCreditcardData(ccRef:any):Observable<string>{
    return this.httpClient.post("http://localhost:9191/user/storeCreditCardData",ccRef,{responseType:'text'})
  }

  updateCreditcardData(creditcardRef:any ):Observable<string>{
    return this.httpClient.put("http://localhost:9191/user/updateCreditCardData",creditcardRef,{responseType:'text'});
  }

  deleteCreditcardData(creditCardNum:any):Observable<string>{
    return this.httpClient.delete("http://localhost:9191/user/deleteCreditCardData/"+creditCardNum,{responseType:'text'})
  }
}
