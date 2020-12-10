package com.jdc.library.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.library.model.entity.Category;
import com.jdc.library.model.repo.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo repo;

	public List<Category> search() {
		return repo.findAll();
	}

	public Category save(Category c) {
		return repo.save(c);
	}
}
