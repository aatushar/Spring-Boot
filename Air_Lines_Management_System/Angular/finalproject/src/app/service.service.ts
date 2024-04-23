import { Injectable } from '@angular/core';
import { Logintest } from './logintest';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { City } from './city';
import { Flight } from './flight';
import { Customar } from './customar';
import { Bookinginfo } from './bookinginfo';
import { Logintest1 } from './logintest1';
import { Dashboard } from './dashboard';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  public url = "http://localhost:8080/"
 
  constructor(private client: HttpClient) {
  }
  logincheck(logintest: Logintest): Observable<Object> {
    this.url = "http://localhost:8080/userlogin"
    console.log(logintest)
    return this.client.post(`${this.url}`, logintest)
  }

  logincheck1(logintest1: Logintest1): Observable<Object> {
    this.url = "http://localhost:8080/login"
    console.log(logintest1)
    return this.client.post(`${this.url}`, logintest1)
  }



  ngOnInit(){
    this.url = 'http://localhost:8080/all';
  }
  getCity() {
    this.url = 'http://localhost:8080/city/all';
    return this.client.get(this.url);
  }
  getCityById(id: number): Observable<City>{
    this.url = 'http://localhost:8080/';
    return this.client.get<City>(`${this.url}city/${id}`)
  }

  insertCity(city: City) {
    this.url = 'http://localhost:8080/city/insert';
    return this.client.post(this.url, city);
  }
  deletecity(flight: Flight) {
    this.url = 'http://localhost:8080/city/delete';
    return this.client.post(this.url, flight);
  }




 

//check available seat
  checkSeat(flightNumber:any, seat:any,from_city:any,to_city:any,flying_date:any,return_date:any): Observable<boolean> {
    this.url = 'http://localhost:8080/';
    return this.client.get<boolean>(`${this.url}seats/${flightNumber}/${seat}/${from_city}/${to_city}/${flying_date}/${return_date}`);
  }

  checkAllBookedSeat(flightNumber:any, flying_date:any,return_date:any): Observable<Bookinginfo> {
    this.url = 'http://localhost:8080/';
    return this.client.get<Bookinginfo>(`${this.url}seats/${flightNumber}/${flying_date}/${return_date}`);
  }


  getFlight() {
    this.url = 'http://localhost:8080/flight/fall';
    return this.client.get(this.url);
  }

  getFlightById(flightid: number): Observable<Flight>{
    this.url = 'http://localhost:8080/';
    return this.client.get<Flight>(`${this.url}flight/${flightid}`)
  }

  insertFlight(flight: Flight) {
    this.url = 'http://localhost:8080/flight/add';
    return this.client.post(this.url, flight);
  }
  updateflight(flight: Flight) {
    this.url = 'http://localhost:8080/update';
    return this.client.post(this.url, flight);
  }
  deleteFlight(flight: Flight) {
    this.url = 'http://localhost:8080/delete';
    return this.client.post(this.url, flight);
  }

