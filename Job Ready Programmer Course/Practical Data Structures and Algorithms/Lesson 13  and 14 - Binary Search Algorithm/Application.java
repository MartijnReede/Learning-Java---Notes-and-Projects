package com.algo.binarySearch;

public class Application {

	public static void main(String[] args) {
		
		//Binary search is probably one of the most popular algorithms in computer science. Its one of the fastest
		//approaches to searching through a list of things. 
		
		//******* HOW BINARY SEARCH WORKS ??? *********
		
		//The list of items need to be sorted, otherwise we need to use linear search. 
		
		//EXAMPLE: We are looking at a bookshelf and we are looking for Shakespear.
		//BINARY APPROACH:
		//It dives right in the middle. If the last name of the author there starts with a 'U', we know that we don't have to
		//search further to the right. This eliminates half of the problem. 
		//Then it dives in to the middle of the remaining section. If the last name of the author starts with a 'M', we know we don't
		//have to search further to the right of that point which eliminates three quarters of the problem. etc.etc.etc. 
		
		//The variables in the method below: 
		
		// index nrs:  p = 0;								q = middle										r = max index.
		int[] myArray = {1, 2, 5, 7, 8, 9, 11, 14, 15, 20, 23, 25, 26, 71, 99, 100, 101, 111, 141, 151, 266, 666};
		
		// If q != the value that we are looking for and it is smaller, r becomes q-1; 
		// To calculate the value of the new q we do (p + r) / 2
		System.out.println(binarySearch(myArray, 141));
		System.out.println(binarySearch(myArray, 9328225));
		System.out.println(binarySearch(myArray, 2));
		System.out.println(binarySearch(myArray, 666));
		
	}
	
	public static int binarySearch(int[] a, int x) {
		int p = 0;
		int r = a.length -1;
		int q;
		
		while (p <= r) {
			q = (p + r) / 2;
			if (a[q] == x) return q;
			if (a[q] > x) {
				r = q - 1;
			} else {
				p = q + 1;
			}
		}
		return -1;
	}

}
