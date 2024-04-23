package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDA {
	Connection con;
	PreparedStatement pst;
	public Login check(Login u) {
	Login q = null;
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "nh123456"));
	PreparedStatement pst = con.prepareStatement("Select * from log_admin where email=? AND password=?");

	pst.setString(1, u.email);
	pst.setString(2, u.password);
	ResultSet rs = pst.executeQuery();
	if(rs.next()) {
	q = new Login();
	q.setEmail(rs.getString(1));
	q.setPassword(rs.getString(2));
	}
	} catch (Exception e) {
	System.out.println(e);

	}
	return q;
	}

}
