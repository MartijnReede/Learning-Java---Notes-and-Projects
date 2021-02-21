package com.jobready.buildInInterfaces;

import java.util.function.Function;

public class Main {

	public static void main (String[] args) {
		
		// There are many interfaces available. You can import them from the function package.
		// This means we don't have to create our own interfaces.
		
		// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
		
		//Another built-in interface that is used often is the Function interface. 
		
		Function<String, Integer> CharCounter = (str) -> str.length();
		
		int count = 10;
		count += CharCounter.apply("AnotherTen");
		System.out.println("This should be 20......:    " + count);
		
		}
}
