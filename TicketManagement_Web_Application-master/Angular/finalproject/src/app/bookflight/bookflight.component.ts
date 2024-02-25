import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceService } from '../service.service';
import { Flight } from '../flight';
import { Bookinginfo } from '../bookinginfo';
import { Customar } from '../customar';


@Component({
  selector: 'app-bookflight',
  templateUrl: './bookflight.component.html',
  styleUrls: ['./bookflight.component.css']
})
export class BookflightComponent {
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
  flight: any;
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
  //seat related
  a1: boolean = false;
  a2: boolean = false;
  b1: boolean = false;
  b2: boolean = false;
  c1: boolean = false;
  c2: boolean = false;
  d1: boolean = false;
  d2: boolean = false;
  e1: boolean = false;
  e2: boolean = false;
  constructor(private stservice: ServiceService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit() {

    let from_city = this.route.snapshot.params['from_city'];
    let to_city = this.route.snapshot.params['to_city'];
    let flying_date = this.route.snapshot.params['flying_date'];
    this.stservice.search(from_city, to_city, flying_date).subscribe(data => {
      console.log(data);
      this.flight = data;
      this.id = this.flight.id;
      this.name = this.flight.name;
      this.number = this.flight.number;
      this.departure_time = this.flight.departure_time;
      this.arrival_time = this.flight.arrival_time;
      this.flying_date = this.flight.flying_date;
      this.return_date = this.flight.return_date;
      this.from_city = this.flight.from_city;
      this.to_city = this.flight.to_city;
      this.catagory = this.flight.catagory;
      this.economy_price = this.flight.economy_price;
      this.business_price = this.flight.business_price;
      this.photo = this.flight.photo;
      // this.getpassinfo();

    });

    this.trip_type = localStorage.getItem('trip_type')
  }
  seatprice(class1: any) {
    if (localStorage.getItem('trip_type') == 'one_way') {
      if (class1 == "economy") {
        this.price = this.flight.economy_price
        this.totalprice = parseInt(this.price);
      } else {
        this.price = this.flight.business_price
        this.totalprice = parseInt(this.price);
      }
    } else {
      if (class1 == "economy") {
        this.price = this.flight.economy_price
        this.totalprice = parseInt(this.price) * 2;
      } else {
        this.price = this.flight.business_price
        this.totalprice = parseInt(this.price) * 2;
      }
    }


  }

  next(name: any) {
    this.firstform = false;
    this.secondform = false;
    this.thirdform = false;
    this.forthform = false;

    if (name == 'firstform') {
      // if(this.one_way){
      //   this.return_date=false;
      // }if(this.round_trip){
      //   
      // }
      this.firstform = true;
    }
    if (name == 'secondform') {

      this.secondform = true;
    }
    if (name == 'thirdform') {
      this.thirdform = true;
      this.stservice.checkAllBookedSeat(this.number, this.flying_date, this.flying_date).subscribe(res => {
        this.allBookedflight = res;
        console.log(this.allBookedflight);
      })
    }
    if (name == 'forthform') {
      let s = this.seat;
      let fnumber = this.number;
      let fly = this.flying_date;
      let returnday = this.flying_date;
      let fCity = this.from_city;
      let tCity = this.to_city;
      this.stservice.checkSeat(fnumber, s, fCity, tCity, fly, returnday).subscribe((ava) => {
        console.log(ava);       
        if (ava) {
          this.forthform = true;
        } else {
          this.secondform = true;
          alert("This seat is not available")
        }
      })
    }
    if (name == 'fifthform') {

      this.stservice.getNumberOfBookings(this.passanger_id).subscribe((data) => {
        this.numberOfBooking = data;
        console.log(data);
       
          if (this.numberOfBooking >= 8) {
            this.total_amount = parseInt(this.totalprice) - parseInt(this.totalprice) * .15;
          }
          else if (this.numberOfBooking >= 6) {
            this.total_amount = parseInt(this.totalprice) - parseInt(this.totalprice) * .10;
          }
          else if (this.numberOfBooking >= 3) {
            this.total_amount = parseInt(this.totalprice) - parseInt(this.totalprice) * .05;
          } else if (this.numberOfBooking < 3) {
            this.total_amount = parseInt(this.totalprice);
          }
        
        
      });
      this.fifthform = true;
    }
  }

  gotopaymentsystem() {
    this.router.navigate(["Paymentsystem"])
  }
  invoiceinsert() {
    if (localStorage.getItem('trip_type') == 'one_way') {
      this.bookinginfo = new Bookinginfo(this.bookingid, this.passanger_id, this.passanger_name, this.email, this.number, this.name, this.from_city, this.to_city, this.flying_date, 'null', this.classcatagory, this.seat, this.gate, this.departure_time, this.arrival_time, this.booking_date,
        this.total_amount, "Pending", this.cancel_date, this.refundable_amount);
      this.stservice.insertBookinginfo(this.bookinginfo).subscribe(data => console.log(data)
      )
      alert("Thank You Dear Customer.Your Booking Request Is Under Process")
    }
    else {
      this.bookinginfo = new Bookinginfo(this.bookingid, this.passanger_id, this.passanger_name, this.email, this.number, this.name, this.from_city, this.to_city, this.flying_date, this.return_date, this.classcatagory, this.seat, this.gate, this.departure_time, this.arrival_time, this.booking_date,
        this.total_amount, "Pending", this.cancel_date, this.refundable_amount);
      this.stservice.insertBookinginfo(this.bookinginfo).subscribe(data => console.log(data)
      )
      alert("Thank You Dear Customer.Your Booking Request Is Under Process")
    }


    // if(this.counter<=0){
    //   this.total_amount = parseInt(this.totalprice) + (parseInt(this.totalprice) * .15);
    // } else if(this.counter<=4){
    //   this.total_amount = parseInt(this.totalprice) + (parseInt(this.totalprice) * .15)-(parseInt(this.totalprice) * .5);
    // }else if(this.counter<=6){
    //   this.total_amount = parseInt(this.totalprice) + (parseInt(this.totalprice) * .15)-(parseInt(this.totalprice) * .10);
    // }  
  }





  getpassinfo() {
    console.log(this.passanger_id);
    this.stservice.getcustomarById(this.passanger_id).subscribe(data => {
      console.log(data);
      this.passanger_name = data.name;
      this.email = data.email;
    });
  }

  isBooked(seat: any): boolean {
    console.log(this.allBookedflight);
    for (let a of this.allBookedflight) {
      if (a.seat == seat) {
        return true;
      }
    }
    return false;
  }
}
