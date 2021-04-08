package com.SecurityPractice.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorControllerHandler1 implements ErrorController{
	
	@RequestMapping(value="/error")
	public String errorHandler(HttpServletRequest request) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		
		if (status != null) {
			
			int statusCode = Integer.valueOf(status.toString());
			
			if(statusCode == HttpStatus.NOT_FOUND.value()) {
				return "Error-pages/Error-404.html";
			}
			
			if(statusCode == HttpStatus.FORBIDDEN.value()) {
				return "Error-pages/Error-403.html";
			}
			
		}
		
		return "error/general-error-page.html";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}
