package com.jobready.ObjectsMessagesDependencies;

public class Application {

	public static void main(String[] args) {
		
		//We are familiar with objects in the real world for example:
		
		//Objects have identity --> My car is different than my fathers car.
		//Objects have state --> A glass can be full or empty.
		//Objects have behavior --> A dog can bark, a vehicle can drive.
		
		//Objects can carry out behavior based on messages they receive.
		
		//Perspective:
		//During object design experienced developers will think of how objects will behave during runtime. Rather than the classes and methods they need to write.
		
		//Methods defined in a class definition, represent the BEHAVIOR that instances of that class will have during RUNTIME.
		//This behavior is invoked by sending MESSAGES to the Object.
		
		//Example: We wrote a vehicle class. If we create an object we can send it messages.
		//This object will respond to 3 different messages:
		
		Vehicle car = new Vehicle();
		car.startEngine();
		car.accelerate();
		car.stopEngine();
		
		//Let's go to another example. We create a Driver class. In this class we define a drive method and it takes
		//a vehicle as an argument. 
		
		//The driver has a dependency which is the vehicle. It depends on the vehicle in order to drive.
		Driver driver = new Driver();
		driver.drive(car);
		
		//Another name for this dependency is an association. Associations define the relationships between classes.
		
		//********* Three kinds of associations ********
		// - Dependency association --> The drives receives a vehicle reference only in the scope of the drive operation. 
		//	 So the driver is depended on the vehicle object to be handed to it as a parameter to the drive operation. 
		//	 The association is operation based, not for the class in general.
		
		// - Composition association -->  Where one object is composed out of other objects. For example:
		//	 A vehicle object that contains an object of an engine. If the vehicle exists, so does the engine.
		//	 With composition association there is also ownership. The vehicle owns the engine.
		
		// - Aggregation association --> It's like composition but without ownership.
		//   Example:   School Language department ----- Composition ----> Language Courses ------Aggregation ---> Students...
		//	 So, if the school stops to exist, so do the courses. But if the courses don't exists the students will still be there.
		
	}
}
