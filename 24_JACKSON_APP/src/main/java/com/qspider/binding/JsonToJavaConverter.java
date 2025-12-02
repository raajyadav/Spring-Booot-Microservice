package com.qspider.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File f = new File("customer.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		Customer c = mapper.readValue(f, Customer.class);
		
		System.out.println(c);
	}
}
