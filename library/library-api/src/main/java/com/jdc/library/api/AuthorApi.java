package com.jdc.library.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.Author;

@RestController
@RequestMapping("author")
public class AuthorApi extends BaseApi<Author, Integer>{

	public AuthorApi(BaseService<Author, Integer> service) {
		super(service);
	}

}
