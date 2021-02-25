package com.jobready.stackdatastructure;

public class Application {

	public static void main(String[] args) {
		
		// The stack data structure --> Is a bunch of things stacked on each other.
		// Think of a stack of plates. If you do the dishes, the last plate put on the stack, will be 
		// the first one to be taken off. 
		
		//This is called: LIFO --> Last In - First Out. 
		
		//Putting something on top of the stack is called 			PUSH.
		//Removing something from the top of the stack is called 	POP.
		
		//In this program we are going to create a STACK DATA STRUCTURE!
		Stack stack = new Stack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		
		//We can retrieve all the values from this stack by:
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		//IMPORTANT --> As you can see, 10 will be printed out first, since this is a LIFO data structure. 
		
		//This stack is not safe, if I add more things than the maxSize we will get an exception. I've changed the methods
		//in the stack class to prevent this of happening. 
		
		System.out.println(reverseString("Awesome!!"));
		
	}
	
	//ASSIGNMENT: create an algorithm / stack which reverses a string using the method below!
	public static String reverseString(String str) {
		
		String result = "";
		
		charStack reverser = new charStack(str.length());
		
		for (int i = 0; i< str.length(); i++) {
			reverser.push(str.charAt(i));
		}
		
		while (!reverser.isEmpty()) {
			result += reverser.pop();
		}
		return result;
	}

}
