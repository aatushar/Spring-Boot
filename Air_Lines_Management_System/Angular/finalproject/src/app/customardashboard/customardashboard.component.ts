import { Component } from '@angular/core';
import { ServiceService } from '../service.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-customardashboard',
  templateUrl: './customardashboard.component.html',
  styleUrls: ['./customardashboard.component.css']
})
export class CustomardashboardComponent {
  constructor(private stservice:ServiceService,private router:Router){}
 

}
