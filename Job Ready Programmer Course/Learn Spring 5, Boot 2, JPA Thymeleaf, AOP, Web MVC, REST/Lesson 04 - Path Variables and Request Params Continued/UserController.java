package com.jobready.extrapractice.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobready.products.Product;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	
	@RequestMapping(value = "/{userID}", method = RequestMethod.GET)
	public String displayUser(@PathVariable int userID) {
		return "User ID = " + userID + ".";  
	}
	
	//UserID is part of the PATH of the URL. The date is a QUERY parameter, this is a @RequestParam.
	//The URL for this request would be: http://localhost:8080/user/350/invoices?date=20/20/2012
	//With the QueryParam behind the ?. 
	//So what if we don't have a date? We can make this optional! This we do by changing the arguments
	//of the RequestParam
	@RequestMapping(value = "/{userID}/invoices", method = RequestMethod.GET)
	public String displayUserInvoices(@PathVariable int userID, @RequestParam(value="date", required=false) Date dateOrNull) {
		return "Invoice found for user ID = " + userID + "." + "On the date: " + dateOrNull + ".";  
	}
	
	//We can also return a list of items.
	@RequestMapping(value = "{userID}/items", method = RequestMethod.GET)
	public List<String> getItmes(){
		List<String> items = new ArrayList<String>();
		items.add("Book");
		items.add("Playstation");
		items.add("Controller");
		return items;
	}
	
	//Or a list of objects...
	//But beware! The object-class should have getters and setters, otherwise it doesn't work!
	//Override the toString method also doesn't work here!
	@RequestMapping(value = "{userID}/products", method = RequestMethod.GET)
	public List<Product> getProducts(){
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Laptop", 950, "Electronics"));
		products.add(new Product("Book", 35, "Lecture"));
		products.add(new Product("Uncharted 4", 950, "Video Games"));
		products.add(new Product("Tennis Ball", 950, "Sport Attributes"));
		return products;
	}
}
