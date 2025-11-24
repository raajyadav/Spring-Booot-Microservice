package com.jspider;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.jspider.entity.Employee;
import com.jspider.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	private final EmployeeRepository employeeRepository;

	Application(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

//		System.out.println(repository.getClass().getName());
//	====================================================================================	
//		Employee e1 = new Employee(1,"Raj",50000.0,"Male","Account");
//		Employee e2 = new Employee(2,"Nitesh",40000.0,"Male","Sales");
//		Employee e3 = new Employee(3,"Kishan",45000.0,"Male","Manager");
//		Employee e4 = new Employee(4,"Mrunal",60000.0,"Female","HR");
//		Employee e5 = new Employee(5,"Rajesh",50000.0,"Male","Marketing");
//		Employee e6 = new Employee(6,"Sonu",50000.0,"Male","Admin");
//		Employee e7 = new Employee(7,"Monika",80000.0,"Female","CEO");
//		
//		repository.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7));
//		
//		System.out.println("Record saved.......");

//		List<Employee> emps = repository.findAll();
//		emps.forEach(System.out::println);

//		==================================================
//		SORTING
//		Sort sort =  Sort.by("empName").ascending();
//		
//		List<Employee> emps = repository.findAll(sort);
//		
//		emps.forEach(System.out::println);
//		
//       ====================================================	
//		Sort sort = Sort.by("empName").descending();
//
//		List<Employee> emps = repository.findAll(sort);
//		
//		emps.forEach(System.out::println);

//		=======================================================

//		Sort sort = Sort.by("empSalary").ascending();
//		
//	   List<Employee> emps = repository.findAll(sort);
//	   
//	   emps.forEach(System.out::println);

//		======================================================

//		Sort sort = Sort.by("empSalary").descending();
//
//		List<Employee> emps = repository.findAll(sort);
//
//		emps.forEach(System.out::println);

//		=======================================================

//		Sort sort = Sort.by("empName", "empSalary").descending();
//		
//		List<Employee> emps = repository.findAll(sort);
//		
//		emps.forEach(System.out::println);

//		========================================================

//		Sort sort = Sort.by("empName", "empSalary").ascending();
//
//		List<Employee> emps = repository.findAll(sort);
//		
//		emps.forEach(System.out::println);

//		========================================================

//		PAGINATION
//		==========
//		int pageNo = 1;
//		PageRequest page = PageRequest.of(pageNo-1, 3);
//		
//		Page<Employee> findAll = repository.findAll(page);
//		
//		List<Employee> emp = findAll.getContent();
//		
//		emp.forEach(System.out::println);
//		
//       =============================================================
//		QueryByExample
//		==============

		Employee emp = new Employee();
		emp.setEmpGender("Female");
		emp.setDept("CEO");

		Example<Employee> example = Example.of(emp);
		
		List<Employee> emps = repository.findAll(example);
		
		emps.forEach(System.out::println);

	}

}
