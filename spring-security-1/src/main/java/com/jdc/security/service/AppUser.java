package com.jdc.security.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppUser {
	private String name;
	private String loginId;
	private String password;
	private String role;
}
