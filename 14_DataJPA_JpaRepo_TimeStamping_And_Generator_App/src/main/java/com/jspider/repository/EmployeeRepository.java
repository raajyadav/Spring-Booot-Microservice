package com.jspider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
