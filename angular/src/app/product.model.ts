/*export interface Product {          // it use to map the json data. 
    pid:number;
    pname:string;
    price:number;
    piid:number;
} */

export class Product {
    constructor(
        public pid?:number,
        public pname?:string,
        public price?:number,
        public piid?:number,
        ){}
} 
