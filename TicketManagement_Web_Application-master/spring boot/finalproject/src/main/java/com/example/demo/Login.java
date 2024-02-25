package com.example.demo;

public class Login {
	int customer_id;
	String email;
	String password;
	public Login(int customer_id, String email, String password) {
		super();
		this.customer_id = customer_id;
		this.email = email;
		this.password = password;
	}
	public Login() {
		super();
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

	
	

}
