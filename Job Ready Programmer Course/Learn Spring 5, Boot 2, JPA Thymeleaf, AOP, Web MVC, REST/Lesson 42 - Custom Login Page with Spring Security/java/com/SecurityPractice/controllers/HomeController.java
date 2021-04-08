package com.SecurityPractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value="/")
	public String home() {
		return "home/home-page.html";
	}
	
	@GetMapping(value="/admin")
	public String admin() {
		return"home/home-admin.html";
	}
	
	@GetMapping(value="/user")
	public String user() {
		return  "home/home-user.html";
	}
	
	
	
		
}
