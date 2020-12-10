package com.jdc.library.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.entity.Category;
import com.jdc.library.model.service.CategoryService;

@RestController
@RequestMapping("category")
public class CategoryApi {

	@Autowired
	private CategoryService service;
	
	@GetMapping
	public List<Category> search() {
		return service.search();
	}
	
	@PostMapping
	public Category create(@RequestBody Category c) {
		return service.save(c);
	}
	
	@PutMapping
	public Category update(@RequestBody Category c) {
		return service.save(c);
	}
	
}
