import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-mybooking',
  templateUrl: './mybooking.component.html',
  styleUrls: ['./mybooking.component.css']
})
export class MybookingComponent {



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
  booked: any = [];


  constructor(private router: Router, private stservice: ServiceService, private route: ActivatedRoute) { }

  // ngOnInit() {
  //   this.showBookingList();
  // }
  showBookingList() {
    this.stservice.getbookinginfo().subscribe(
      response => { this.booked = response }
    );
    // localStorage.setItem("bookingid",this.booked.bookingid);
  }

  ngOnInit() {

    let customer_id!: string;
    customer_id = localStorage.getItem('customer_id')!;
    console.log(customer_id);
    this.stservice.getMyBookingDetails(customer_id).subscribe(data => {
      console.log(data);
      this.booked = data;
      console.log(this.booked);
    });



  }
  // updateStudent1(){
  // this.student=new Student1(this.id,this.userid,this.serial,this.name,this.age,this.gender,this.address,
  //   this.specialist,this.blood,this.phone,this.date,this.fee,this.consultant);
  //   this.stservice.appointmentByUserId(this.student)
  //   .subscribe(
  //     data => console.log("success",data),
  //   )
  //   alert("Appointment Successful");
  // }
  GetTicekt(bookingid: any) {
    // localStorage.setItem("bookingid",this.booked.bookingid);
    this.router.navigate(["Ticket", bookingid])

  }

  cancelrequest(bookingid: any) {
    this.stservice.cancelRequest(bookingid).subscribe((response) => {
      console.log(bookingid);

    })

  }

}




