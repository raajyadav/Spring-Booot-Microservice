package com.jspider.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/contact")
	public String contact() {
		return "Contact Us :: 9818765433";
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		return "Good Evening...";
	}
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to our App";
	}
}
