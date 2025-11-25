package com.jspider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
