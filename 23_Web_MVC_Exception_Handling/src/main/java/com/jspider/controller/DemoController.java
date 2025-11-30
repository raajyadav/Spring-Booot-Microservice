package com.jspider.controller;



import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

  
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		String msgTxt = "Welcome to qspider...";
		model.addAttribute("msg", msgTxt);
		return "index";
	}
	
	@GetMapping("/wish")
	public String getWishMsg(Model model) {
		String msgText = "Good Evening";
//		int i = 10/0;
		String s =null;
		s.length(); 
		model.addAttribute("msg", msgText);
		return "index";
	}
	

}
