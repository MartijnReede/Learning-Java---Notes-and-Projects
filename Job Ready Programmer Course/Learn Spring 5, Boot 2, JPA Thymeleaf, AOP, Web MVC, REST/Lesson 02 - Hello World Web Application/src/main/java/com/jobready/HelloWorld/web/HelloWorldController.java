

	package com.jobready.HelloWorld.web;

	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping(value = "/myfirstapplication")
	public class HelloWorldController {

		@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
		public String HelloWorld() {
			return "<h1>Hello World!</1>";
		}
		
	}

