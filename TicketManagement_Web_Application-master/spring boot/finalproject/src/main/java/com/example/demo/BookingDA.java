package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookingDA {


	List<Booking> slist;
public void insert(Booking s1) {
	Connection con;
	PreparedStatement pstmt;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
			pstmt = con.prepareStatement("insert into invoice values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, null);
			pstmt.setInt(2,s1.passanger_id);
			pstmt.setString(3,s1.passanger_name);
			pstmt.setString(4,s1.email);
			pstmt.setString(5,s1.flight_number);
			pstmt.setString(6,s1.flight_name);
			pstmt.setString(7,s1.from_city);
			pstmt.setString(8,s1.to_city);
			pstmt.setString(9,s1.flying_date);
			pstmt.setString(10,s1.return_date);
			pstmt.setString(11,s1.classcatagory);
			pstmt.setString(12,s1.seat);
			pstmt.setString(13,s1.gate);
			pstmt.setString(16,s1.booking_date);
			pstmt.setString(14,s1.departure_time);
			pstmt.setString(15,s1.arrival_time);
			pstmt.setInt(17,s1.total_amount);
			pstmt.setString(18,s1.status);
			pstmt.setString(19,s1.cancel_date);
			pstmt.setInt(20,s1.refundable_amount);

			pstmt.executeUpdate();

//			PreparedStatement pstmt1=con.prepareStatement("Update invoice set counter=counter+1 where passanger_id=?");
//			pstmt1.setInt(1,s1.passanger_id);
//			pstmt1.executeUpdate();


			PreparedStatement pstmt1=con.prepareStatement("SELECT COUNT(bookingid) FROM invoice WHERE passanger_id = 1271427");
			pstmt1.setInt(1,s1.passanger_id);
			pstmt1.executeQuery();

		} catch (Exception e) {
//			System.out.println(e);

		}
	}


	public List<Booking> allBook() {
		Connection con;
		PreparedStatement pstmt;
		slist = new ArrayList<>();
		Booking s;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
			pstmt = con.prepareStatement("select * from invoice where status='Booked' or status='Pending' or status='Cancel'");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				s = new Booking();
				s.setBookingid(rs.getInt(1));
				s.setPassanger_id(rs.getInt(2));
				s.setPassanger_name(rs.getString(3));
				s.setFlight_number(rs.getString(5));
				s.setFlight_name(rs.getString(6));
				s.setFrom_city(rs.getString(7));
				s.setTo_city(rs.getString(8));
				s.setFlying_date(rs.getString(9));
				s.setClasscatagory(rs.getString(10));
				s.setSeat(rs.getString(11));
				s.setGate(rs.getString(12));
				s.setBooking_date(rs.getString(15));
				s.setStatus(rs.getString(17));
				slist.add(s);
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return slist;
	}


public boolean checkSeat(String flightnumber, String seat, String flying_date,String from_city,String to_city ) {
	Connection con;
	PreparedStatement pstmt;

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
		pstmt = con.prepareStatement("select seat from invoice where flight_number=? and seat = ? and flying_date=? and from_city=? and to_city=?  ");
		pstmt.setString(1, flightnumber);
		pstmt.setString(2, seat);
		pstmt.setString(3, flying_date);
		pstmt.setString(4, from_city);
		pstmt.setString(5, to_city);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			return false;
		} else {
			return true;
		}
	} catch (Exception e) {
		System.out.println(e);

	}
	return true;
}



public boolean checkSeat(String flightnumber, String seat,String from_city,String to_city , String flying_date, String return_date) {
	Connection con;
	PreparedStatement pstmt;

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
		pstmt = con.prepareStatement("select seat from invoice where flight_number=? and (from_city=? and to_city=? and flying_date=?) or (to_city=? and from_city=? or return_date=?)");
		pstmt.setString(1, flightnumber);
		pstmt.setString(2, seat);
		pstmt.setString(3, from_city);
		pstmt.setString(4, to_city);
		pstmt.setString(5, flying_date);
		pstmt.setString(6, from_city);
		pstmt.setString(7, to_city);
		pstmt.setString(8, return_date);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			return false;
		} else {
			return true;
		}
	} catch (Exception e) {
		System.out.println(e);

	}
	return true;
}


