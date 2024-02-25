package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookingController {

	List<Booking> seats = new ArrayList<>();

	@PostMapping(value = "/bookinginfoinsert")
	public void insert(@RequestBody Booking s) {
		BookingDA d = new BookingDA();
		System.out.println(s.passanger_name);
		d.insert(s);

	}

	List<Booking> pList = new ArrayList<>();

	@RequestMapping(value = "/bookedflight")
	List<Booking> allBooks() {
		BookingDA d = new BookingDA();
		pList = d.allBook();
		return pList;
	}

	@RequestMapping(value = "/seats/{id}/{seat}/{flying_date}/{from_city}/{to_city}")
	boolean checkSeat(@PathVariable("id") String flightnumber, @PathVariable("seat") String seat , @PathVariable("flying_date") String flying_date , @PathVariable("from_city") String from_city , @PathVariable("to_city") String to_city) {
		BookingDA d = new BookingDA();
		return d.checkSeat(flightnumber,seat,flying_date,from_city,to_city);
	}


	@RequestMapping(value = "/seats/{id}/{seat}/{from_city}/{to_city}/{flying_date}/{return_date}")
	boolean checkSeat(@PathVariable("id") String flightnumber, @PathVariable("seat") String seat  , @PathVariable("from_city") String from_city , @PathVariable("to_city") String to_city, @PathVariable("flying_date") String flying_date, @PathVariable("return_date") String return_date) {
		BookingDA d = new BookingDA();
		return d.checkSeat(flightnumber,seat,from_city,to_city,flying_date,return_date);
	}

	@GetMapping(value = "/bookedflightbyId/{customer_id}")
	List<Booking> allBookflightbyid(@PathVariable("customer_id") int customer_id) {
		BookingDA d = new BookingDA();
		pList = d.bookedFlightById(customer_id);
		return pList;
	}

//	@PostMapping(value ="/deleteinvoice")
//	public void delete(@RequestBody Booking dlt) {
//		BookingDA d = new BookingDA();
//			d.deleteBookedFlight(dlt);
//	}

	@GetMapping(value = "/bookingconfirm/{bookingid}")
	public void bookingconfirm(@PathVariable("bookingid") int bookingid) {
		BookingDA d = new BookingDA();
		d.confirmBooking(bookingid);
	}

	@GetMapping(value = "/cancelrequest/{bookingid}")
	public void cancelRequest(@PathVariable("bookingid") int bookingid) {
		BookingDA d = new BookingDA();
		d.cancelRequest(bookingid);
	}

	List<Booking> cancelList = new ArrayList<>();
	@RequestMapping(value = "/cancelrequ")
	List<Booking> cancelrequest() {
		BookingDA d = new BookingDA();
		cancelList = d.getcancelRequ();
		return cancelList;
	}

	@GetMapping(value = "/cancelrequestconfirm")
	public void cancelRequestconfirmation() {
		BookingDA d = new BookingDA();
		d.cancelRequestConfirm();
	}

	@GetMapping(value = "/getallbookings/{pid}")
	public int getAllBookings(@PathVariable("pid") int pid) {
		BookingDA d = new BookingDA();
		return d.getAllBookings(pid).size();
	}
	@GetMapping(value = "/getallbookingsbyId/{bookingid}")
	public List<Booking> getAllBookingbyId(@PathVariable("bookingid") int bookingid) {
		BookingDA d = new BookingDA();
		return d.getAllBookingsById(bookingid);
	}

	@GetMapping(value = "/getticketbyid/{bookingid}")
	public Booking getticketbyid(@PathVariable("bookingid") int bookingid) {
		BookingDA d = new BookingDA();
		return d.ticketGetting(bookingid);
	}

	List<Booking> pendinglist = new ArrayList<>();
	@RequestMapping(value = "/pendinglist")
	List<Booking> allpending() {
		BookingDA d = new BookingDA();
		pendinglist = d.allpendingList();
		return pendinglist;
	}

	List<Booking> bookedSeat = new ArrayList<>();
	@RequestMapping(value = "seats/{id}/{flying_date}/{return_date}")
	List<Booking> allbookedSeatcheck(@PathVariable("id") String flightnumber, @PathVariable("flying_date") String flying_date, @PathVariable("return_date") String return_date) {
		BookingDA d = new BookingDA();
		bookedSeat = d.allbookedSeat(flightnumber,flying_date,return_date);
		return bookedSeat;
	}




}
