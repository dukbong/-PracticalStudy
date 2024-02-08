package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {

	@GetMapping("/")
	public String mainTest() {
		return "Hello Jenkins Test!!!!";
	}
	@GetMapping("/test")
	public String test(){
		return "TEST2 #77";
	}
	@GetMapping("/home")
	public String tset2(){
		return "webhook home test #6";
	}
}
