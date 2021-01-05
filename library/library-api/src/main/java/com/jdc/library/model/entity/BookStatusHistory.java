package com.jdc.library.model.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.jdc.library.model.entity.Book.Status;

import lombok.Data;

@Data
@Entity
public class BookStatusHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Book book;
	private Status status;
	@ManyToOne
	private Member member;
	private LocalDate issueDate;
	private String remark;
}
