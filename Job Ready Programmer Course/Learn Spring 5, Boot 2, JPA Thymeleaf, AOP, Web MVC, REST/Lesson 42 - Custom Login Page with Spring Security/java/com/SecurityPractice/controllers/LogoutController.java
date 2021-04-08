package com.SecurityPractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {

	@GetMapping(value="/logout")
	public String logout() {
		return "logout/logout-page.html";
	}
}
