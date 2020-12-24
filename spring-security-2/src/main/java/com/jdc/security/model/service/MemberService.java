package com.jdc.security.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jdc.security.model.entity.Member;
import com.jdc.security.model.repo.MemberRepo;

@Service
public class MemberService {

	@Autowired
	private MemberRepo repo;
	@Autowired
	private PasswordEncoder encoder;

	public boolean thereIsNoUser() {
		return repo.count() == 0;
	}

	public Member create(Member member) {
		member.setPassword(encoder.encode(member.getPassword()));
		return repo.save(member);
	}

	public Member findByLoginId(String loingId) {
		return repo.findOneByLoginId(loingId).orElseThrow();
	}
}