public List<Booking> bookedFlightById(int customer_id) {
	Connection con;
	PreparedStatement pstmt;
	slist = new ArrayList<>();
	Booking s;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
	pstmt = con.prepareStatement("select * from invoice where passanger_id=? and status=?");
	pstmt.setInt(1, customer_id);
	pstmt.setString(2, "Booked");
	ResultSet rs = pstmt.executeQuery();
	while (rs.next()) {

		s = new Booking();
		s.setBookingid(rs.getInt(1));
		s.setPassanger_id(rs.getInt(2));
		s.setPassanger_name(rs.getString(3));
		s.setFlight_number(rs.getString(5));
		s.setFlight_name(rs.getString(6));
		s.setFrom_city(rs.getString(7));
		s.setTo_city(rs.getString(8));
		s.setFlying_date(rs.getString(9));
		s.setReturn_date(rs.getString(10));
		s.setClasscatagory(rs.getString(11));
		s.setSeat(rs.getString(12));
		s.setGate(rs.getString(13));
		s.setBooking_date(rs.getString(15));
		s.setStatus(rs.getString(17));
		slist.add(s);

	}
} catch (Exception e) {
	System.out.println(e);
}
return slist;
}


//public void deleteBookedFlight(Booking dlt) {
//	Connection con;
//	PreparedStatement pstmt;
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "nh123456"));
//		PreparedStatement pst = con.prepareStatement("delete from invoice where bookingid = ?");
//		pst.setInt(1, dlt.bookingid);
//		pst.executeUpdate();
//	} catch (Exception e) {
//		System.out.println(e);
//
//	}
//
//}


public void confirmBooking(int bookingid) {
	Connection con;
	PreparedStatement pstmt;

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234"));
		pstmt = con.prepareStatement("update invoice set status = 'Booked' where bookingid = ?");
		pstmt.setInt(1, bookingid);

		pstmt.executeUpdate();
	} catch (Exception e) {
		System.out.println(e);
	}
}


public void cancelRequest(int bookingid) {
	Connection con;
	PreparedStatement pstmt;

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234"));
		pstmt = con.prepareStatement("update invoice set status = 'Cancelrequest' where bookingid = ?");
		pstmt.setInt(1, bookingid);
		pstmt.executeUpdate();
	} catch (Exception e) {
		System.out.println(e);
	}
}

public List<Booking> getcancelRequ() {
	Connection con;
	PreparedStatement pstmt;
	slist = new ArrayList<>();
	Booking s;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
	pstmt = con.prepareStatement("select * from invoice where status='Cancelrequest'");

	ResultSet rs = pstmt.executeQuery();
	while (rs.next()) {

		s = new Booking();
		s.setBookingid(rs.getInt(1));
		s.setPassanger_id(rs.getInt(2));
		s.setPassanger_name(rs.getString(3));
		s.setFlight_number(rs.getString(5));
		s.setFlight_name(rs.getString(6));
		s.setFrom_city(rs.getString(7));
		s.setTo_city(rs.getString(8));
		s.setFlying_date(rs.getString(9));
		s.setClasscatagory(rs.getString(10));
		s.setSeat(rs.getString(11));
		s.setGate(rs.getString(12));
		s.setBooking_date(rs.getString(15));
		s.setStatus(rs.getString(17));
		slist.add(s);
	}
} catch (Exception e) {
	System.out.println(e);
}
return slist;
}


public void cancelRequestConfirm() {
	PreparedStatement pstmt;
	Connection con;

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234"));
		pstmt = con.prepareStatement("update invoice set status = 'Cancel',seat='',cancel_date=CURDATE(),refundable_amount=total_amount*.20 where status='Cancelrequest'");

		pstmt.executeUpdate();
	} catch (Exception e) {
		System.out.println(e);
	}
}


public List<Booking> getAllBookings(int pid) {
	Connection con;
	PreparedStatement pstmt;
	slist = new ArrayList<>();
	Booking s;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
	pstmt = con.prepareStatement("select * from invoice where passanger_id=?");
	pstmt.setInt(1, pid);
	ResultSet rs = pstmt.executeQuery();
	while (rs.next()) {

		s = new Booking();
		s.setBookingid(rs.getInt(1));
		s.setPassanger_id(rs.getInt(2));
		s.setPassanger_name(rs.getString(3));
		s.setFlight_number(rs.getString(5));
		s.setFlight_name(rs.getString(6));
		s.setFrom_city(rs.getString(7));
		s.setTo_city(rs.getString(8));
		s.setFlying_date(rs.getString(9));
		s.setReturn_date(rs.getString(10));
		s.setClasscatagory(rs.getString(11));
		s.setSeat(rs.getString(12));
		s.setGate(rs.getString(13));
		s.setBooking_date(rs.getString(16));
		s.setStatus(rs.getString(17));
		slist.add(s);
	}
} catch (Exception e) {
	System.out.println(e);
}
return slist;
}


