package com.jdc.library.model.service;

import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.Account;
import com.jdc.library.model.repo.AccountRepo;

@Service
public class AccountService extends BaseService<Account, Integer>{
	
	public AccountService(AccountRepo repo) {
		super(repo);
	}

}
