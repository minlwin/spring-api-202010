package com.jdc.security.model.dto;

import com.jdc.security.model.entity.Member;

import lombok.Data;

@Data
public class SignInResultDto {

	private Member loginUser;
	private String message;
}
