package com.lesson03;

public class Application {

	public static void main(String[] args) {
		
		//Some more concepts....
		
		int mikesAge = 10;
		int bobsAge = 15;
		
		if (mikesAge == bobsAge) {
			System.out.println("Bob and Mike have the same age...");
		} else {
			System.out.println("Bob and Mike don't have the same age...");
		}
		
		// == is a comparing operator. 
		// = is an assigning operator.
		
		//When using primitive types we can use the comparing operators.
		//But when we use strings, we have to use the .equals method. 
		
		String test1 = "hi";
		String test2 = "Blablabla";
		
		if (test1.equals(test2)) {
			System.out.println("test1 and test2 are equal...");
		} else {
			System.out.println("test1 and test2 are not equal....");
		}
		
		//Changing strings to lower case. 
		String hi = "HELLO";
		hi = hi.toLowerCase();
		System.out.println(hi);
		
		//Getting a character at a certain index number.
		String indexNr = "GetMyIndex";
		System.out.println("Character at index nr 4: " + indexNr.charAt(4));
		
		//Search a string for a particular part..
		String search = "Hello there Martin!";
		System.out.println("The index position of 'Martin' is: "  +  search.indexOf("Martin"));
		//Or search from a particular point (12th index in this case);
		System.out.println("The index position of the second 't' is: " + search.indexOf("t", 12));
		
		//Search from the last point of a String (right to left).
		System.out.println(search.lastIndexOf("t"));
		//This is going to return 15 also, since that is the first t it will encounter. 
		
		
		
		
		

	}

}
