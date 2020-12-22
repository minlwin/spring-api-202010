package com.jdc.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.security.controller.dto.LoginDto;
import com.jdc.security.controller.dto.LoginResultDto;
import com.jdc.security.service.AppUserRepository;

@RestController
@RequestMapping("security")
public class SecurityApi {
	
	@Autowired
	private AuthenticationManager auth;
	@Autowired
	private AppUserRepository repo;

	@GetMapping
	public String index() {
		return "Hello from Security";
	}
	
	@PostMapping
	public LoginResultDto login(@RequestBody LoginDto dto) {
		
		LoginResultDto result = new LoginResultDto();
		
		try {
			Authentication authResult = auth.authenticate(new UsernamePasswordAuthenticationToken(dto.getLoginId(), dto.getPassword()));
			if(authResult.isAuthenticated()) {
				// set result to security context
				SecurityContextHolder.getContext().setAuthentication(authResult);
				// set user to login result
				repo.findByLoginId(dto.getLoginId()).ifPresent(result::setUser);
			}
			
		} catch (InternalAuthenticationServiceException e) {
			result.setMessage("Please check your login id.");
		} catch (BadCredentialsException e) {
			result.setMessage("Please check your password.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
