package com.jdc.security.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.security.model.dto.SignInDto;
import com.jdc.security.model.dto.SignInResultDto;
import com.jdc.security.model.dto.SignUpDto;
import com.jdc.security.model.service.MemberService;

@RestController
@RequestMapping("security")
public class SecurityApi {
	
	@Autowired
	private AuthenticationManager authManager;
	@Autowired
	private MemberService members;

	@PostMapping("sign-in")
	public SignInResultDto signIn(@RequestBody SignInDto dto) {
		SignInResultDto result = new SignInResultDto();
		try {
			// authenticate
			Authentication authResult = authManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getLoginId(), dto.getPassword()));
			if(authResult.isAuthenticated()) {
				SecurityContextHolder.getContext().setAuthentication(authResult);
				result.setLoginUser(members.findByLoginId(dto.getLoginId()));
			}
		} catch (BadCredentialsException e) {
			result.setMessage("Please check your password.");
		} catch (InternalAuthenticationServiceException e) {
			result.setMessage("Please check your login id.");
		} catch (Exception e) {
			e.printStackTrace();
			result.setMessage(e.getMessage());
		}
		return result;
	}
	
	@PostMapping("sign-up")
	public SignInResultDto signUp(@RequestBody SignUpDto dto) {
		
		// sign up
		
		// login
		
		return null;
	}
}
