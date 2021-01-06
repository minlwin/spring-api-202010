package com.jdc.library.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.entity.Book;
import com.jdc.library.model.entity.BookPk;
import com.jdc.library.model.service.BookService;

@RestController
@RequestMapping("book")
public class BookApi extends BaseApi<Book, BookPk>{

	@Autowired
	public BookApi(BookService service) {
		super(service);
	}

}
