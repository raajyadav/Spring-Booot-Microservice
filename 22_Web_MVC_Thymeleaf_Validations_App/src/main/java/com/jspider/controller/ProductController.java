package com.jspider.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspider.entity.Product;
import com.jspider.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository repository;

	@GetMapping("/edit")
	public String edit(@RequestParam("pid") Integer pid, Model model) {
		Optional<Product> findById = repository.findById(pid);
		if (findById.isPresent()) {
			Product product = findById.get();
			model.addAttribute("product", product);
		}
		return "index";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("pid") Integer pid, Model model) {
		repository.deleteById(pid);
		model.addAttribute("msg", "Product Deleted");
		model.addAttribute("products", repository.findAll());
		return "data";
	}

	@GetMapping("/products")
	public String getAllProduct(Model model) {
		List<Product> productList = repository.findAll();
		model.addAttribute("products", productList);
		return "data";
	}

	@PostMapping("/product")
	public String saveProduct(@Validated @ModelAttribute("product") Product p, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "index";
		}

		p = repository.save(p);
		if (p.getPid() != null) {
			model.addAttribute("msg", "Product Saved");
		}
		return "index";
	}

	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}

}
