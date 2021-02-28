package com.jobready.recursion;

public class RecursionContinued {

	public static void main(String[] args) {
		
		reduceByOne(10);
		
		//For the method reduceByOne(int n) the n == 0 condition is called the BASE CASE. 		
	}
	
	public static void reduceByOne(int n) {
		
		if (n >= 0) {
			reduceByOne(n-1);
		}
		
		System.out.println("Completed Call: " + n);
			
	}

}
