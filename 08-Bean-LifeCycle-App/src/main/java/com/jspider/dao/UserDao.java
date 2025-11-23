package com.jspider.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component("userDao")
public class UserDao implements InitializingBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("get data from db...");
		System.out.println("store data into redis");
		
	}

	
}
