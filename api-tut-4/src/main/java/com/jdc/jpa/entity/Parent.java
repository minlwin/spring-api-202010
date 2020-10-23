package com.jdc.jpa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Parent implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String contact;
	private String job;
}
