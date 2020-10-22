package com.jdc.customers.model.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;

import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@TableGenerator(allocationSize = 1, name = "account_seq")
public abstract class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "account_seq")
	private int id;
	private String name;
	private String phone;
	private String password;
	private Role role;
	private LocalDate registrationDate;
	
	public enum Role {
		Admin, Employee, Customer
	}
}
