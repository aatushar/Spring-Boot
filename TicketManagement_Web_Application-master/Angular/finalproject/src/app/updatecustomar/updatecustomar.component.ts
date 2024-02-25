import { Component } from '@angular/core';
import { Customar } from '../customar';
import { ServiceService } from '../service.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-updatecustomar',
  templateUrl: './updatecustomar.component.html',
  styleUrls: ['./updatecustomar.component.css']
})
export class UpdatecustomarComponent {
  cid: any;
  name: any;
  email: any;
  phone: any;
  dob: any;
  nationality: any;
  address: any;
  customar:any;
  constructor(private stservice: ServiceService, private router: Router,private route: ActivatedRoute) {
  }

  ngOnInit(){
    let id = this.route.snapshot.params['cid'];
    this.stservice.getFlightById(id).subscribe(data => {
      this.customar = data;
      this.cid=this.customar.cid;
      this.name=this.customar.name;
      this.email=this.customar.email;
      this.phone=this.customar.phone;
      this.dob=this.customar.dob;
      this.nationality=this.customar.nationality;
      this.address=this.customar.address; 
    });
  }


  // updateFlight() {
  //   this.customar = new Customar(this.cid, this.name, this.email, this.phone, this.dob, this.nationality, this.address);
  //   this.stservice.updateflight(this.customar)
  //     .subscribe(
  //       data => console.log("success", data),

  //     )
  //   this.router.navigate(['Customarmanage'])
  // }
  // showpage() {
  //   this.router.navigate(["Customarmanage"])
  // }

}
