import { Component } from '@angular/core';
import { ServiceService } from '../service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Flight } from '../flight';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  id: any;
  name: any;
  number: any;
  photo: any;
  flight: any = [];
  fromcitylist: any = [];
  tocityList: any = [];

  one_way: boolean = false;
  round_trip: boolean = false;

  departure_time: any;
  arrival_time: any;
  flying_date: any;
  return_date: any;
  from_city: any;
  to_city: any;
  catagory: any;
  economy_price: any;
  business_price: any;

  //form related
  firstform: boolean = true;
  secondform: boolean = false;
  thirdform: boolean = false;
  forthform: boolean = false;
  fifthform: boolean = false;

  searchid() {
    
    if (this.one_way) {
      this.router.navigate(["Bookflight", this.from_city, this.to_city, this.flying_date]);     
    }
    if (this.round_trip) {
      this.router.navigate(["Bookflight", this.from_city, this.to_city, this.flying_date, this.return_date]);
      this.return_date = true;
    }

  }




  constructor(private stsservice: ServiceService, private router: Router, private route: ActivatedRoute) {

  }



  ngOnInit() {
    this.showFlight();
    this.fromCitylist();
    this.toCityList();
    // this.flyingDate(this.from_city,this.to_city);
  }

  // updateSt(id:any) {
  //   this.router.navigate(['update',id])
  // }

  showFlight() {

    this.stsservice.getFlight().subscribe((response: any) => { this.flight = response });
  }

  go(id: any) {
    this.router.navigate(["Showdetails", id]);
  }

  // insertPage() {
  //   this.router.navigate(['insert']);
  // }


  // delStudent(id:any) {
  //   this.flight = new Flight(id, this.name, this.number, this.round);
  //   this.stsservice.deleteStudent(this.student).subscribe((data: any) => {console.log("success", data),this.showStudents();})
  //   this.router.navigate(['product']);
  // }

  data(value: any) {

    this.id = this.flight[value].id
    this.name = this.flight[value].name
    this.number = this.flight[value].number
    this.photo = this.flight[value].photo
  }


  fromCitylist() {
    this.fromcitylist = [];
    this.stsservice.getFromcityList().subscribe(data => {
      console.log(data);

      this.fromcitylist = data;
    })
  }

  toCityList() {
    this.tocityList = [];
    this.stsservice.getTocityList().subscribe(data => {
      console.log(data);
      this.tocityList = data;
    })
  }

  flight1: any;
  searchdate() {
    this.one_way = true;
    this.round_trip = false;
    this.stsservice.DateSearch(this.from_city, this.to_city).subscribe(data => {
      console.log(data);
      this.flight1 = data;
      this.flying_date = data.flying_date;
      this.return_date = '';
      localStorage.setItem('trip_type', "one_way");
    })
  }

  ReturningDate() {
    // this.one_way = false;
    // this.round_trip = true;
    // this.stsservice.DateSearch(this.to_city, this.from_city).subscribe(data => {
    //   console.log(data);
     
    // })
    localStorage.setItem('trip_type', "round_trip");
    this.return_date = this.flight1.return_date;
  }

}



