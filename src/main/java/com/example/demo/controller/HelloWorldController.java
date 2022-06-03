package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// UNIT-1 (CREATING MICROSERVICE)
@RequestMapping("hello")
@RestController
public class HelloWorldController {
	@GetMapping(path = "/{name}")
	public String responseMsg(@PathVariable("name") String name) {
		return "Welcome: " + name;
	}
}
