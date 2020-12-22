package com.jdc.security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class AppUserRepository {

	private List<AppUser> users = List.of(
			new AppUser("Admin User", "admin", "admin", "Admin"),
			new AppUser("Member User", "member", "member", "Member")
			);
	
	public Optional<AppUser> findByLoginId(String loingId) {
		return users.stream().filter(u -> u.getLoginId().equals(loingId)).findAny();
	}
	
}
