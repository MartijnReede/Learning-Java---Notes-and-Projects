package com.jobready.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import domain.User;

//If I make this controller a "@Controller" instead of "@RestController", it is going to search for the
//template called index. If this does not exist. 

@Controller
public class HomeController {
	
		@RequestMapping(value="/", method = RequestMethod.GET)
		public String home(Model model) {
			model.addAttribute("formData", new User());
			return "index";
		}
		
		@RequestMapping(value ="/submitted", method = RequestMethod.POST)
		public String getFromPages(User user) {	
			return "pages/frompagesfolder";
		}
}
