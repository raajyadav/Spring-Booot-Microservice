package com.jspider.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.binding.Student;
import com.jspider.entity.StudentEntity;
import com.jspider.repository.StudentRepository;



@Service
public class StudentService {
	
	   @Autowired
	   private StudentRepository repository;
	
	public boolean saveStudent(Student student) {
		
		System.out.println(student);
		
		StudentEntity entity = new StudentEntity();
		
		BeanUtils.copyProperties(student, entity);
		
		entity.setTimings(Arrays.toString(student.getTimings()));
		
		System.out.println(entity);
		
		repository.save(entity);
		
		return true;
	}

	public List<String> getCourses(){
		return Arrays.asList("Java", "AWS","DevOPs","Microservice");
	}
	
	public List<String> getTiming(){
		return Arrays.asList("Morning", "Afternoon", "Evening");
	}
}
