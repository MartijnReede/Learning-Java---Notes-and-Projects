package com.jobready.simpleLambdas;

public class Main {
	
	public static void main(String[] args) {
		
		//1. Create a lambda which returns the sum of two Integers.
		
		SumOfTwoIntegers sum = (a, b) -> a + b;
		System.out.println(sum.getSum(10, 25));

		
		//2. Create a lambda which reverses a String.
		FunctionalStringInterface reverser = (str) -> {
			String result = "";
			
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			
			}
			return result;	
		};
		
		System.out.println(reverser.reverse("LambdasAreHard"));
		
		//3. Create a lambda which divides two Integers, if Integer1 == 0, return -1;
		
		SumOfTwoIntegers divider = (a, b) -> a / b;
		System.out.println(divider.getSum(10, 2));
		
		//4. Make a generic lambda which can return anything. 
		
		GenericInterface<String> genericReverser = (str) ->	{
		
		String result = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;	
	};
	
	System.out.println(genericReverser.getResult("ReverseThisPlease"));
	
		//5. Use the genericInterface again
	
		GenericInterface<Integer> amountTimes3 = (i) -> i*3;
		
		System.out.println(amountTimes3.getResult(10));
		
		
	}

}
