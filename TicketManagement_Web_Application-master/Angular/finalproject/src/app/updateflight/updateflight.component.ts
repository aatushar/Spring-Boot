import { Component } from '@angular/core';
import { ServiceService } from '../service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Flight } from '../flight';

@Component({
  selector: 'app-updateflight',
  templateUrl: './updateflight.component.html',
  styleUrls: ['./updateflight.component.css']
})
export class UpdateflightComponent {
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
  flight:any;
  return_date:any;
  offered:any;
  description:any;
  

  constructor(private stservice: ServiceService, private router: Router,private route: ActivatedRoute) { }
  ngOnInit(){
    let id = this.route.snapshot.params['id'];
    this.stservice.getFlightById(id).subscribe(data => {
      this.flight = data;
      this.id=this.flight.id;
      this.name=this.flight.name;
      this.number=this.flight.number;
      this.departure_time=this.flight.departure_time;
      this.arrival_time=this.flight.arrival_time;
      this.flying_date=this.flight.flying_date;
      this.from_city=this.flight.from_city;
      this.to_city=this.flight.to_city;
      this.catagory=this.flight.catagory;
      this.economy_price=this.flight.economy_price;
      this.business_price=this.flight.business_price;
      this.photo=this.flight.photo;
      this.offered=this.flight.offered;
      this.description=this.flight.description;
    });
  }
  updateFlight() {
    this.flight = new Flight(this.id,this.name,this.number,this.departure_time,this.arrival_time,this.flying_date,this.return_date,this.from_city,this.to_city,this.catagory,this.economy_price,
      this.business_price,this.photo,this.offered,this.description);
    this.stservice.updateflight(this.flight)
      .subscribe(
        data => console.log("success", data),
        
      )
    this.router.navigate(['Airlinesmanage'])
  }
  showpage() {
    this.router.navigate(["Airlinesmanage"])
  }

}
