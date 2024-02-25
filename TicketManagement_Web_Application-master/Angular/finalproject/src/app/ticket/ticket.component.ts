import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['./ticket.component.css']
})
export class TicketComponent {
  //flight related
  id: any;
  name: any;
  number: any;
  catagory: any;
  economy_price: boolean = true;
  business_price: boolean = false;
  photo: any;
  class: any;


  //form related
  firstform: boolean = true;
  secondform: boolean = false;
  thirdform: boolean = false;
  forthform: boolean = false;
  fifthform: boolean = false;
  //extra needed variable
  ticket: any=[];
  nofpass: any;
  totalprice: any;
  passenger: any;
  bookinginfo: any;
  allSeats: any;
  price: any;
  customer_id: any;
  password: any;
  dob: any;
  nationality: any;
  address: any;
  phone: any;

  //booking related and some of flight related
  bookingid: any;
  passanger_id: any;
  passanger_name: any;
  email: any
  flight_number: any;
  flight_name: any;
  from_city: any;
  to_city: any;
  flying_date: any;
  classcatagory: any;
  seat: any;
  gate: any;
  departure_time: any;
  arrival_time: any;
  booking_date: any;
  total_amount: any;
  refundable_amount: any;
  cancel_date: any;
  status: any;
  counter: any;
  numberOfBooking: any;
  return_date: any;
  allBookedflight: any = [];
  trip_type: any;
  one_way: boolean = false;
  round_trip: boolean = false;

  constructor(private router: Router, private stservice: ServiceService, private route: ActivatedRoute){}

  ngOnInit(){
    let bookingid = this.route.snapshot.params['bookingid'];
    this.stservice.getTicketById(bookingid).subscribe(data => {
      console.log(data); 
      this.ticket = data;
      this.name=this.ticket.flight_name;
      this.number=this.ticket.flight_number;
      this.departure_time=this.ticket.departure_time;
      this.arrival_time=this.ticket.arrival_time;
      this.flying_date=this.ticket.flying_date;
      this.from_city=this.ticket.from_city;
      this.to_city=this.ticket.to_city;
      this.passanger_name=this.ticket.passanger_name;

    });
  }
  printTicket(){
    window.print();
  }

}
