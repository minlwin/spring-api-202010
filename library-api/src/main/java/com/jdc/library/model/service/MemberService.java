package com.jdc.library.model.service;

import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.Member;
import com.jdc.library.model.repo.MemberRepo;

@Service
public class MemberService extends BaseService<Member, Integer>{

	public MemberService(MemberRepo repo) {
		super(repo);
	}

}
