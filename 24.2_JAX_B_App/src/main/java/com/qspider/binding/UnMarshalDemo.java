package com.qspider.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshalDemo {

	public static void main(String[] args) throws JAXBException {

		File f = new File("customer.xml");

		JAXBContext context = JAXBContext.newInstance(Customer.class);

		Unmarshaller unmarshaller = context.createUnmarshaller();

		Object object = unmarshaller.unmarshal(f);

		Customer c = (Customer) object;
		
		System.out.println(c);

	}
}
