package com.algo.linearSearch;

public class Application {

	public static void main(String[] args) {
		
		//This is the simplest algorithm we'll see. 
		
		//Pseudo code = English sentences, an easy way to communicate to other people how an algorithm works. 
		
		int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int whereIsFive = linearSearch(ar, 5);
		System.out.println("Five is at index number: " + whereIsFive + ".");
		
		//The linear search algorithm just searches from beginning to the end....one way...

	}

	//The method below is converted from pseudo code to java code.
	public static int linearSearch(int[] a, int x) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) return i;
		}
		return -1;	
	}
}
