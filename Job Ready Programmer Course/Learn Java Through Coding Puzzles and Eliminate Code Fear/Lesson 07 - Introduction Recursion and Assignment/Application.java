package com.lesson07;

public class Application {

	public static void main(String[] args) {
		
		//Recursion... It's like you watch in a mirror with a mirror behind you, you will see yourself over and over again. 
		//In programming this means, that if we define a method, we invoke thesame method in the method. 
	
		printHello(99);
		
		//In the end we will get a stack overflow exception. This means the program uses more memory than there is available. 
		//So basically this is a while(true) loop. It will go on indefinitely. So we need a way to stop it when a certain
		//condition is satisfied. 	
		
		printNumber(3);
		//Since printNumber is a method in a method, all the invoked methods are still in memory. So in memory:
		
		//*********** IN MEMORY ************
		// printnNum(3) --> printNum(2) --> printNum(1) --> printNum(0) --> When it reaches 0, it goes all the way back up.
		// printNum(0) --> printNum(1) --> printNum(2) --> printNum(3).... It doesnt print "Method sopped!" 4 times again, but in memory
		// It checks all the "open" methods with 0 and closes them. 
	}
	
	//This is recursion, the method doesnt return anything.
	public static void printHello(int num) {
		System.out.println("Hello there");
		num++;
		if (num < 100) {
			printHello(num);
		}
	}
	
	//This method is going to return an int. 
	
	public static int printNumber(int num) {
		if (num == 0) {
			System.out.println("Method stopped!");
			return 0;
		} else { 
			System.out.println(num);
			return printNumber(num-1);
		}
	}

}
