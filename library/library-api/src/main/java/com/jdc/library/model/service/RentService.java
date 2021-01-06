package com.jdc.library.model.service;

import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.RentHistory;
import com.jdc.library.model.repo.RentHistoryRepo;

@Service
public class RentService extends BaseService<RentHistory, Long>{

	public RentService(RentHistoryRepo repo) {
		super(repo);
	}

}
