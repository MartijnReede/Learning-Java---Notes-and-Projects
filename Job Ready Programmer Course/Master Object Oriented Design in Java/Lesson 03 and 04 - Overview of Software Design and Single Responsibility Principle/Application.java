package com.jobready.OverviewOfSoftwareDesign;

public class Application {
	
		//The problem statement = a short overview of what the application should do. 
		
		//Before we create our first class, we have to think about design. 
		//This doesn't have to be in detail, but you have to have a plan of action.
		
		//Names of classes and variables should be based on intent. 
		
		//Example: we want to create a software application to hire or terminate employees and it
		//must be able to print reports in XML or CSV files. 
		
		//If we would make a diagram for the employee class, this would be the WRONG WAY!
		
		// ---- Employee ---
		// long id;
		// String name;
		// String department;
		// Boolean working;
		// ------------------
		// saveEmployerToDatabase();
		// printEmployeeDetailReportXML();
		// printEmployeeDetailReportCSV();
		// terminateEmployee();
		
		//This is the wrong way, because the methods that will be part of the employee class doesn't match
		//the behavior of an actual employee! Employees have behavior like work(), takeABreak(), attendMeetings() etc.
		
		//*******Single-responsibility principle*********
		//This is a computer programming design principle that states that every class should have responsibility over
		//one single part of the program. 
	
}
