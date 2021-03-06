
export interface Customer {          // it use to map the json data. 
    
}
export class Customer{
    constructor(public custid?:number,
        public accnum?:number,
        public custname?:string,
        public password?:string,
        public debitnum?:number){}
}

