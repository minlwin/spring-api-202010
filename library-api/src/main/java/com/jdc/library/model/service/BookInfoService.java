package com.jdc.library.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.BookInfo;
import com.jdc.library.model.repo.BookInfoRepo;

@Service
public class BookInfoService extends BaseService<BookInfo, Integer>{

	@Autowired
	public BookInfoService(BookInfoRepo repo) {
		super(repo);
	}
	
}
