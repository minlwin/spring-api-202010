package com.jdc.security.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class JwtTokenAdvice implements ResponseBodyAdvice<Object>{

	@Autowired
	private JwtTokenProvider provider;
	
	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
			ServerHttpResponse response) {
		
		// Authenticated
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if(null != auth && ! (auth instanceof AnonymousAuthenticationToken)) {
			String token = provider.generate(auth.getName(), auth.getAuthorities());
			ServletServerHttpResponse resp = (ServletServerHttpResponse) response;
			resp.getServletResponse().addHeader("jdc-jwt-token", token);
		}
		
		return body;
	}

}
