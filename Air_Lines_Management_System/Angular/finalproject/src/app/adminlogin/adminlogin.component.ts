import { Component } from '@angular/core';
import { ServiceService } from '../service.service';
import { Router } from '@angular/router';
import { Logintest } from '../logintest';
import { Logintest1 } from '../logintest1';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent {

  email:any;
  password:any;
  constructor(private serciceService:ServiceService,private router:Router){

  }

  ngOnInit(): void {
  }

adminlogin(){
  let logintest1: Logintest1 = new Logintest1( this.email,this.password);
  // logintest1.email = this.email;
  // logintest1.password = this.password;
  console.log(logintest1);
  localStorage.setItem('email','admin@gmail.com')
  this.serciceService.logincheck1(logintest1).subscribe((response:any)=>{
    console.log(response);
   
    if(response != null) {
      this.router.navigate(['Admindashboard']);
    }else{
      alert("invalid")
    }
  }
  )
  
}

}
