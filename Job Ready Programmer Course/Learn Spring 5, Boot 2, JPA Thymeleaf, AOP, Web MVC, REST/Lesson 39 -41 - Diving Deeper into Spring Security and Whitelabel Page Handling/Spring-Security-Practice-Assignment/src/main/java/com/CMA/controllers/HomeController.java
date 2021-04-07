package com.CMA.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class HomeController {

	@GetMapping(value= "/")
	public String homePage() {
		return "home/home-page.html";
	}
	
}
