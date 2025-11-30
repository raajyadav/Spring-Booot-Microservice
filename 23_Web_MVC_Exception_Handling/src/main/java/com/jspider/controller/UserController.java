package com.jspider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

      

    private Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/user")
	public String getGreetMsg(Model model) {
		String msgTxt = "Welcome to qspider...";
		int i = 10/0;
		model.addAttribute("msg", msgTxt);
		return "index";
	}
	
//	@ExceptionHandler(value = Exception.class)  /* Local Exception Handler */
//	public String handleAE(Exception e ) {
////		String msg = e.getMessage();
//	   logger.error(e.getMessage());
//		return "errorPage";
//	}
}
