package com.jdc.library.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.entity.BookStatusHistory;
import com.jdc.library.model.service.BookStatusService;

@RestController
@RequestMapping("book-status")
public class BookStatusHistoryApi extends BaseApi<BookStatusHistory, Integer>{

	public BookStatusHistoryApi(BookStatusService service) {
		super(service);
	}

}
