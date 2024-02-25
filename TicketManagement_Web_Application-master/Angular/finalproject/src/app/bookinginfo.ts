import { EmailValidator } from "@angular/forms";

export class Bookinginfo {
   passanger_name: any;
   flight_number: any; flight_name: any;
   from_city: any;
   to_city: any;
   flying_date: any;
   return_date: any;
   classcatagory: any;
   seat: any; gate: any;
   passanger_id: any;
   booking_date: any;
   departure_time: any;
   arrival_time: any;
   total_amount: any;
   email:any;
   bookingid: any;
   status:any;
   cancel_date:any;
   refundable_amount:any;
   

  


   constructor(bookingid:any,passanger_id:any,passanger_name:any,email:any,flight_number:any, flight_name:any,from_city:any, to_city:any, flying_date:any,return_date: any, classcatagory:any, seat:any, gate:any,departure_time:any, arrival_time:any,  booking_date:any, 
      total_amount:any,status:any,cancel_date:any,refundable_amount:any) {
      this.bookingid = bookingid;
      this.passanger_id = passanger_id;
      this.passanger_name = passanger_name;
      this.email = email;
      this.flight_number = flight_number;
      this.flight_name = flight_name;
      this.from_city = from_city;
      this.to_city = to_city;
      this.flying_date = flying_date;
      this.return_date = return_date;
      this.classcatagory = classcatagory;
      this.seat = seat;
      this.gate = gate;
      this.departure_time = departure_time;
      this.arrival_time = arrival_time;
      this.booking_date = booking_date;
      this.total_amount = total_amount;
      this.status = status;
      this.cancel_date = cancel_date;
      this.refundable_amount = refundable_amount;
      
      
   }
}
