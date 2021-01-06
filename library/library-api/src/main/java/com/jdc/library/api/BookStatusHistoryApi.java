package com.jdc.library.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.entity.BookStatusHistory;
import com.jdc.library.model.service.BookStatusService;

@RestController
@RequestMapping("book-status")
public class BookStatusHistoryApi extends BaseApi<BookStatusHistory, Integer>{

	@Autowired
	public BookStatusHistoryApi(BookStatusService service) {
		super(service);
	}

}
