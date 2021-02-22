package com.lesson01;

public class MyFirstClass {

	public static void main(String[] args) {
		
		//Methods do things... They are blocks of code that are referred to by a name and they can be invoked. 
		hello();
		hello();
		hello();
		
		//This is a String variable
		String whatDay = "It's a beautiful day!";
		whatDay(whatDay);
		
		System.out.println(sumTheseNumbers(10,10));
	}
	
	//This method contains instructions to say hello and print some random stuff.
	static void hello() {
		System.out.println("Hello");
		System.out.println("Blablabla some junk");
	}
	
	static void whatDay(String d) {
		System.out.println(d);
	}
	
	static int sumTheseNumbers(int a, int b) {
		return a + b;
	}
	
	


}
