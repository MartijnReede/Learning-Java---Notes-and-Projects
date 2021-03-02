package com.algo.insertionSort;

public class Application {

	public static void main(String[] args) {
		
		//With the insertion sort algorithm, the array is going to be divided in a sorted section and a non-sorted
		//section. It iterates from left to right looking for a smaller number.
		
		// array: 1, 2, 3, 5, 4
		
		//If we look at the numbers above, the algorithm will first look at 1, then it goes to 2. 
		//Since 1 is smaller than 2, it does nothing. 1 and 2 are now the sorted part of the array. 
		//Then it goes on to 3 and then to 5. It still does nothing. 1 to 5 are now part of the sorted array. 
		//Then it reaches 4. 4 is smaller than 5, so it switches both numbers. 
		
		int[] myArray = {1, 4, 5, 22, 5,2 , 7, 6, 66, 333, 2};
		
		int[] sortedArray = insertionSort(myArray); 
		
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}

	}
	
	public static int[] insertionSort(int[] a) {
		
		// element	Will contain the data we intend on bringing over to the sorted section.
		// j 		Will point to the last index position in the sorted section. 
		
		
		for (int i = 1; i < a.length; i++) {
			int element = a[i];
			int j = i -1;
	
			while (j >= 0 && a[j] > element) {
				a[j + 1] = a[j];
				j--;		
			}
			a[j + 1] = element;
		}
		return a;
	}
	
	//The code above can be a little bit confusing. So, below I've tried to clarify it a little more: 
	//Lets assume that the array is almost sorted. Only the last number is not sorted yet. 
				
	//				|   sorted  | not sorted
	//Array			1, 5, 10, 20, 2;
	
	//How is the code above going to solve it? 
	//- It stores the value 2 in the element variable. 
	//- While number 2 is smaller and j is bigger than 0 the array is going to copy values over and this will look like: 
	
	//1, 5, 10, 20, 2
	//1, 5, 10, 20, 20
	//1, 5, 10, 10, 20
	//1, 5, 5,  10, 20
	//1, 2, 5,  10, 20
	
	//Notice that it looks like the value 2 is gone for a while. This value is stored in the element variable. Only when the element is not
	//bigger than the number on the index before, the algorithm is going to place it in the array. 
}
