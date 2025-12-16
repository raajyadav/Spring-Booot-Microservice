package com.jspider.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/userlogin")
	public String userLogin() {
		return "User Login";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "+91 348374477";
	}

	@GetMapping("/hi")
	public String sayHi() {
		return "Hi, How are you";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, How are you";
	}
}
