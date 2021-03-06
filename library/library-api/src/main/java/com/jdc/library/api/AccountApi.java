package com.jdc.library.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.entity.Account;
import com.jdc.library.model.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountApi extends BaseApi<Account, Integer>{

	public AccountApi(AccountService service) {
		super(service);
	}
	
}
