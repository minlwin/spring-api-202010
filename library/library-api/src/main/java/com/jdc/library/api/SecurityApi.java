package com.jdc.library.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.api.dto.SignIn;
import com.jdc.library.api.dto.SignInResult;

@RestController
@RequestMapping("security")
public class SecurityApi {

	@PostMapping("sign-in")
	public SignInResult signIn(SignIn signIn) {
		return null;
	}
}
