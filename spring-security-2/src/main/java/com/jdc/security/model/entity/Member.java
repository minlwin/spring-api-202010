package com.jdc.security.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostPersist;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@JsonIgnore
	@Column(nullable = false)
	private String password;
	
	private String phone;
	private String email;
	@Column(nullable = false)
	private Role role;
	
	private boolean requestRecovery;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate registrationDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate expireDate;
	
	public enum Role {
		Member, Libarian, Admin
	}
	
	@PostPersist
	private void postPersist() {
		registrationDate = LocalDate.now();
	}
}
