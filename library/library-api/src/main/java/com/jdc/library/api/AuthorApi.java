package com.jdc.library.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.entity.Author;
import com.jdc.library.model.service.AuthorService;

@RestController
@RequestMapping("author")
public class AuthorApi extends BaseApi<Author, Integer>{

	public AuthorApi(AuthorService service) {
		super(service);
	}

}
