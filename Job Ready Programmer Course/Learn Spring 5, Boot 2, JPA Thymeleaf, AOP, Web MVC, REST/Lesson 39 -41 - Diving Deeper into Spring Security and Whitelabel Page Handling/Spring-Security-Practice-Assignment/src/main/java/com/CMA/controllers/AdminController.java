package com.CMA.controllers;

import javax.annotation.security.RolesAllowed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

	
	@GetMapping
	public String adminPage() {
		return "admin/admin-page.html";
	}
}
