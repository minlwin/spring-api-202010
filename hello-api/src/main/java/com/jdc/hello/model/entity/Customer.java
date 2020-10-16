package com.jdc.hello.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String phone;
	private String email;

}
