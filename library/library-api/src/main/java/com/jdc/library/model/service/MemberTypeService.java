package com.jdc.library.model.service;

import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.MemberType;
import com.jdc.library.model.repo.MemberTypeRepo;

@Service
public class MemberTypeService extends BaseService<MemberType, Integer> {

	public MemberTypeService(MemberTypeRepo repo) {
		super(repo);
	}

}
