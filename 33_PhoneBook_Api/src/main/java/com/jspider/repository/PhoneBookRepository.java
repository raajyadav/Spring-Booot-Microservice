package com.jspider.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.binding.PhoneBook;

public interface PhoneBookRepository extends JpaRepository<PhoneBook, Serializable>{

}
