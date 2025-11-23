package com.jspider;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jspider.entity.Book;
import com.jspider.repository.BookRepository;

@SpringBootApplication
public class Application {

	private final BookRepository bookRepository;

	Application(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		BookRepository repo = ctxt.getBean(BookRepository.class);

//	System.out.println(repo.getClass().getName());

//	Book book = new Book();
//	book.setBookId(102);
//	book.setBookName("React");
//	book.setBookPrice(231.89);
//	
//	repo.save(book);
//	
//	System.out.println("Record Inserted.....");
//
		Optional<Book> findById = repo.findById(102);
		System.out.println(findById.get());

	}

}
