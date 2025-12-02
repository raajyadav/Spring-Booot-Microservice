package com.qspider.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Address address = new Address();
		address.setCity("Noida");
		address.setState("UP");
		address.setCountry("India");
		
		Customer c = new Customer();
		c.setId(101);
		c.setName("Raj");
		c.setEmail("raj@gmail.com");
		c.setPhno(2244566662l);
		c.setAddress(address);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("Json file Created");
		
	}
}
