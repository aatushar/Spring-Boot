package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class FlightController {
	List <Flight> pList = new ArrayList<>();

	@RequestMapping(value="/flight/fall")
	List<Flight> allFlight(){
		FlightDA d=new FlightDA();
		pList=d.allFlight();
		return pList;
		
	}
	
	
	List <Flight> packageList = new ArrayList<>();

	@RequestMapping(value="/package/allPackage")
	List<Flight> getPackage(){
		FlightDA d=new FlightDA();
		packageList=d.allPackage();
		return packageList;
		
	}
	
	@PostMapping(value ="/flight/add")
	public void insert(@RequestBody Flight s) {
		FlightDA d=new FlightDA();
			d.insert(s);

	}
	@PostMapping(value ="/update")
	public void update(@RequestBody Flight p) {
		FlightDA d = new FlightDA();
			d.updateFlight(p);

	}
	@PostMapping(value ="/delete")
	public void delete(@RequestBody Flight x) {
		FlightDA d = new FlightDA();
			d.deleteFlight(x);

	}
	@GetMapping(value ="/flight/{id}")
	public Flight getStudentById(@PathVariable("id") int id) {
		Flight s ;
		FlightDA d = new FlightDA();
		s=d.flightById(id);
		return s;
	}
	
	@GetMapping(value ="/flight/search/{from_city}/{to_city}/{flying_date}")
	public Flight flightsearch(@PathVariable("from_city") String from_city,@PathVariable("to_city") String to_city,@PathVariable("flying_date") String flying_date) {
		Flight s ;		
		FlightDA d = new FlightDA();
		s=d.search(from_city,to_city,flying_date);
		return s;
	}
	
	
	@GetMapping(value ="/from_city")
	public List<String> getFromCityList() {
		FlightDA d = new FlightDA();
		return d.distinctFromCity();
	}
	
	@GetMapping(value ="/to_city")
	public List<String> getToCityList() {
		FlightDA d = new FlightDA();
		return d.distinctToCity();
	}
	
	@GetMapping(value ="/flight/searchReturndate/{from_city}/{to_city}")
	public Flight ReturndateSearch(@PathVariable("from_city") String from_city,@PathVariable("to_city") String to_city) {
		Flight s ;		
		FlightDA d = new FlightDA();
		s=d.returnDate(from_city,to_city);
		return s;
	}
	
}


