package com.lesson08;

public class Application {

	public static void main(String[] args) {
		
		//The modulus operator
		
		int ten = 10;
		int three = 3;
		
		
		//Ten divided by 3 (in Integers) = 3. We can use the modulus operator to retrieve the remaining amount. 
		System.out.println(ten % three); 
		
		//So if we have an array with a 100 spots:
		int[] values = new int[100];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}
		
		//We can search from particular numbers. If value % 10 == 0, this means that only values that can be divided
		//by 10 are filtered out. 
		
		for (int value : values) {
			if (value % 10 == 0) {
				System.out.println(value);
			}
		}
		
		//Some other String methods
		String sentence = "There is a small boat by the dock";
		String sentence2 = "There were several people at the party";
		
		//This returns a boolean.
		System.out.println(sentence.startsWith("There"));
		System.out.println(sentence2.endsWith("party"));
		
		//convert a number to a String.
		int number = 29;
		
		System.out.println(String.valueOf(number));
		System.out.println(String.valueOf(number+313));
		System.out.println(String.valueOf(sentence2.endsWith("party")));
		
		
	}

}
