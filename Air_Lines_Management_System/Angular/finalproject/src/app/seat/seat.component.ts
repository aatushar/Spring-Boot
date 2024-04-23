import { Component } from '@angular/core';
import { ServiceService } from '../service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-seat',
  templateUrl: './seat.component.html',
  styleUrls: ['./seat.component.css']
})
export class SeatComponent {
  a1: boolean = true;
  a2: boolean = false;
  b1: boolean = false;
  b2: boolean = false;
  c1: boolean = false;
  c2: boolean = false;
  d1: boolean = false;
  d2: boolean = false;
  e1: boolean = false;
  e2: boolean = false;


  name: any;
  number: any;
  departure_time: any;
  arrival_time: any;
  flying_date: any;
  from_city: any;
  to_city: any;
  classcatagory: any;
  economy_price: any;
  business_price: any;
  photo: any;
  book: any;
  booking_date: any;
  booked: any=[];

  constructor(private stservice: ServiceService, private router: Router) { }

  // check(){
  //   if(this.a1){   

  //   }
  // }
}
