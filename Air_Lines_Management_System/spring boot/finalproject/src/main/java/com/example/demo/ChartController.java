package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class ChartController {

	@GetMapping(value ="/totalamount/{totalEarning}")
	public Chart totalearnings(@PathVariable("totalEarning") String totalEarning) {
		Chart s ;
		ChartDA d = new ChartDA();
		s=d.totalearning(totalEarning);
		return s;
	}
	
	@GetMapping(value ="/earningusbangla/{usbangla}")
	public Chart usbanglaearnings(@PathVariable("usbangla") String usbangla) {
		Chart s ;
		ChartDA d = new ChartDA();
		s=d.usBanglaEarning(usbangla);
		return s;
	}
	
	@GetMapping(value ="/bbangladesh/{bimanbangladesh}")
	public Chart bbangladeshearnings(@PathVariable("bimanbangladesh") String bimanbangladesh) {
		Chart s ;
		ChartDA d = new ChartDA();
		s=d.bimanbangladeshEarning(bimanbangladesh);
		return s;
	}
	@GetMapping(value ="/nair/{novoair}")
	public Chart nairearnings(@PathVariable("novoair") String novoair) {
		Chart s ;
		ChartDA d = new ChartDA();
		s=d.novoairEarning(novoair);
		return s;
	}
	
}
