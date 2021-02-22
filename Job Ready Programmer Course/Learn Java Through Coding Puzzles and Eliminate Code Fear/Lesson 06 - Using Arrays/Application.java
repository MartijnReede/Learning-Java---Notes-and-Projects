package com.lesson06;

public class Application {
	
	public static void main(String[] args) {
		
		//An array is a way to store a collection of elements. 

		//This syntax creates a new Integer array with 100 spots. 
		///If nothing is assigned to the index numbers, the values are 0 by default.
		int[] values = new int[100];
		
		//Add something to the array. The number between the [] is the index number.
		values[3] = 5;
		System.out.println(values[3]); //this is going to print 5.
		
		//The size of an array is fixed, it is not dynamic. 
		
		//To print the elements of an array, we can create a for-loop. 
		for (int i = 0; i < values.length; i++) {
			System.out.println("At index nr: " + i + " number: " + values[i] + " is stored...");
		}
		
		//You can also create an array this way:
		int[] multipleValues = {10,3,5,6,1,4,2};
		
		for (int i = 0; i < multipleValues.length; i++) {
			System.out.print(multipleValues[i] + " ");
		}
		
		//To iterate through an array its easier to use a for-each loop. 
		for (int value : multipleValues) {
			System.out.println(value);
		}
		
		//EXERCISE***********************************************
		//Write a method that searches an array for a particular number. If it found the number, make
		//the loop stop. If the number is found, return the index number. If the number cannot be found, return -1;
		
		
		int[] exercise = {1, 3, 56, 17, 8, 39, 13, 12};
		
		System.out.println("Number found? " + findNumber(exercise, 3));
		System.out.println("Number found? " + findNumber(exercise, 300));
	}

	
	static int findNumber(int[] array, int target) {
		int result = -1;
		for (int i =0; i < array.length; i++) {
			if(array[i] == target) {
				return result = i;
			}
		}
		return result;
	
	}
}
