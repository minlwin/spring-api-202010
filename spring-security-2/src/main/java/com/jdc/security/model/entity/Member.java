package com.jdc.security.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(nullable = false, unique = true)
	private String loginId;
	@Column(nullable = false)
	private String password;
	private String phone;
	private String email;
	@Column(nullable = false)
	private Role role;
	
	public enum Role {
		Libarian, Member, Admin
	}
}
