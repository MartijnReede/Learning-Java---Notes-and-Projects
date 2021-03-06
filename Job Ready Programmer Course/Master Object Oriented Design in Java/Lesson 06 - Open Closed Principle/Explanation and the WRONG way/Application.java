package com.jobready.openClosed;

public class Application {

	public static void main(String[] args) {
		
		// ******** THE OPEN CLOSED PRINCIPLE ***********
		//Software modules (like classes and methods) should be open for extension
		//but closed for modification. 
		
		//This basically means, that extending the software program should result in minimum changes in already
		//existing code. 

		//I've created an Employee class and a Nurse and Doctor class which both extend the Employee class.
		//Then I created a HospitalManaging class which is responsible to order the employees to do some kind of work. 
		
		HospitalManagement ERDirector = new HospitalManagement();
		
		Employee peggy = new Nurse(1, "Peggy", "Emergency", true);
		
		ERDirector.callUpon(peggy);
		
		Employee harry = new Doctor(2, "Harry", "Emergency", true);
		
		ERDirector.callUpon(harry);
		
		//This system works, but it is NOT IN A GOOD WAY!
		//Work of employee's should be carried out by employees themselves! The HospitalManagement class is a big
		//violator of the open close principle. If the program in the future would be extended with other kinds of employees
		//This class could become messy. Instead of being closed for modification, this class invites for it if we
		//want to expand the application. 
		
		//So how to fix this? We should start with giving the employees the methods that execute their work. 
		//Then the HospitalManagement system can still exist, it only has to call on employees to do their duties. 
		//The employee class will be made abstract and will contain the doDuties() method. 
		
	}

}
