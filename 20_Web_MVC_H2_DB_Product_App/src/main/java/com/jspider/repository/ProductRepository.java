package com.jspider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
