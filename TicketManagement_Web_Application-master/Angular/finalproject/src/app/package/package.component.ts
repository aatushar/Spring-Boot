import { Component } from '@angular/core';
import { ServiceService } from '../service.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-package',
  templateUrl: './package.component.html',
  styleUrls: ['./package.component.css']
})
export class PackageComponent {

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
  return_date:any;
  offered:any;
  description:any;
  flight:any=[];
  constructor(private stsservice: ServiceService, private router: Router, private route: ActivatedRoute){}
  ngOnInit(){

    this.showpackage();
  }

  showpackage() {
    this.stsservice.getPackage().subscribe((response: any) => { this.flight = response });
    console.log();
    
  }
  data(value: any) {
    this.id = this.flight[value].id
    this.name = this.flight[value].name
    this.number = this.flight[value].number
    this.photo = this.flight[value].photo
    this.from_city = this.flight[value].from_city
    this.to_city = this.flight[value].to_city
    this.description = this.flight[value].description
  }

  
  goToPackage () {
    this.router.navigate(["Bookflight"]);
  }
}
