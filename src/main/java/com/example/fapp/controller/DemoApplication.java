package com.example.fapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web1")
public class DemoApplication {

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("This application is deployed on aws cloud by - ", name);
	}

	/*
	 * @GetMapping("/hello") public String hello() { return
	 * String.format("Hello web1" ); }
	 */
}
