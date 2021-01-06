package com.jdc.library.model.service;

import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.Category;
import com.jdc.library.model.repo.CategoryRepo;

@Service
public class CategoryService extends BaseService<Category, Integer>{

	
	public CategoryService(CategoryRepo repo) {
		super(repo);
	}

}
