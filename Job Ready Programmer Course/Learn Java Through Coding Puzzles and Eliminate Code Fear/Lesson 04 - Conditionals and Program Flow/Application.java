package com.lesson04;

public class Application {

	public static void main(String[] args) {
		
		// The boolean type can only contain true or false.
		// Booleans can be put into conditional statements, like the if statement. 
		
		boolean hungry = true;
		
		if (hungry) {
			System.out.println("I'm starving...");
		} else if (hungry == false){
			System.out.println("I'm not so hungry at the moment...");
		}
		
		//Assigning a boolean value can also be done differently:
		boolean test = (3 > 5);
		System.out.println("Is 3 more than 5? " + test);
		
		if(getValue()) {
			System.out.println("The method returned true..");
		}
		
		if (!returnExpression()) {
			System.out.println("7 is not less than 3");
		}
		
		if (returnExpression2()) {
			System.out.println("Both expressions are true!");
		}
		
		//EXERCISE *****************************************************
		
		//We have a loud barking dog. Create a method dogTrouble(boolean barking, int hour){};
		//If the dog barks between 20h and 7h we are in trouble, return true then. 
		
		boolean tourble;
		
		System.out.println("The dog is barking at 20h, are we in trouble? " + dogTrouble(true, 20));	
		System.out.println("The dog is not barking, but it is 23h, are we in trouble? " + dogTrouble(false, 23));
	
		//CONCLUSTION:
		//Method I wrote was correct, but it was also possible to write everything just in one line of code:
		//     return (barking && (hour < 7 || hour > 20));
	}
	
	static boolean dogTrouble(boolean barking, int hour) {
		if(!barking) {
			return false;
		} else if (barking && hour <= 19 && hour >= 7){
			return false;
		} else {
			return true;
		}
	}
	
	static boolean getValue() {
		return true;
	}
	
	static boolean returnExpression() {
		return (7 < 3);
	}
	
	static boolean returnExpression2() {
		return ((2 + 2) == 4 && (4 / 4) == 1 );
	}

}
