package com.jobready.bigOnotation;

public class Application {

	public static void main(String[] args) {
		
		//Algorithm: basically a list of step-by-step instructions on how the computer should go about solving a problem. 
		
		//For example, the body of a method that is filtering out all even numbers from an array, can be considered
		//as an algorithm. It solves the problem of how to get even numbers from an array. 
		
		// ******* LINEAR EFFICIENCY *******
		//If we would graph the efficiency of this algorithm, it will scale linearly. The amount of loops to filter the numbers
		//out, will be equal to the size of the array that is given as input. 
		
		// ******** CONSTANT TIME ************
		//See method below...
		
		//********* QUADRATIC *************
		//This means the algorithm has nested loops for example. The time to execute this method is the size of the input squared. 
		//So if we give two arrays of size 10 as input, the amount of loops will be 10x10 = 100
		//If we give two arrays of size 1000 as input, the amount of loops will be 1000x1000 = 1.000.000
		//Quadratic methods are not very scalable.
		//The time of execution will grow exponentially. 
		
		//********* GROWTH RATES ***********
		//SINGLE LOOP: is considered as a linear growth rate algorithm.
		//NESTED LOOPS: is considered as a quadratic growth rate algorithm. 
		
		//********* ASYMPTOTIC NOTATION ***********
		//To specify the efficiency of algorithms we use the asymptotic notation. 
		//'n' refers to the input size.
		
		//Linear growth rate = O(n)
		//Quadratic growth rate = O(n2)
		//Constant growth rate = O(1)
	
		// The O notation for the method below will be O(n3)  This is called a "Cubic" growth rate. 
		//for(){
		//		for () {
		//			for() {
		//				.....
		//			}
		//		}
		// 	}
		
		
		//The notation for algorithms that can go on forever is: O(nn). The amount of loops is growing exponentially.
	
	}
	
	//The efficiency of this method is linear. The amount of loops will be equal to the size of the input array.
	public static void getEvenNumbers(int[] randomArray) {
		for (int i : randomArray) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	//The efficiency of this method is referred to as "constant time". No matter how big the array is, there is only one line 
	//of code that is executed immediately. 
	public static int getElementFrom(int[] randomArray, int index) {
		return randomArray[index];
	}
	
	//Quadratic method (searches both arrays that contain the same number)
	public static int countEqualNumbers(int[] a, int[]b) {
		
		int equalNumbers = 0;
		
		for (int i : a) {
			for (int j : b) {
				if (i == j) {
					equalNumbers++;
				}
			}
		}
		return equalNumbers;
	}

}
