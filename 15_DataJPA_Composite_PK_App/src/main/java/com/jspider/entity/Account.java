package com.jspider.entity;


import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="account_table")
public class Account {
	
	@Column(name="acc_holder_name")
	private String holderName;
	
	private String branch;
	
	@CreationTimestamp
	@Column(name="date_created", updatable = false)
	private LocalDate dateCreated;
	
	@UpdateTimestamp
	@Column(name="date_updated", insertable=false)
	private LocalDate lastUpdated;
	
	@EmbeddedId
	private AccountPK accountPk;

}
