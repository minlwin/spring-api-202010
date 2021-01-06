package com.jdc.library.model.service;

import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.BookStatusHistory;
import com.jdc.library.model.repo.BookStatusHistoryRepo;

@Service
public class BookStatusService extends BaseService<BookStatusHistory, Integer>{

	public BookStatusService(BookStatusHistoryRepo repo) {
		super(repo);
	}

}
