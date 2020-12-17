package com.jdc.library.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class BookInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String title;
	@ManyToMany
	private List<Category> categories = new ArrayList<>();
	@ManyToMany
	private List<Author> authros = new ArrayList<>();
	private String language;
	private String publishedYear;
	private String publisher;
	private String remark;
}