public List<Booking> getAllBookingsById(int pid) {
	Connection con;
	PreparedStatement pstmt;
	slist = new ArrayList<>();
	Booking s;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
	pstmt = con.prepareStatement("select * from invoice where passanger_id=?");
	pstmt.setInt(1, pid);
	ResultSet rs = pstmt.executeQuery();
	while (rs.next()) {

		s = new Booking();
		s.setBookingid(rs.getInt(1));
		s.setPassanger_id(rs.getInt(2));
		s.setPassanger_name(rs.getString(3));
		s.setFlight_number(rs.getString(5));
		s.setFlight_name(rs.getString(6));
		s.setFrom_city(rs.getString(7));
		s.setTo_city(rs.getString(8));
		s.setFlying_date(rs.getString(9));
		s.setReturn_date(rs.getString(10));
		s.setClasscatagory(rs.getString(11));
		s.setSeat(rs.getString(12));
		s.setGate(rs.getString(13));
		s.setArrival_time(rs.getString(14));
		s.setDeparture_time(rs.getString(15));
		s.setBooking_date(rs.getString(16));
		s.setStatus(rs.getString(17));
		slist.add(s);
	}
} catch (Exception e) {
	System.out.println(e);
}
return slist;
}



public Booking ticketGetting(int bookingid) {
	Connection con;
	PreparedStatement pstmt;
	Booking s =null;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
	pstmt = con.prepareStatement("select * from invoice where bookingid=?");
	pstmt.setInt(1, bookingid);
	ResultSet rs = pstmt.executeQuery();
	while (rs.next()) {

		s = new Booking();
		s.setBookingid(rs.getInt(1));
		s.setPassanger_id(rs.getInt(2));
		s.setPassanger_name(rs.getString(3));
		s.setFlight_number(rs.getString(5));
		s.setFlight_name(rs.getString(6));
		s.setFrom_city(rs.getString(7));
		s.setTo_city(rs.getString(8));
		s.setFlying_date(rs.getString(9));
		s.setReturn_date(rs.getString(10));
		s.setClasscatagory(rs.getString(11));
		s.setSeat(rs.getString(12));
		s.setGate(rs.getString(13));
		s.setArrival_time(rs.getString(14));
		s.setDeparture_time(rs.getString(15));
		s.setBooking_date(rs.getString(16));
		s.setStatus(rs.getString(17));
		slist.add(s);
	}
} catch (Exception e) {
	System.out.println(e);
}
return s;
}


public List<Booking> allpendingList() {
	Connection con;
	PreparedStatement pstmt;
	slist = new ArrayList<>();
	Booking s;

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
		pstmt = con.prepareStatement("select * from invoice where status='Pending'");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {

			s = new Booking();
			s.setBookingid(rs.getInt(1));
			s.setPassanger_id(rs.getInt(2));
			s.setPassanger_name(rs.getString(3));
			s.setFlight_number(rs.getString(5));
			s.setFlight_name(rs.getString(6));
			s.setFrom_city(rs.getString(7));
			s.setTo_city(rs.getString(8));
			s.setFlying_date(rs.getString(9));
			s.setClasscatagory(rs.getString(10));
			s.setSeat(rs.getString(11));
			s.setGate(rs.getString(12));
			s.setBooking_date(rs.getString(15));
			s.setStatus(rs.getString(17));
			slist.add(s);
		}
	} catch (Exception e) {
		System.out.println(e);

	}
	return slist;
}

public List<Booking> allbookedSeat(String flightnumber, String flying_date, String return_date) {
	Connection con;
	PreparedStatement pstmt;
	slist = new ArrayList<>();
	Booking s;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "1234");
	pstmt = con.prepareStatement("select seat from invoice where  flight_number=? and (flying_date=? or return_date=? ) and ( status='Booked' or status='Pending') ");
	pstmt.setString(1, flightnumber);
	pstmt.setString(2, flying_date);
	pstmt.setString(3, return_date);
	ResultSet rs = pstmt.executeQuery();
	while (rs.next()) {
		s = new Booking();
		s.setSeat(rs.getString(1));
		slist.add(s);
	}
} catch (Exception e) {
	System.out.println(e);
}
return slist;
}

}
