package com.jdc.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public")
public class CommonApi {
	

	@GetMapping
	public String index() {
		return "Hello from Public";
	}
}
