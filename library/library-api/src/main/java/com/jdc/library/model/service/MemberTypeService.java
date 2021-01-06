package com.jdc.library.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.library.model.BaseService;
import com.jdc.library.model.entity.MemberType;
import com.jdc.library.model.repo.MemberTypeRepo;

@Service
public class MemberTypeService extends BaseService<MemberType, Integer> {

	@Autowired
	public MemberTypeService(MemberTypeRepo repo) {
		super(repo);
	}

}
