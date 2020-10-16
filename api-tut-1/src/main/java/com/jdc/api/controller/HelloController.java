package com.jdc.api.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloController {

	@GetMapping
	public String sayHello() {
		return "Hello Spring MVC";
	}
	
	@GetMapping(path = "path/{id}")
	public String usePath(@PathVariable int id) {
		return "Hello Path " + id;
	}
	
	@GetMapping("query")
	public String queryParam(@RequestParam String name) {
		return "Query Param" + name;
	}
	
	@PutMapping(path = "user")
	public Map<String, User> useBody(@RequestBody User user) {
		return Map.of(user.getName(), user);
	}
	
}
