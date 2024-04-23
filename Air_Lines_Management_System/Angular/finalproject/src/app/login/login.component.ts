import { Component, OnInit } from '@angular/core';
// import { LoginService } from '../loginservice.service';
import { Router } from '@angular/router';
import { Logintest } from '../logintest';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  email: any;
  password: any;
  customer_id: any;
  // logintest:Logintest=new Logintest();
  constructor(private serciceService: ServiceService, private router: Router) {

  }

  ngOnInit(): void {
  }

  userlogin() {
    let logintest: Logintest = new Logintest(this.customer_id, this.email, this.password);
    this.serciceService.logincheck(logintest).subscribe((response: any) => {
      console.log(response);
      localStorage.setItem('customer_id',this.customer_id);
      localStorage.setItem('email',this.email);
      localStorage.setItem('password',this.password);
      if (response != null) {
        this.router.navigate(['Customerdashboard']);
      } else {
        alert("invalid");
      }
    });
  }

}

