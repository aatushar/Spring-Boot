package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class LoginController {
	@PostMapping(value="/login")

	public Login save(@RequestBody Login u) {
	LoginDA d =new LoginDA();
	return d.check(u);
	}

}
