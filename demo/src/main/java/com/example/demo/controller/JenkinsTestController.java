package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {

	@GetMapping("/")
	public String mainTest() {
		return "Hello Jenkins Test";
	}
	@GetMapping("/test")
	public String test(){
		return "webhook!!!";
	}
	@GetMapping("/home")
	public String tset2(){
		return "webhook home test6";
	}
}
