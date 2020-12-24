package com.jdc.security.model.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jdc.security.model.repo.MemberRepo;

@Service
public class AppUserDetailService implements UserDetailsService{

	@Autowired
	private MemberRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
		return repo.findOneByLoginId(loginId).map(m -> User.builder()
				.username(m.getLoginId())
				.password(m.getPassword())
				.authorities(m.getRole().name())
				.accountLocked(m.isRequestRecovery())
				.accountExpired(null != m.getExpireDate() && LocalDate.now().compareTo(m.getExpireDate()) >= 0)
				.build()).orElseThrow();
	}

}
