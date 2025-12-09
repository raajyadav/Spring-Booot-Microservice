package com.jspider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspider.request.Customer;

import com.jspider.response.User;
import com.jspider.service.UserService;

@Controller
public class PhoneBookController {

	@Autowired
	private UserService service;
	
	@GetMapping("/contact/{id}")
	public String deleteContact(@PathVariable("id") Integer id, Model model) {
	User user =	service.deleteById(id);
	
	model.addAttribute("contacts", user);
		return "data";
	}
	
	@PutMapping("/contact")
	public String updateContact(Customer customer, Model model) {
	User user = service.upsertContact(customer);
	model.addAttribute("contacts", user);
	return "index";
	}
	
	@GetMapping("/contacts")
	public String getAllContacts(Model model) {
	List<User> user = service.getAllContacts();
		model.addAttribute("contacts", user);
		return "data";
	}
	
	@PostMapping("/contacts")
	public String insertContact(@ModelAttribute("customer") Customer customer, Model model) {
		System.out.println(customer);
	User user =	service.upsertContact(customer);
	model.addAttribute("msg", "contact saved");
	  return "index";
		
	}
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "index";
	}
}
