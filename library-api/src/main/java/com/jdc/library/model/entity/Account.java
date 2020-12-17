package com.jdc.library.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private Role role;
	@Column(nullable = false, unique = true)
	private String loginId;
	@Column(nullable = false)
	private String phone;
	private String email;

	public enum Role {
		Admin, Manager, Employee
	}
}
