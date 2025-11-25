package com.jspider;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jspider.entity.Book;
import com.jspider.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	  ConfigurableApplicationContext context =	SpringApplication.run(Application.class, args);
//	  
//	BookRepository repo=   context.getBean(BookRepository.class);
//	
//	 Book b = new Book();
//	 b.setBookId(101);
//	 b.setBookName("Java");
//	 b.setBookPrice(2000.0);
//	 
//	 Book b2 = new Book();
//	 b2.setBookId(102);
//	 b2.setBookName("Microservices");
//	 b2.setBookPrice(3000.0);
//	 
//	 Book b3 = new Book();
//	 b3.setBookId(103);
//	 b3.setBookName("React-Js");
//	 b3.setBookPrice(1500.0);
//	 
//	 Book b4 = new Book();
//	 b4.setBookId(104);
//	 b4.setBookName("Node-Js");
//	 b4.setBookPrice(2500.0);
//	 
//	 repo.saveAll(Arrays.asList(b,b2,b3,b4));
//	 
//	 System.out.println("Record saved....");
//	 
	}

}
