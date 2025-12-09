package com.jspider.rest;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jspider.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFeignClient greetClient;

	@GetMapping("/welcome")
	public String getWelocmeMsg() { 
		
	 String greetResp =	greetClient.invokeGreetApi();
		
		return  greetResp + " , Welcome to Jspider";
		
//      ANOTHER METHOD ('THIS IS HARD CORE URL') MEANS TIGHTLY COUPLING WITH PORT 8081
//		RestTemplate rt = new RestTemplate();  
//		
//		ResponseEntity<String> forEntity = rt.getForEntity("http://localhost:8081/greet",String.class );
//		
//		String greetResp = forEntity.getBody();
//
//		return greetResp + " ,Welcome to Qspider";
		
	}
}
