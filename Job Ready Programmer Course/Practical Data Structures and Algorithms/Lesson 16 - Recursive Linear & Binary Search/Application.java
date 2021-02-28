package com.algo.recursionLinearSearch;

public class Application {

	public static void main(String[] args) {
		
		//In this program I want to solve a linear search problem using recursion. 
		//In this example I am looking for the index position of 5.
		
		int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int indexOfFive = recursiveLinearSearch(myArray, 0, 5);
		System.out.println("Index of five = " + indexOfFive);

		//Now I want to search again for the index number for value 5, but I want to use 
		//recursive binary search.
		
		
		indexOfFive = recursiveBinarySearch(myArray, 0, myArray.length -1, 5);
		System.out.println("Index of five = " + indexOfFive);
	
	}
	
	public static int recursiveLinearSearch(int[] a, int index, int x) {
		if (index > a.length - 1) return -1;
		else if (a[index] == x) return index;
		else return recursiveLinearSearch(a, index + 1, x);
	}
	
	public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
		int q = (p + r) / 2;
		
		if (p > r) {
			return -1;
		} else if (a[q] == x) {
			return q;
		} else if (a[q] > x) {
			return recursiveBinarySearch(a, p, q-1, x);
		} else {
			return recursiveBinarySearch(a, q + 1, r, x);	
		}
	}

}
