package com.jspider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jspider.entity.Product;
import com.jspider.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	

	@GetMapping("/")
	public String loadForm(Model model) {	
		model.addAttribute("p", new Product());
		return "index";
	}
	
	@PostMapping("/product")
	public String handleSave(@ModelAttribute("p") Product p, Model model) {
		p =repository.save(p);
		
		if(p.getPid()!=null) {
			model.addAttribute("msg", "Product saved");
		}
		
		return "index";
	}
	
	@GetMapping("/products")
	public String loadProducts(Model model) {
	    model.addAttribute("products", repository.findAll());
		return "data";
	}
}
