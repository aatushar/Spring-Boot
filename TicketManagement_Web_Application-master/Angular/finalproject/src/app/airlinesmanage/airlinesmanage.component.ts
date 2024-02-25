import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceService } from '../service.service';
import { Flight } from '../flight';

@Component({
  selector: 'app-airlinesmanage',
  templateUrl: './airlinesmanage.component.html',
  styleUrls: ['./airlinesmanage.component.css']
})
export class AirlinesmanageComponent {
  flight:any;
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
  flights:any;
  return_date:any;
  offered:any;
  description:any;


  constructor( private router:Router,private stservice:ServiceService,private route:ActivatedRoute){
    //this.showFlight();
  }
  ngOnInit(){
    this.showFlight();
  }

  newflightadd() {
    this.router.navigate(["Newflightadd"])
  }
  showFlight() {
    this.stservice.getFlight()
      .subscribe(
        response => { this.flight = response }
      );
  }

  updatepage(id: any) {
    this.router.navigate(["Update", id]);
  }

  delflight(id:any) {
    console.log(id);
    this.flight = new Flight(this.id,this.name,this.number,this.departure_time,this.arrival_time,this.flying_date,this.return_date,this.from_city,this.to_city,this.catagory,this.economy_price,
      this.business_price,this.photo,this.offered,this.description);
    this.stservice.deleteFlight(this.flight)
      .subscribe(
        ( data: any) => console.log("success", data),
       
      );
      this.showFlight();
      this.router.navigate(["Airlinesmanage"]);      

  }

}
