package com.jdc.security.controller.dto;

import com.jdc.security.service.AppUser;

import lombok.Data;

@Data
public class LoginResultDto {

	private String message;
	private AppUser user;
}
