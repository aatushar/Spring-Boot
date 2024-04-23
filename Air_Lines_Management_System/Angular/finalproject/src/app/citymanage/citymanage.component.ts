import { Component } from '@angular/core';
import { ServiceService } from '../service.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { City } from '../city';

@Component({
  selector: 'app-citymanage',
  templateUrl: './citymanage.component.html',
  styleUrls: ['./citymanage.component.css']
})
export class CitymanageComponent {
  id: any;
  name: any;
  city: any;

  constructor(private stservice: ServiceService, private router: Router) {
    this.showCity();
  }

  saveCity() {
    this.city = new City(this.id, this.name);
    this.stservice.insertCity(this.city).subscribe(data => console.log(data),
    )

    this.router.navigate(['Citymanage'])
  }

  // citymanage() {
  //   this.router.navigate(["Citymanage"])
  // }
  showCity() {
    this.stservice.getCity()
      .subscribe(
        response => { this.city = response }
      );
    this.router.navigate(["Citymanage"])
  }
  delflight(id: any) {
    console.log(id);
    this.city = new City(id, this.name);
    this.stservice.deleteFlight(this.city)
      .subscribe(
        (data: any) => console.log("success", data),

      );

  }
}
