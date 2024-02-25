import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { SearchComponent } from './search/search.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { ContactComponent } from './contact/contact.component';
import { FeedbackComponent } from './feedback/feedback.component';
import {AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AirlinesmanageComponent } from './airlinesmanage/airlinesmanage.component';
import { NewflightaddComponent } from './newflightadd/newflightadd.component';
import { UpdateflightComponent } from './updateflight/updateflight.component';
import { CustomarmanageComponent } from './customarmanage/customarmanage.component';
import { CitymanageComponent } from './citymanage/citymanage.component';

import { UpdatecustomarComponent } from './updatecustomar/updatecustomar.component';
import { CompanymanageComponent } from './companymanage/companymanage.component';
import { BookingmanageComponents } from './bookingmanage/bookingmanage.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { Router } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { BookflightComponent } from './bookflight/bookflight.component';
import { ShowdetailsComponent } from './showdetails/showdetails.component';
// import { SeatComponent } from './seat/seat.component';
import { CustomardashboardComponent } from './customardashboard/customardashboard.component';
import { MyprofileComponent } from './myprofile/myprofile.component';
import { MybookingComponent } from './mybooking/mybooking.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { CancelrequestdataComponent } from './cancelrequestdata/cancelrequestdata.component';
import { BookingrequestComponent } from './bookingrequest/bookingrequest.component';
import { TicketComponent } from './ticket/ticket.component';
import { CanvasJSAngularChartsModule } from '@canvasjs/angular-charts';
import { PackageComponent } from './package/package.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    SearchComponent,
    LoginComponent,
    RegistrationComponent,
    ContactComponent,
    FeedbackComponent,
    AdmindashboardComponent,
    AirlinesmanageComponent,
    NewflightaddComponent,
    UpdateflightComponent,
    CustomarmanageComponent,
    CitymanageComponent,
 
    UpdatecustomarComponent,
    CompanymanageComponent,
    BookingmanageComponents,
    UserdashboardComponent,
    BookflightComponent,
    ShowdetailsComponent,
    // SeatComponent,
    CustomardashboardComponent,
    MyprofileComponent,
    MybookingComponent,
    AdminloginComponent,
    CancelrequestdataComponent,
    BookingrequestComponent,
    TicketComponent,
    PackageComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,HttpClientModule,
    CanvasJSAngularChartsModule,
     
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
