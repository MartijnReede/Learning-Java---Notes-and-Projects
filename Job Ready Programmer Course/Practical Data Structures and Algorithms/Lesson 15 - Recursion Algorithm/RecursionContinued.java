package com.jobready.recursion;

public class RecursionContinued {

	public static void main(String[] args) {
		
		reduceByOne(10);
		
		//For the method reduceByOne(int n) the n == 0 condition is called the BASE CASE. 
		//As you can see from the printed results, the first result that is going to print is -1 while
		//you maybe would expect that 10 would print first. This is because when we first invoke the method, it never
		//reaches the println method. Only when n < 0 it reaches the the println method and this is when n == -1.
	
	}
	
	public static void reduceByOne(int n) {
		
		if (n >= 0) {
			reduceByOne(n-1);
		}
		
		System.out.println("Completed Call: " + n);
			
	}

}
