package com.jdc.library.model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


public abstract class BaseApi<T, ID> {

	protected BaseService<T, ID> service;

	public BaseApi(BaseService<T, ID> service) {
		super();
		this.service = service;
	}

	@PostMapping
	public T create(@RequestBody T t) {
		return service.save(t);
	}


	@PutMapping
	public T update(@RequestBody T t) {
		return service.save(t);
	}
}
