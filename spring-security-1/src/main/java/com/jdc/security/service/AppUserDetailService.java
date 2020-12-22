package com.jdc.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AppUserDetailService implements UserDetailsService{
	
	@Autowired
	private AppUserRepository repo;
	
	@Autowired
	private PasswordEncoder encoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		return repo.findByLoginId(username)
				.map(u -> User.builder()
						.username(u.getLoginId())
						.password(encoder.encode(u.getPassword()))						
						.authorities(u.getRole())
						.build()).orElseThrow();
	}
	
}