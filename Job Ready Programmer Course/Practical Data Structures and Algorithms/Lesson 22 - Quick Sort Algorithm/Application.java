package com.algo.QuickSort;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		//Quick sort generally runs at the same speed as merge sort. It only doesn't need so much memory.
		
		//********* HOW DOES IT WORK? *************
		
		//The algorithm picks a spot in the array. Iterating over it, the algorithm throws everything lower than 
		//the picked spot to the left and everything that is higher to the right in the array.
		//In the end, the picked spot will be placed in the right spot inside the array.
		
		
		//So again, how does it work?
		//Take an array:   {1, 4, 6, 2, 3, 6, 5}
		//Generally the picked value will be the last one in the array. In this case this will be 5. 
		
		//The algorithm will use two other variables. i and j. i will always be initialized to -1 and j to 0.
		//Then the algorithm will question the following. Is the value at index j smaller or equal than 5?
		
		//It will look like this: 
		//   i	j
		//		1, 4, 6, 2, 3, 6, 5
		//Is array[j] - 1 is less or equal to 5?
		
		//Yes it is! Now we move i and j to the next spot. Also, the value of index 0 will be moved to index 0. 
		//   	i  j
		//		1, 4, 6, 2, 3, 6, 5		
		// is array[j] - 4 less or equal to 5?
		
		//Yes it is! The value of index 2 will be moved to index 2. 
		//   	   i  j
		//		1, 4, 6, 2, 3, 6, 5		
		//is array[j] - 6 less or equal to 5?
		
		//NO, it is NOT!
		//Now only j will increment. 
		//	       i     j
		//		1, 4, 6, 2, 3, 6, 5		
		//is array[j] - 2 less or equal to 5? 
		
		//Yes it is! The values of index 2 and 3 will swap. i and j increment. 
		//	          i     j
		//		1, 4, 2, 6, 3, 6, 5		
		//is array[j] - 3 less or equal to 5? 
		
		//Yes it is! the values of index 3 and 4 will swap. i and j increment.
		//	             i     j
		//		1, 4, 2, 3, 6, 6, 5		
		//is array[j] - 6 less or equal to 5?
		
		//NO it is NOT, now only j will increment.
		//               i        j
		//		1, 4, 2, 3, 6, 6, 5	
		//is array[j] - 5 less or equal to 5?		
		
		//Yes it is! Now the values of index 4 and 6 will be swapped. 
		//                  i        j
		//		1, 4, 2, 3, 5, 6, 6	
	
		//Now we finished iterating through the array. We now only know one thing for sure.
		//The position of 5 is correct and will not change whatever happens to the right or left of it. 
		//We call this whole process partition. And the goal is to define the correct spot for (in this case)
		//value 5. 
		
		//Now the array can be divided into two sections, the left of the 5, and the right of the 5. 
		//For both sections, the whole process that's written above will start over again. 
		
		System.out.println("Joehoe");
		
		int[] myArray = {1, 5, 18, 6, 4, 30, 23, 13, 9, 10, 12, 15, 11};
		quickSort(myArray, 0, myArray.length-1);	
		
		System.out.println(Arrays.toString(myArray));
	}
	
	public static void quickSort(int[] inputArray, int p, int r) {
		if (p < r) {
			
			int q = partition(inputArray, p, r);
			quickSort(inputArray, p, q-1); 
			quickSort(inputArray, q+1, r);
		}
		
	}
	
	public static int partition(int[] inputArray, int p, int r) {
		
		int i = p-1;			// i starts always at -1.			
		int x = inputArray[r];	// The last number of the part of the array we're going to test. 
		
		for (int j = p; j <= r -1; j++) {	//The for loop iterates until the 1 index nr before the last one. 
			if (inputArray[j] <= x) {		//When the value at j is smaller or equal to x, we increment i and swap values. 
				i++;
				int tempj = inputArray[j];
				int tempi = inputArray[i];
				inputArray[i] = tempj;
				inputArray[j] = tempi;
				
			}
		}
		
		//Now we're going to place the x value to i + 1 index number. The value at i is going to be
		//placed at the r position. 
		i++;
		int ival = inputArray[i];
		inputArray[r] = ival;
		inputArray[i] = x;
		
		return i;
	}
}
