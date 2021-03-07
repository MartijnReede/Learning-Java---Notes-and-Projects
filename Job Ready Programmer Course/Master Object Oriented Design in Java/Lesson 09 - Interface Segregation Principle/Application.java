package com.jobready.intefaceSegregationPrinciple;

public class Application {

	public static void main (String[] args) {
		
		// *********** INTERFACE SEGREGATION PRINCIPLE ***********
		
		//This means: Clients should not be forced to depend on interfaces they do not use.
		//Better explanation: Interfaces should be specific to the needs of the object which must use the interface. It a
		//client does not need all the functions/methods of an interface it depends upon, consider creating a specialized
		//interface which doesn't have wasteful code/information. Be a good programmer!!
		
		//For example: If we have a Teacher class which implements the Teach interface which includes two methods:
		//Teach() and doPaperwork(). What if management decided to let other employees do some paperwork for teachers
		//that work a lot of hours. Now the best solution for this would be to segregate this interface into two interfaces.
		//Now teachers that don't need to do paperwork are not forced to implement this method. 
		
		//Now we can take it one step further... If we have a fat-class (a class that has to many responsibilities) on which
		//multiple other classes depend and the other classes don't use all the methods inside of this fat class. We can
		//put interfaces in between the objects.
		
		//Lets go over an example where we have a SchoolStorage which stores items for teachers. The storage stores
		//glass bottles and chemicals for a science teacher and gym attributes for a sports teacher. 
		
		//Both teachers need an instance of the storage to access the things they need but the sports teacher doesn't
		//need access to the getChemicals and getGlassBottles methods. And the science teacher doesn't need access
		//to the gym attributes. 
		
		//The SchoolStorage still exists but I've created two separate interfaces that own the methods per specific teacher. 

		SchoolStorage storage = new SchoolStorage();
		
		ScienceTeacher ST = new ScienceTeacher();
		ST.prepareWork(storage);
		ST.getStuff();
		
		SportsTeacher SPT = new SportsTeacher();
		SPT.prepareWork(storage);
		SPT.getStuff();
		
		//So what happened here? We can pass in an instance of the general storage class but the different teachers
		//don't have access to each others stuff in the storage. This is because of the interfaces we implemented in between
		//the objects.
		
		
		
		
	}
}
