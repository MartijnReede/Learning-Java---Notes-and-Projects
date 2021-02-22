package com.lesson05;

public class Application {

	public static void main(String[] args) {
		
		//The while loop: While something is true, do something. 
		int count = 0;
		while (count < 10) {
			System.out.print("Count = " + count + " ");
			count++;
		}
		System.out.println();
		
		//We can also use the NOT operator !.
		while ( !(count < 0)) {   //while count is not less then 0.
			System.out.print("Count = " + count + " ");
			count--;
		}
		System.out.println();
		
		//Breaking out a loop with the break keyword. 
		while (count < 10) {
			System.out.print("Count  = " + count + " ");
			if (count == 5) {
				break;
			}
			count++;
		}
		System.out.println();
		
		//ASSIGNMENT ***********************************************
		//Create a method which extracts categories from the string argument.
		
		String str = "We have a large inventory of things in our warehouse falling ing the " +
					"category:apperal and the slightly more in deman category:makeup along " +
					"with the category:furniture and...";

		printCategories(str);		
	}
	
	static void printCategories(String str) {
		
		int count = 0;
		int startIndex;
		int endIndex;
		
		while (count < str.length()) {
			if (count == str.indexOf("category:", count)) {
				startIndex = count + 9;
				endIndex = str.indexOf(" ", count);
				System.out.println(str.substring(startIndex, endIndex));
			}
		count ++;
		}
			
		
	}
}
