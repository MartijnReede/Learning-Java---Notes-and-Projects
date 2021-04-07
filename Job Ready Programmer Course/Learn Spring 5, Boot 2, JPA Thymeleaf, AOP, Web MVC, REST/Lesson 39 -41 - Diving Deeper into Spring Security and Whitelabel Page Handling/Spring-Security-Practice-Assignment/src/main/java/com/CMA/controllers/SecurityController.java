package com.CMA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CMA.DAO.UserRepository;
import com.CMA.entities.User;

@Controller
@RequestMapping("/register")
public class SecurityController {
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired
	UserRepository usRepo;
	
	@GetMapping
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "Security/Security-Register.html";
	}
	
	@PostMapping(value="saveUser")
	public String saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		usRepo.save(user);
		return "redirect:/register/userSaved";
	}
	
	@GetMapping(value="userSaved")
	public String userSaved() {
		return "Security/Security-User-Saved.html";
	}
}
