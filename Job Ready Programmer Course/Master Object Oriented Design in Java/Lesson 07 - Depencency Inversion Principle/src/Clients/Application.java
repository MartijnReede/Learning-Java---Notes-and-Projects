package Clients;

import GeneralManufacturingProcess.IphoneManufacturing;
import GeneralManufacturingProcess.LaptopManufacturing;
import GeneralManufacturingProcess.ManufacturingProcessManager;

public class Application {
	
	public static void main(String[] args) {
		
		// *********DEPENDENCY INVERSION PRINCIPLE *************
		//This means, high-level classes should not be dependent on low-level classes. Does this mean that high-level
		//classes can never depend on lower level classes? NO! As long as the low-level class will never change this is ok.
		//Take the String class for example.... All classes depend on it while we write code. But we know for sure, that we won't
		//change the String class when writing software.
		
		//**************** NEW ASSIGNMENT *******************
		//The goal is to write a program that represents a manufacturing factory for Iphones and laptops. 
		//The manufacturing process will always be: 
		// 1. Assembly
		// 2. Testing
		// 3. Packaging
		// 4. Storage
		//Write the program in a way that they don't break the following principles:
		// - Dependency inversion principle
		// - Open close principle
		// - One responsibility principle
		
		ManufacturingProcessManager createIphone = new IphoneManufacturing();
		
		createIphone.startManufacturingProcess();
		createIphone.startManufacturingProcess();
		createIphone.startManufacturingProcess();
		
		ManufacturingProcessManager createLaptop = new LaptopManufacturing();
		
		createLaptop.startManufacturingProcess();
		createLaptop.startManufacturingProcess();
	
		//Another thing I learned: Making methods protected makes methods only visible to child classes or classes in the same package!
		//Packages: Packages should have a single feature. This 
	
	}
}
