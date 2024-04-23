import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { SearchComponent } from './search/search.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { ContactComponent } from './contact/contact.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AirlinesmanageComponent } from './airlinesmanage/airlinesmanage.component';
import { NewflightaddComponent } from './newflightadd/newflightadd.component';
import { UpdateflightComponent } from './updateflight/updateflight.component';
import { CustomarmanageComponent } from './customarmanage/customarmanage.component';
import { CitymanageComponent } from './citymanage/citymanage.component';
import { UpdatecustomarComponent } from './updatecustomar/updatecustomar.component';
import { BookflightComponent } from './bookflight/bookflight.component';
import { ShowdetailsComponent } from './showdetails/showdetails.component';
import { CustomardashboardComponent } from './customardashboard/customardashboard.component';
import { MyprofileComponent } from './myprofile/myprofile.component';
import { MybookingComponent } from './mybooking/mybooking.component';
import { BookingmanageComponents } from './bookingmanage/bookingmanage.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { SeatComponent } from './seat/seat.component';
import { CancelrequestdataComponent } from './cancelrequestdata/cancelrequestdata.component';
import { BookingrequestComponent } from './bookingrequest/bookingrequest.component';
import { TicketComponent } from './ticket/ticket.component';
import { PackageComponent } from './package/package.component';

// import { SeatComponent } from './seat/seat.component';



const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "Home", component: HomeComponent },
  { path: "About", component: AboutComponent },
  { path: "Searchflight", component: SearchComponent },
  { path: "Login", component: LoginComponent },
  { path: "Registration", component: RegistrationComponent },
  { path: "Contact", component: ContactComponent },
  { path: "Feedback", component: FeedbackComponent },
  { path: "Admindashboard", component: AdmindashboardComponent },
  { path: "Airlinesmanage", component: AirlinesmanageComponent},
  { path: "Newflightadd", component: NewflightaddComponent},
  { path: "Update/:id", component: UpdateflightComponent},
  { path: "Customarmanage", component: CustomarmanageComponent},
  { path: "bookingmanage", component: BookingmanageComponents},
  { path: "Citymanage", component: CitymanageComponent},
  { path: "cUpdate/:cid", component: UpdatecustomarComponent},
  { path: "Bookflight/:from_city/:to_city/:flying_date", component: BookflightComponent},
  { path: "Showdetails/:id", component: ShowdetailsComponent},
  { path: "Customerdashboard", component: CustomardashboardComponent},
  { path: "Myprofile", component: MyprofileComponent},
  { path: "Mybooking", component: MybookingComponent},
  { path: "Adminlogin", component: AdminloginComponent},
  { path: "Seat", component:SeatComponent },
  { path: "Cancelrequest", component:CancelrequestdataComponent },
  { path: "Bookingrequest", component:BookingrequestComponent },
  { path: "Ticket/:bookingid", component:TicketComponent },
  { path: "Package", component:PackageComponent },
 
  

 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

