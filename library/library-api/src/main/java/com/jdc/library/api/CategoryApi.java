package com.jdc.library.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.entity.Category;
import com.jdc.library.model.service.CategoryService;

@RestController
@RequestMapping("category")
public class CategoryApi extends BaseApi<Category, Integer>{

	@Autowired
	public CategoryApi(CategoryService service) {
		super(service);
	}
}
