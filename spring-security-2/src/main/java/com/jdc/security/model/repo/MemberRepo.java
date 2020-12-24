package com.jdc.security.model.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc.security.model.entity.Member;

public interface MemberRepo extends JpaRepository<Member, Integer>{
	Optional<Member> findOneByLoginId(String loginId);
}
