import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceService } from '../service.service';
import { Dashboard } from '../dashboard';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent {

  passenger_id: any;
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
  flight: any;



  constructor(private router: Router, private stservice: ServiceService, private route: ActivatedRoute) { }
  ngOnInit() {
    this.showTotalEarning();
  }

  showBookingList() {
    this.stservice.getBookingsById(this.passenger_id).subscribe(
      response => { this.booked = response }
    );
    // localStorage.setItem("bookingid",this.booked.bookingid);
  }
  citymanage() {
    this.router.navigate(["Citymanage"])
  }
  customarmanage() {
    this.router.navigate(["Customarmanage"])
  }
  airlinesmanage() {
    this.router.navigate(["Airlinesmanage"])
  }

  GetTicekt(bookingid: any) {
    // localStorage.setItem("bookingid",this.booked.bookingid);
    this.router.navigate(["Ticket", bookingid])

  }

  dashboard:Dashboard = new Dashboard();
  showTotalEarning() {
    let x=this.dashboard.totalEarning;
    this.stservice.getTotalEarnings(x).subscribe(
      response => { x = response}
    );
    console.log(x);
    
  }
  showusbEarning() {
    this.stservice.getUsbEarnings(this.dashboard.usbangla).subscribe(
      response => { this.dashboard.usbangla = response.usbangla }
    );
  }
  showbbEarning() {
    this.stservice.getbBangladeshEarnings(this.dashboard.bimanbangladesh).subscribe(
      response => { this.dashboard.bimanbangladesh = response.bimanbangladesh }
    );
  }
  shownovoEarning() {
    this.stservice.getnovoEarnings(this.dashboard.novoair).subscribe(
      response => { this.dashboard.novoair = response.novoair }
    );
  }

  chartOptions = {
    animationEnabled: true,
    title: {
      text: "Total Earnings"
    },
    data: [{
      type: "doughnut",
      yValueFormatString: "#,###.##'%'",
      indexLabel: "{name}",
      dataPoints: [
        { y: 60, name: "US BANGLA" },
        { y: 20, name: "NOVO AIR" },
        { y: 20, name: "BIMAN BANGLADESH" },
       
      ]
    }]
  }

}
