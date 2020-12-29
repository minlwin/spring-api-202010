package com.jdc.security.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtTokenFilter extends OncePerRequestFilter{
	
	@Autowired
	private JwtTokenProvider provider;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		try {
			// check token
			String token = request.getHeader("jdc-jwt-token");
			Authentication authResult = provider.authenticate(token);
			SecurityContextHolder.getContext().setAuthentication(authResult);
		} catch (Exception e) {
			System.err.println("Invalid Token : ".concat(e.getMessage()));
		}
		
		filterChain.doFilter(request, response);
	}

}
