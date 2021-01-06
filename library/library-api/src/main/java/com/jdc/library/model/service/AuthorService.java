package com.jdc.library.model.service;

import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.Author;
import com.jdc.library.model.repo.AuthorRepo;

@Service
public class AuthorService extends BaseService<Author, Integer>{

	public AuthorService(AuthorRepo repo) {
		super(repo);
	}

}
