package com.jspider.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "emp_table")
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String empGender;
	private String dept;
}
