export class Customar {
    
    email: any;
    password: any;
    name: any;
    customer_id:any;
    dob: any;
    nationality: any;
    phone: any;
    address: any;
  


    constructor(customer_id:any, email: any, password: any, name: any, dob: any, nationality: any, phone: any, address: any) {
        this.customer_id = customer_id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.dob = dob;
        this.nationality = nationality;
        this.phone = phone;
        this.address = address;
        


    }
}
