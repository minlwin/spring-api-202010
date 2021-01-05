package com.jdc.library.model.service;

import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseRepository;
import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.Member;

@Service
public class MemberTypeService extends BaseService<Member, Integer> {

	public MemberTypeService(BaseRepository<Member, Integer> repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

}
