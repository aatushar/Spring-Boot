import { Component } from '@angular/core';
import { ServiceService } from '../service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Customar } from '../customar';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent {

  email: any;
  password: any;
  name: any;
  customer_id: any;
  dob: any;
  nationality: any;
  phone: any;
  address: any;
  customar: any;
  status:any;
  constructor(private serviceService: ServiceService, private router: Router, private route: ActivatedRoute) {}
  saveCustomar() {
    this.customar = new Customar(this.customer_id, this.email, this.password, this.name, this.dob, this.nationality, this.phone, this.address);
    console.log(this.customar);
    
    this.serviceService.insertCustomar(this.customar).subscribe(data => console.log("success", data),


    )
    // this.router.navigate(['Login'])

  }

}
