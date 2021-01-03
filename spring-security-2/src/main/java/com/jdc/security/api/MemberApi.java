package com.jdc.security.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.security.model.entity.Member;
import com.jdc.security.model.repo.MemberRepo;

@RestController
@RequestMapping("members")
public class MemberApi {

	@Autowired
	private MemberRepo repo;
	
	@GetMapping
	public List<Member> getAll() {
		return repo.findAll();
	}
}
