package com.jobready.formingAssociations;

public class Application {
		
		//Newcomers to object oriented design create associations basic on a physical flow
		//Rather than on object behavior. 
		
		//With UMLet we can create class diagrams. In an UML diagram, the arrow always points to
		//the dependencies. 
		
		//Example: NewspaperCompany -------- newspapers -------> Customer
		
		//HAS A relationship. The newsPaperCompany has a customer object to send messages to. 
		
		//So the example above is a typical physical flow of design. If this was a physical situation
		//the newspapers would 'flow' to the customers. This would work fine, until the customer
		//doesn't want to have newspapers anymore. 
		
		//It would be better if the customer owns a newspaperCompany instance and it can call messages on it like:
		//getNewspapers(); or stopDeliveringNewspapers(); ..... methods that are defined in the NewspaperCompany class.
		
		//***** CONCLUSION *****
		//Create your program based on behavior, not on physical flow!
	
}
