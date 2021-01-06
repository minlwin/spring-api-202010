package com.jdc.library.model.service;

import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.Book;
import com.jdc.library.model.entity.BookPk;
import com.jdc.library.model.repo.BookRepo;

@Service
public class BookService extends BaseService<Book, BookPk>{

	public BookService(BookRepo repo) {
		super(repo);
	}

}
