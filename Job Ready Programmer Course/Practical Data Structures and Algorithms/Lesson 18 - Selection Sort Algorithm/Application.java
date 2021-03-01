package com.jobready.selectionSortAlgorithm;

public class Application {

	public static void main(String[] args) {
		
		// The selection sort algorithm is one of the easier algorithms
		
		// ******** How does it work? **********
		// Give an array, the algorithm searches from left to right to the smallest number. 
		// When it found the lowest number, it places it on the first spot. Then it searches
		// again but starting at the 2nd spot. When it found the smallest number it will be  placed
		// on the second spot. 
		
		int[] sortMePlease = {3, 1, 23, 2, 2, 60, 1, 30, 40, 10, 2, 100, 239, 130, 33, 333, 66};
		
		selectionSort(sortMePlease);
		
		for (int i = 0; i<sortMePlease.length; i++) {
			System.out.println(sortMePlease[i]);
		}
		
	}
	
	public static int[] selectionSort(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			int minimum = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minimum]) {
					minimum = j;
				}
			}
		int temp = a[i];
		a[i] = a[minimum];
		a[minimum] = temp;
				
		}
	return a;
	}
}
