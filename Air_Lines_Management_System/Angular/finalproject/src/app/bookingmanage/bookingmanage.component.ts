import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-bookingmanage',
  templateUrl: './bookingmanage.component.html',
  styleUrls: ['./bookingmanage.component.css']
})
export class BookingmanageComponents {
  passanger_name: any;
  flight_number: any;
  flight_name: any;
   from_city: any;
  to_city: any;
  flying_date: any;
  classcatagory: any;
  seat: any;
  gate: any;
  passanger_no: any;
  booking_date: any;
  departure_time: any;
  arrival_time: any;
  total_amount: any;
  bookingid: any;
  booked:any;
  status:any;
  constructor( private router:Router,private stservice:ServiceService,private route:ActivatedRoute){
    //this.showFlight();
  }
  ngOnInit(){
    this.showBookingList();
  }
  showBookingList() {
    this.stservice.getbookinginfo().subscribe(
        response => { this.booked = response }
      );
  }

  updateBookingConfirmStatus(bookingid: any) {
    this.stservice.updateBookingStatus(bookingid).subscribe((response) => {
      console.log("success");
      
    })

}
}
