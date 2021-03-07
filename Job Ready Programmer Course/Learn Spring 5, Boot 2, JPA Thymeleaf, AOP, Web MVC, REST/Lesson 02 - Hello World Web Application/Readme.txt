Creating a Hello World Web Application:

1. Create a new Spring Starter Project:
	- Name the project
	- Select Java Version 8	
	- Empty group
	- Add description
	- Create a package
2. Click next...
3. Select dependencies:
	- Spring Web (makes it able to use server etc.)
	- Spring Boot DevTools (if you select this dependency, you don't have to restart the TomCat server after editing your code).
4. In src main folder, create a new package:
	- Create the package and create a controller class.
	- Make sure to name the package exactly the same as the already existing package, but add .web to it.
5. Write this code:

	@RestController
	@RequestMapping(value = "/myfirstapplication")
	public class HelloWorldController {

		@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
		public String HelloWorld() {
			return "<h1>Hello World!</1>";
		}
		
	}

6. Start server in the Boot Dashboard:
	- By clicking on the play button with the stop sign behind it. 

7. Open your browser and type in: localhost8080/myfirstapplication/helloworld

8. You should see hello world on your screen now!