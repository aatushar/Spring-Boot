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
public class CustomarController {
	List <Customar> pList = new ArrayList<>();

	@RequestMapping(value="/customar/all")
	List<Customar> allCustomar(){
		CustomarDA d=new CustomarDA();
		pList=d.allCustomar();
		return pList;
		
	}
	@PostMapping(value ="/customarinsert")
	public void insert(@RequestBody Customar s) {
		CustomarDA d=new CustomarDA();
			d.insert(s);

	}
//	@PostMapping(value ="/customar/update")
//	public void update(@RequestBody Customar p) {
//		CustomarDA d = new CustomarDA();
//			d.updateCustomar(p);
//
//	}
//	@PostMapping(value ="/customar/delete")
//	public void delete(@RequestBody Customar x) {
//		CustomarDA d = new CustomarDA();
//			d.deleteCustomar(x);
//
//	}
	@GetMapping(value ="/customar/{customer_id}")
	public Customar getcustomarById(@PathVariable("customer_id") int customer_id) {
		Customar s ;
		CustomarDA d = new CustomarDA();
		s=d.customarById(customer_id);
		return s;
	}

}
