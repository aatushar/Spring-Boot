package com.example.demo;

public class Customar {
	int customer_id;
	String email,password,name,dob,nationality,phone,address;
	public Customar() {
		super();
	}
	public Customar(int customer_id, String email, String password, String name, String dob, String nationality,
			String phone, String address) {
		super();
		this.customer_id = customer_id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.dob = dob;
		this.nationality = nationality;
		this.phone = phone;
		this.address = address;
		
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}



}
