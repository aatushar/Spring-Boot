package com.example.demo;

public class Flight {
	int id;
	String name;
	String number;
	String departure_time;
	String arrival_time;
	String flying_date;
	String return_date;
	String from_city;
	String to_city;
	String catagory;
	int economy_price;
	int business_price;
	String photo;
	String offered;
	String description;
	public Flight() {
		super();
	}
	public Flight(int id, String name, String number, String departure_time, String arrival_time, String flying_date,
			String return_date, String from_city, String to_city, String catagory, int economy_price,
			int business_price, String photo,String offered,String description) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.flying_date = flying_date;
		this.return_date = return_date;
		this.from_city = from_city;
		this.to_city = to_city;
		this.catagory = catagory;
		this.economy_price = economy_price;
		this.business_price = business_price;
		this.photo = photo;
		this.offered = offered;
		this.description = description;
	}
	
	
	
	public Flight(int int1, String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getEconomy_price() {
		return economy_price;
	}
	public void setEconomy_price(int economy_price) {
		this.economy_price = economy_price;
	}
	public int getBusiness_price() {
		return business_price;
	}
	public void setBusiness_price(int business_price) {
		this.business_price = business_price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getOffered() {
		return offered;
	}
	public void setOffered(String offered) {
		this.offered = offered;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}
