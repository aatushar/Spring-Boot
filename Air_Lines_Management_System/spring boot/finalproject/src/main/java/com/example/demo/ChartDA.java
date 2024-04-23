package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ChartDA {

	PreparedStatement pst;
	Connection con;

	public Chart totalearning( String totalEarning ) {
		Chart C =null;


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
			pst = con.prepareStatement("select SUM(total_amount) from invoice");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				C= new Chart();
				C.setTotalEarning(totalEarning);
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return C;

	}


	public Chart bimanbangladeshEarning( String bimanbangladesh ) {
		Chart C =null;


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
			pst = con.prepareStatement("select SUM(total_amount)from invoice where flight_name='biman bangladesh'");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				C= new Chart();
				C.setTotalEarning(bimanbangladesh);
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return C;

	}

	public Chart usBanglaEarning( String usbangla ) {
		Chart C =null;


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
			pst = con.prepareStatement("select SUM(total_amount) from invoice where flight_name='US BANGLA'");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				C= new Chart();
				C.setTotalEarning(usbangla);
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return C;

	}

	public Chart novoairEarning( String novoair ) {
		Chart C =null;


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
			pst = con.prepareStatement("select SUM(total_amount) from invoice where flight_name='NOVO AIR'");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				C= new Chart();
				C.setTotalEarning(novoair);
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return C;

	}
}
