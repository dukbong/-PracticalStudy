package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {

	@GetMapping("/")
	public String mainTest() {
		return "Hello Jenkins Test";
	}
<<<<<<< HEAD
	@GetMapping("/test")
	public String test() {
		return "webhook test";
=======

	@GetMapping("/test")
	public String test(){
		return "Hello Jenkins Maven Test!!!";
>>>>>>> e2c2dd1dd2d4b56b1b1f559256b01c49aeedcd93
	}
}
