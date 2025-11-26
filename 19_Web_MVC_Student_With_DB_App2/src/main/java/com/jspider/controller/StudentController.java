package com.jspider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jspider.binding.Student;
import com.jspider.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String loadIndexPage(Model model) {

		System.out.println();

		init(model);

		return "index";
	}

	private void init(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("course", service.getCourses());
		model.addAttribute("timing", service.getTiming());
	}

	@PostMapping("/save")
	public String handleSubmitBtn(Student s, Model model) {
		boolean isSaved = service.saveStudent(s);
		if (isSaved) {
			model.addAttribute("msg", "Data saved...");
		}
		init(model);

		return "index";

	}
}
