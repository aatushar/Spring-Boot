package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class CityController {
	List <City> pList = new ArrayList<>();

	@RequestMapping(value="/city/all")
	List<City> allstudents(){
		CityDA d=new CityDA();
		pList=d.allCity();
		return pList;
		
	}
	@PostMapping(value ="/city/insert")
	public void insert(@RequestBody City s) {
		CityDA d = new CityDA();
			d.insert(s);

	}
	@GetMapping(value ="/city/{id}")
	public City getCityById(@PathVariable("id") int id) {
		City s ;
		CityDA d = new CityDA();
		s=d.cityById(id);
		return s;
	}
	
	@PostMapping(value ="/city/delete")
	public void delete(@RequestBody City x) {
		CityDA d = new CityDA();
			d.deleteCity(x);

	}

}