//search related all
  search(from_city:string,to_city:string,flying_date:string,): Observable<Flight>{
    this.url = 'http://localhost:8080/flight/search';
    return this.client.get<Flight>(`${this.url}/${from_city}/${to_city}/${flying_date}`);
  }

  getFromcityList(): Observable<String[]>{
    this.url = 'http://localhost:8080/';
    return this.client.get<String[]>(`${this.url}from_city`)
  }
 

  getTocityList(): Observable<Flight[]>{
    this.url = 'http://localhost:8080/';
    return this.client.get<Flight[]>(`${this.url}to_city`)
  }

  DateSearch(from_city:string,to_city:string): Observable<Flight>{
    this.url = 'http://localhost:8080/flight/searchReturndate';
    return this.client.get<Flight>(`${this.url}/${from_city}/${to_city}`);
  }

  // returnDateSearch(from_city:string,to_city:string,flying_date:string): Observable<Flight>{
  //   this.url = 'http://localhost:8080/flight/searchReturndate';
  //   return this.client.get<Flight>(`${this.url}/${from_city}/${to_city}/${flying_date}`);
  // }




  insertCustomar(customar:Customar) {
    this.url = 'http://localhost:8080/customarinsert';
    return this.client.post(this.url, customar);
  }
  updateCustomar(customar: Customar) {
    this.url = 'http://localhost:8080/customar/update';
    return this.client.post(this.url, customar);
  }
  deleteCustomar(customar: Customar) {
    this.url = 'http://localhost:8080/customar/delete';
    return this.client.post(this.url, customar);
  }
  // getcustomarById(customer_id: any,passanger_name: any,email: any): Observable<Customar>{
  //   this.url = 'http://localhost:8080/';
  //   return this.client.get<Customar>(`${this.url}customar/${customer_id}/${passanger_name}/${email}`)
  // }

  getcustomarById(customer_id: any): Observable<Customar>{
    this.url = 'http://localhost:8080/';
    return this.client.get<Customar>(`${this.url}customar/${customer_id}`)
  }
  getCustomar() {
    this.url = 'http://localhost:8080/customar/all';
    return this.client.get(this.url);
  }




  insertBookinginfo(bookinginfo:Bookinginfo) {
    this.url = 'http://localhost:8080/bookinginfoinsert';
    console.log(bookinginfo.passanger_name);
    return this.client.post(this.url, bookinginfo);
  }
  getbookinginfo() {
    this.url = 'http://localhost:8080/bookedflight';
    return this.client.get(this.url);
  }

  getpendinglist() {
    this.url = 'http://localhost:8080/pendinglist';
    return this.client.get(this.url);
  }

 
  getbookedflightById(customer_id: any): Observable<Bookinginfo[]>{
    this.url = 'http://localhost:8080/bookedflightbyId';
    return this.client.get<Bookinginfo[]>(`${this.url}/${customer_id}`)
  }


  deleteBookedFlight(bookinginfo: Bookinginfo) {
    this.url = 'http://localhost:8080/deleteinvoice';
    return this.client.post(this.url, bookinginfo);
  }

//booking confirm, cancel request, confirm cancel
  updateBookingStatus(bookingid: any) {
    this.url = 'http://localhost:8080/bookingconfirm/'+bookingid;
    return this.client.get(this.url);
  }

  cancelRequest(bookingid: any) {
    this.url = 'http://localhost:8080/cancelrequest';
    return this.client.get(`${this.url}/${bookingid}`);
  }

  getCancelrequest() {
    this.url = 'http://localhost:8080/cancelrequ';
    return this.client.get(this.url);
  }


  getMyBookingDetails(customerId: string) {
    this.url = `http://localhost:8080/bookedflightbyId/${customerId}`;
    return this.client.get(this.url);
}

  cancelRequestConfirm() {
    this.url = 'http://localhost:8080/cancelrequestconfirm';
    return this.client.get(`${this.url}`);
  }

  getNumberOfBookings(pid: number) {
    this.url = 'http://localhost:8080/getallbookings';
    return this.client.get(`${this.url}/${pid}`);
  }
  getBookingsById(bookingid: number) {
    this.url = 'http://localhost:8080/getallbookingsbyId';
    return this.client.get(`${this.url}/${bookingid}`);
  }

  getTicketById(bookingid: number) {
    this.url = 'http://localhost:8080/getticketbyid';
    return this.client.get(`${this.url}/${bookingid}`);
  }


  getTotalEarnings(totalEarning: any): Observable<Dashboard>{
    this.url = 'http://localhost:8080/totalamount';
    return this.client.get<Dashboard>(`${this.url}/${totalEarning}`)
  }
  getnovoEarnings(novoair: any): Observable<Dashboard>{
    this.url = 'http://localhost:8080/nair';
    return this.client.get<Dashboard>(`${this.url}/${novoair}`)
  }
  getbBangladeshEarnings(bimanbangladesh: any): Observable<Dashboard>{
    this.url = 'http://localhost:8080/bbangladesh';
    return this.client.get<Dashboard>(`${this.url}/${bimanbangladesh}`)
  }
  getUsbEarnings(usbangla: any): Observable<Dashboard>{
    this.url = 'http://localhost:8080/earningusbangla';
    return this.client.get<Dashboard>(`${this.url}/${usbangla}`)
  }


  getPackage() {
    this.url = 'http://localhost:8080/package/allPackage';
    return this.client.get(this.url);
  }
}
