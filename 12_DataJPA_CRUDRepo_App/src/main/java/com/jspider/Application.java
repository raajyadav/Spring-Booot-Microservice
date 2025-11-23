package com.jspider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

		Book book1 = new Book();
		book1.setBookId(102);
		book1.setBookName("CSS");
		book1.setBookPrice(2000.00);

		Book book2 = new Book();
		book2.setBookId(105);
		book2.setBookName("React-Native");
		book2.setBookPrice(2600.00);

//	List<Book> bookList = new ArrayList<>();
//	bookList.add(book1);
//	bookList.add(book2);
//	repo.saveAll(bookList);
//	

//    repo.saveAll(Arrays.asList(book1,book2)); /* to insert multiple object */
//
//		System.out.println("Record Inserted.....");

//		Optional<Book> findById = repo.findById(102);
//		System.out.println(findById.get());

//		boolean status = repo.existsById(101); /* to check the presence of data by ID */
//		System.out.println("Presence :: "+ status);

//		Long count = repo.count(); /* It count Total Record in the Table*/
//		System.out.println("Total Data is: "+ count);

//		Optional<Book> findById = repo.findById(103);
//		if(findById.isPresent())
//			System.out.println(findById.get());
//		else
//			System.out.println("Not Such Record in Table");
//		
//	   Iterable<Book> findAllById = repo.findAllById(Arrays.asList(101,102,103));
//	
//	   for(Book b:findAllById) {
//		System.out.println(b);
//	   }

//	   Iterable<Book> findAll =repo.findAll();
//	 
//	   for(Book b:findAll) {
//		   System.out.println(b);
//	   }

//		repo.deleteById(305); /* For delete */
//		if(repo.existsById(204)) {
//			repo.deleteById(205);
//		}else {
//			System.out.println("No record Found");
//		}
//		
// 	repo.deleteAllById(Arrays.asList(102,103));

		// FINDBY METHOD

//		List<Book> findByBookPriceGreaterThan = repo.findByBookPriceGreaterThan(2000.0);
//		for(Book b:findByBookPriceGreaterThan) {
//			System.out.println(b);
//		}

//	List<Book> findByBookIdGreaterThan = 	repo.findByBookIdGreaterThan(103);
//	for(Book b:findByBookIdGreaterThan) {
//		System.out.println(b);
//	}
		
//	List<Book> findByBookName =	repo.findByBookName("Java");
//	for(Book b:findByBookName) {
//		System.out.println(b);
//	}
		
//	List<Book> getAllBooks = repo.getAllBooks();
//	for(Book b:getAllBooks) {
//		System.out.println(b);
//	}
		
		List<Book> getBooks = repo.getBooks();
		for(Book b:getBooks) {
			System.out.println(b);
		}

	}

}
