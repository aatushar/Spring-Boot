import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Flight } from '../flight';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-newflightadd',
  templateUrl: './newflightadd.component.html',
  styleUrls: ['./newflightadd.component.css']
})
export class NewflightaddComponent {

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

constructor(private stservice: ServiceService,private router:Router){
  

}
saveFlight() {
  this.flight = new Flight(this.id,this.name,this.number,this.departure_time,this.arrival_time,this.flying_date,this.return_date,this.from_city,this.to_city,this.catagory,this.economy_price,
    this.business_price,this.photo,"NO","there is no package");
  this.stservice.insertFlight(this.flight).subscribe(data =>console.log( data),      
  )
    
  this.router.navigate(['Airlinesmanage'])
}

// submitflightadd() {
//   this.router.navigate(["Airlinesmanage"])
// }

}
