package com.jspider;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jspider.entity.Employee;
import com.jspider.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
	EmployeeRepository repository = context.getBean(EmployeeRepository.class);
	 
	Employee emp = new Employee();
	emp.setEmpId(1);
	emp.setEmpName("Sanjiv");
	emp.setEmpSalary(60000.0);
	emp.setEmpDept("Accountant");
    emp.setEmpGender("Male");
    
    repository.save(emp);
	}

}
