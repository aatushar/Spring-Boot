import { Component } from '@angular/core';
import { ServiceService } from '../service.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-myprofile',
  templateUrl: './myprofile.component.html',
  styleUrls: ['./myprofile.component.css']
})
export class MyprofileComponent {
  userArray:any=[];
  customer_id: any;
  customer_name: any;
  email: any;
  dob: any;
  phone: any;
  nationality: any;
  address:any

  constructor(
    private hservice: ServiceService,
    private router: Router,
    private route: ActivatedRoute  ) { }


  ngOnInit() {
    let customer_id = localStorage.getItem("customer_id");
    console.log(customer_id);
    this.hservice.getcustomarById(customer_id).subscribe((data) => {
      this.userArray = data;
      this.customer_id = this.userArray.customer_id;
      this.customer_name = this.userArray.customer_name;
      this.email = this.userArray.email;
      this.dob = this.userArray.dob;
      this.phone = this.userArray.phone;
      this.nationality = this.userArray.nationality;
      this.address = this.userArray.address;

    });
  }
}
