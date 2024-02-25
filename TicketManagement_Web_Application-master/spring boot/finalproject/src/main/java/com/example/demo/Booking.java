package com.example.demo;

public class Booking {
	int bookingid, passanger_id;
	String passanger_name, email, flight_number, flight_name, from_city, to_city, flying_date,return_date, classcatagory, seat,
			gate, passanger_no, booking_date, departure_time, arrival_time;
	int total_amount;
	String status, cancel_date;
	int refundable_amount;
	public Booking() {
		super();
	}
	public Booking(int bookingid, int passanger_id, String passanger_name, String email, String flight_number,
			String flight_name, String from_city, String to_city, String flying_date, String return_date,
			String classcatagory, String seat, String gate, String passanger_no, String booking_date,
			String departure_time, String arrival_time, int total_amount, String status, String cancel_date,
			int refundable_amount) {
		super();
		this.bookingid = bookingid;
		this.passanger_id = passanger_id;
		this.passanger_name = passanger_name;
		this.email = email;
		this.flight_number = flight_number;
		this.flight_name = flight_name;
		this.from_city = from_city;
		this.to_city = to_city;
		this.flying_date = flying_date;
		this.return_date = return_date;
		this.classcatagory = classcatagory;
		this.seat = seat;
		this.gate = gate;
		this.passanger_no = passanger_no;
		this.booking_date = booking_date;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.total_amount = total_amount;
		this.status = status;
		this.cancel_date = cancel_date;
		this.refundable_amount = refundable_amount;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public int getPassanger_id() {
		return passanger_id;
	}
	public void setPassanger_id(int passanger_id) {
		this.passanger_id = passanger_id;
	}
	public String getPassanger_name() {
		return passanger_name;
	}
	public void setPassanger_name(String passanger_name) {
		this.passanger_name = passanger_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getFrom_city() {
		return from_city;
	}
	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}
	public String getTo_city() {
		return to_city;
	}
	public void setTo_city(String to_city) {
		this.to_city = to_city;
	}
	public String getFlying_date() {
		return flying_date;
	}
	public void setFlying_date(String flying_date) {
		this.flying_date = flying_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	public String getClasscatagory() {
		return classcatagory;
	}
	public void setClasscatagory(String classcatagory) {
		this.classcatagory = classcatagory;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	public String getPassanger_no() {
		return passanger_no;
	}
	public void setPassanger_no(String passanger_no) {
		this.passanger_no = passanger_no;
	}
	public String getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCancel_date() {
		return cancel_date;
	}
	public void setCancel_date(String cancel_date) {
		this.cancel_date = cancel_date;
	}
	public int getRefundable_amount() {
		return refundable_amount;
	}
	public void setRefundable_amount(int refundable_amount) {
		this.refundable_amount = refundable_amount;
	}
	


}
