package com.jdc.library.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.BookStatusHistory;
import com.jdc.library.model.repo.BookStatusHistoryRepo;

@Service
public class BookStatusService extends BaseService<BookStatusHistory, Integer>{

	@Autowired
	public BookStatusService(BookStatusHistoryRepo repo) {
		super(repo);
	}

}
