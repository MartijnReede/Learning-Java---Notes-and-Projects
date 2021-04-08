package com.SecurityPractice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SecurityPractice.DAO.UserRepository;
import com.SecurityPractice.Entities.User;

@Controller
@RequestMapping(value="/register")
public class SecurityController {
	
	@Autowired
	UserRepository usRepo;
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@GetMapping
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "security/register-page.html";
	}
	
	@PostMapping(value="/save")
	public String saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		usRepo.save(user);
		return "security/register-completed.html";
	}
	
	@GetMapping(value="/confirm")
	public String confirmUserCreated() {
		return "security/register-completed.html";
	}
}
