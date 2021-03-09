package com.jobready.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import domain.User;

@Controller
public class DemoController {
	
	//Shows the home page of the Spring Boot Demo.
	//It passes in an empty user object for us to fill with data.
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getWelcomePage(Model model) {
		model.addAttribute("newUser", new User());
		return "index";
	}
	
	//We didn't make a database connection yet, but this method could add the data to the database.
	//This is a POST method since it handles the data input from the client.
	@RequestMapping(value="/addToDatabase", method = RequestMethod.POST)
	public String showUserInfo(User user, RedirectAttributes attr) {
		//Some code that adds the user to the database...
		attr.addFlashAttribute("user", user);
		return "redirect:/display";
	}
	
	//This is not a POST method anymore. This method only displays the data, it isn't handling anything.
	@RequestMapping(value="/display", method = RequestMethod.GET)
	public String showUserInfo(User user) {
		return "usersubmitted";
	}
}
