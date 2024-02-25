package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FlightDA {

	Connection con;
	PreparedStatement pstmt;
	List<Flight> slist;
	List<Flight> splist;

	public List<Flight> allFlight() {
		slist = new ArrayList<>();
		Flight s;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
			pstmt = con.prepareStatement("select * from flight_add");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				s= new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15));
				slist.add(s);
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return slist;
	}

	public List<Flight> allPackage() {
		slist = new ArrayList<>();
		Flight s;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
			pstmt = con.prepareStatement("select * from flight_add where offered='Yes'");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				s= new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15));
				slist.add(s);
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return slist;
	}

public void insert(Flight s1) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
			pstmt = con.prepareStatement("insert into flight_add values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1,s1.id);
			pstmt.setString(2,s1.name);
			pstmt.setString(3,s1.number);
			pstmt.setString(4,s1.departure_time);
			pstmt.setString(5,s1.arrival_time);
			pstmt.setString(6,s1.flying_date);
			pstmt.setString(7,s1.return_date);
			pstmt.setString(8,s1.from_city);
			pstmt.setString(9,s1.to_city);
			pstmt.setString(10,s1.catagory);
			pstmt.setInt(11,s1.economy_price);
			pstmt.setInt(12,s1.business_price);
			pstmt.setString(13,s1.photo);
			pstmt.setString(14,s1.offered);
			pstmt.setString(15,s1.description);
			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);

		}
	}

public void updateFlight(Flight s1) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234"));
		pstmt = con.prepareStatement("update flight_add set name = ?, number=?, departuer_time = ?,arrival_time=?, flying_date=?,return_date=?,from_city=?,to_city=?,catagory=?,economy_price=?,business_price=? ,photo=?,offered=?,description=?  where id = ?");
		pstmt.setInt(15, s1.id);
		pstmt.setString(1,s1.name);
		pstmt.setString(2,s1.number);
		pstmt.setString(3,s1.departure_time);
		pstmt.setString(4,s1.arrival_time);
		pstmt.setString(5,s1.flying_date);
		pstmt.setString(6,s1.return_date);
		pstmt.setString(7,s1.from_city);
		pstmt.setString(8,s1.to_city);
		pstmt.setString(9,s1.catagory);
		pstmt.setInt(10,s1.economy_price);
		pstmt.setInt(11,s1.business_price);
		pstmt.setString(12,s1.photo);
		pstmt.setString(13,s1.offered);
		pstmt.setString(14,s1.description);
		pstmt.executeUpdate();
	} catch (Exception e) {
		System.out.println(e);
	}

}

public void deleteFlight(Flight x) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234"));
		PreparedStatement pst = con.prepareStatement("delete from flight_add where id = ?");
		pst.setInt(1, x.id);
		pst.executeUpdate();
	} catch (Exception e) {
		System.out.println(e);

	}

}
public Flight flightById(int id) {
	Flight s = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
		pstmt = con.prepareStatement("select * from flight_add where id= ?" );
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {

			s = new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15));

		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return s;
}


public Flight search(String from_city,String to_city,String flying_date) {
	Flight s = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
		pstmt = con.prepareStatement("select * from flight_add where from_city=? and to_city=? and  flying_date=?");
		pstmt.setString(1, from_city);
		pstmt.setString(2, to_city);
		pstmt.setString(3, flying_date);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {

			s = new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15));

		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return s;
}

public List<String> distinctFromCity() {
	List<String> list = new ArrayList<>();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
		pstmt = con.prepareStatement("select distinct from_city from flight_add");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			list.add(rs.getString(1));
		}

	} catch (Exception e) {
		System.out.println(e);
	}
	return list;
}

public List<String> distinctToCity() {
	List<String> list = new ArrayList<>();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
		pstmt = con.prepareStatement("select distinct to_city from flight_add");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			list.add(rs.getString(1));
		}

	} catch (Exception e) {
		System.out.println(e);
	}
	return list;
}

public Flight returnDate(String from_city,String to_city) {
	Flight s = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
		pstmt = con.prepareStatement("select * from flight_add where from_city=? and to_city=?");
		pstmt.setString(1, from_city);
		pstmt.setString(2, to_city);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			s = new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return s;
}

}
