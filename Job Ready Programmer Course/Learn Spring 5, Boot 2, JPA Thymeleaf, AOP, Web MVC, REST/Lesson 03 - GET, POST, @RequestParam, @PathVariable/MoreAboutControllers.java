package com.jobready.moreaboutcontrollers.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class MoreAboutControllers {

	//Why is this a get method? Because it only asks to get the html code from below. 
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "<h1>Hello there!</h1>" + 
			 "<form action=\"/demo/login\" method=\"POST\">" +
			"<input type=\"submit\">" + 
			 "</form>";
	}
	
	//Why is this a post method? It is a post method because it takes the input of the submit button.
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginhere() {
		return"<h1>Please login here</h1>" +
				"<form action=\"/demo/helloUser\" method=\"POST\">\r\n"
				+ "  <label for=\"fname\">First name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"\"><br>\r\n"
				+ "  <label for=\"lname\">Last name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"\"><br><br>\r\n"
				+ "  <input type=\"submit\" value=\"Submit\">\r\n"
				+ "</form>";
	}
	
	//Why is this a post method? Because it takes the input from the form before opening this page.
	@RequestMapping(value = "/helloUser", method = RequestMethod.POST)
	public String helloUser(@RequestParam String fname, @RequestParam String lname) {
		return "<h1>Hello there mister " + fname + " " + lname + "!!!</h1>"; 
	}

	//What is a @PathVariable? If the client gives input in the url, the method below can handle it. 
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
	public String getOrder(@PathVariable String id) {
		return "Order ID: " + id;
	}
}



