package com.jspider.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("userDao")
public class UserService {

	UserService(){
		System.out.println("getting data from redis");
	}
}
