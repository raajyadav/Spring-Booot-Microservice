package com.jspider.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public List<String> getCourse(){
		return Arrays.asList("Java", "Python", "AWS", "DevOps");
	}
	
   public List<String> getTimings(){
	   return Arrays.asList("Morning", "Afternoon", "Evening");
   }
}
