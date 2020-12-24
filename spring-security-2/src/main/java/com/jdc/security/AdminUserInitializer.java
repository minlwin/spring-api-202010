package com.jdc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.jdc.security.model.entity.Member;
import com.jdc.security.model.entity.Member.Role;
import com.jdc.security.model.service.MemberService;

@Configuration
public class AdminUserInitializer {
	
	@Autowired
	private MemberService service;

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public CommandLineRunner runner() {
		return args -> {
			// check members
			if(service.thereIsNoUser()) {
				// if there is no member -> Create Admin Member
				Member admin = new Member();
				admin.setName("Admin User");
				admin.setPassword("admin");
				admin.setLoginId("admin");
				admin.setRole(Role.Admin);
				
				service.create(admin);
			}
			
		};
	}
}
