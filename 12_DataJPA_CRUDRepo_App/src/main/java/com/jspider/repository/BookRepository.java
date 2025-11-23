package com.jspider.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jspider.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

	public List<Book> findByBookPriceGreaterThan(Double price);
	
	public List<Book> findByBookIdGreaterThan(Integer id );
	
	public List<Book> findByBookName(String name);
	
	//SQL QUERY
	@Query(value = "select * from book", nativeQuery=true)
	public List<Book> getAllBooks();
	
	//HQL QUERY
	@Query("from Book")
	public List<Book> getBooks();
	
	
	
}
