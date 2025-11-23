package com.jspider.repository;

import org.springframework.data.repository.CrudRepository;

import com.jspider.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
