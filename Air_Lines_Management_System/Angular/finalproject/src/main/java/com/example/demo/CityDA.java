package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class CityDA {
	Connection con;
	PreparedStatement pstmt;
	List<City> slist;
	List<City> splist;
	
	public List<City> allCity() {
		slist = new ArrayList<>();        
		City s;
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "nh123456");
			pstmt = con.prepareStatement("select * from city");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				s= new City(rs.getInt(1), rs.getString(2));
				slist.add(s);
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return slist;
	}
	
public void insert(City s1) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "nh123456");
			pstmt = con.prepareStatement("insert into city values(?,?)");
			pstmt.setInt(1,s1.id);
			pstmt.setString(2,s1.name);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);

		}
	}

public City cityById(int id) {
	City s = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springdb", "root", "nh123456");
		pstmt = con.prepareStatement("select * from tbl1 where id=" + id);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {

			s = new City(rs.getInt(1), rs.getString(2));

		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return s;
}
}
