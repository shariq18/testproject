package com.example.docker.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
}
