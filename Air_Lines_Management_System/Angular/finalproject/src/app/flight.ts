export class Flight {

    id: any;
    name: any;
    number: any;
    departure_time: any;
    arrival_time: any;
    flying_date: any;
    from_city: any;
    to_city: any;
    catagory: any;
    economy_price: any;
    business_price: any;
    photo: any;
    return_date:any;
    offered:any;
    description:any;

    constructor(id:any,name:any,number:any,departure_time:any,arrival_time:any,flying_date:any,return_date:any,from_city:any,to_city:any,catagory:any,economy_price:any,business_price:any,photo:any,offered:any, description:any){
        this.id=id;
        this.name=name;
        this.number=number;
        this.departure_time=departure_time;
        this.arrival_time=arrival_time;
        this.flying_date=flying_date;
        this.return_date=return_date;
        this.from_city=from_city;
        this.to_city=to_city;
        this.catagory=catagory;
        this.economy_price=economy_price;
        this.business_price=business_price;
        this.photo=photo;
        this.offered = offered;
		this.description = description;
    }
}
