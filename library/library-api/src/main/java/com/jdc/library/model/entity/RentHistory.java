package com.jdc.library.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class RentHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	private Book book;
	@ManyToOne
	private Member member;
	private LocalDateTime rentFrom;
	private LocalDateTime rentTo;
	private LocalDateTime retunDate;
	private Status status;
	private String remark;
	
	public enum Status {
		Rent, 
		Extended,
		Returned,
		Lost,
		Damage
	}
}
