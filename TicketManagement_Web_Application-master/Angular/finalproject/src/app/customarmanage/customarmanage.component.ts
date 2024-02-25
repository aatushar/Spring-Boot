import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceService } from '../service.service';
import { Customar } from '../customar';

@Component({
  selector: 'app-customarmanage',
  templateUrl: './customarmanage.component.html',
  styleUrls: ['./customarmanage.component.css']
})
export class CustomarmanageComponent {
cid:any;
  name:any;
  email:any;
  phone:any;
  dob:any;
  nationality:any;
  address:any;
  customar:any;
  customars:any;
  flight:any;
  constructor( private router:Router,private stservice:ServiceService,private route:ActivatedRoute){
    //this.showFlight();
  }
  ngOnInit(){
    this.showcustomar();
  }

  newcustomaradd() {
    this.router.navigate(["Addcustomar"])
  }
  showcustomar() {
    this.stservice.getFlight()
      .subscribe(
        response => { this.customar = response }
      );
      //this.router.navigate(["Airlinesmanage"]) 
  }

  // updatecustomar(cid: any) {
  //   this.router.navigate(["cUpdate", cid]);
  // }

  // delcustomar(cid:any) {
  //   console.log(cid);
  //   this.customar = new Customar(cid, this.name,this.email,this.phone,this.dob,this.nationality,this.address);
  //   this.stservice.deleteFlight(this.customar)
  //     .subscribe(
  //       ( data: any) => console.log("success", data),
       
  //     );
  //     this.showcustomar();
  //     this.router.navigate(["Customarmanage"]);      

  // }

}
