package com.lesson02;

public class StringManipulation {

	public static void main(String[] args) {
	
		//String manipulation.
		String o = "Hello";
		System.out.println(o.length()); //Prints the number of characters in this String. Spaces are also counted. 
		
		String str = "ABCDEFG"; //7 characters long.
		
		//Extracting parts of a String is done with the method substring. 
		System.out.println(str.substring(3)); //Starts at indexNr 3.
		System.out.println(str.substring(3, 5)); //Starts at indexNr3, ends at indexNr 5. It doesn't print index number 5 and 6.
		//So in short, the second argument is not inclusive. 
		
		//if statements checks a certain condition. 
		if(str.length() == 5) {
			System.out.println("The strings length is 5");
		} else {
			System.out.println("The string is not 5 characters long...");
		}
		
	}

}
