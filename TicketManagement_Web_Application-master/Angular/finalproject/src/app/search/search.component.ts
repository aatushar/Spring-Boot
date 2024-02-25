import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {

  constructor(private serciceService: ServiceService, private router: Router) { }

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
  flight: any;
  fromcitylist:any=[];
  tocitylist:any=[];

 
  
  
  
  ngOnInit(){
   
    this.fromCitylist();
    this.toCityList();
  }
  searchid() {
    this.router.navigate(["Bookflight", this.from_city, this.to_city, this.flying_date]);
  }

  
fromCitylist(){
  this.fromcitylist = [];
  this.serciceService.getFromcityList().subscribe(data =>{
    console.log(data);
    
    this.fromcitylist = data;
  })
}

toCityList(){
  this.tocitylist = [];
  this.serciceService.getTocityList().subscribe(data =>{
    console.log(data);
    
    this.tocitylist = data;
  })
}


}
