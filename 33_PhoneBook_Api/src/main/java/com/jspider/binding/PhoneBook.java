package com.jspider.binding;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PhoneBook {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Long phon;
	private String email;
}
