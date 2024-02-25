package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomarDA {

	Connection con;
	PreparedStatement pstmt;
	List<Customar> slist;
	List<Customar> splist;

	public List<Customar> allCustomar() {
		slist = new ArrayList<>();
		Customar s;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
			pstmt = con.prepareStatement("select * from customer_admin");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				s= new Customar(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8));
				slist.add(s);
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return slist;
	}

public void insert(Customar s1) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
			pstmt = con.prepareStatement("insert into customer_admin values(?,?,?,?,?,?,?,?)");

			pstmt.setInt(1,s1.customer_id);
			pstmt.setString(2,s1.email);
			pstmt.setString(3,s1.password);
			pstmt.setString(4,s1.name);
			pstmt.setString(5,s1.dob);
			pstmt.setString(6,s1.nationality);
			pstmt.setString(7,s1.phone);
			pstmt.setString(8,s1.address);

			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);

		}
	}

//public void updateCustomar(Customar s1) {
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "nh123456"));
//		pstmt = con.prepareStatement("update customer_admin set name = ?, email=?, phone = ?,dob=?, nationality=?,address=? where cid = ?");
//		pstmt.setInt(7, s1.cid);
//		pstmt.setString(1,s1.name);
//		pstmt.setString(2,s1.email);
//		pstmt.setString(3,s1.phone);
//		pstmt.setString(4,s1.dob);
//		pstmt.setString(5,s1.nationality);
//		pstmt.setString(6,s1.address);
//
//		pstmt.executeUpdate();
//	} catch (Exception e) {
//		System.out.println(e);
//	}
//
//}
//
//public void deleteCustomar(Customar x) {
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "nh123456"));
//		PreparedStatement pst = con.prepareStatement("delete from customer_admin where id = ?");
//		pst.setInt(1, x.cid);
//		pst.executeUpdate();
//	} catch (Exception e) {
//	}
//
//}
public Customar customarById(int customer_id) {
	Customar s = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
		pstmt = con.prepareStatement("select * from customer_admin where customer_id= ?");
		pstmt.setInt(1, customer_id);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {

			s = new Customar(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8));

		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return s;
}



}
