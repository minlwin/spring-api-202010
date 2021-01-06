package com.jdc.library.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.Page;
import com.jdc.library.model.entity.Category;
import com.jdc.library.model.service.CategoryService;


@RestController
@RequestMapping("category")
public class CategoryApi extends BaseApi<Category, Integer>{

	public CategoryApi(CategoryService service) {
		super(service);
	}
	
	@GetMapping
	public Page<Category> getAll() {
		return service.getAll();
	}
}
