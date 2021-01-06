package com.jdc.library.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.entity.BookInfo;
import com.jdc.library.model.service.BookInfoService;

@RestController
@RequestMapping("book-info")
public class BookInfoApi extends BaseApi<BookInfo, Integer>{

	public BookInfoApi(BookInfoService service) {
		super(service);
	}

}
