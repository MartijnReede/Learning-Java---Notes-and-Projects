package com.lesson07;

public class PuzzleApp {

	public static void main(String[] args) {
	
		//EXERCISE *******************************************
		
		//Write the body of a method which uses recursion, so that it converts a String.
		
		System.out.println(allDollars("Hello")); // Goal: H$e$l$l$o
		System.out.println(allDollars("James")); // Goal: J$a$m$e$s
		
		//My method works, but it could be done better.... Below the method of the teacher: 
		System.out.println(allDollarsTeacher("Money"));
		
		//The big difference is, that I am creating the complete string over and over again, while the teacher prints out
		//little pieces after each other. The input str = Money / oney / ney / ey / y. 
		
	}
	//My method
	public static String allDollars(String str) {
		if (str.charAt(1) == '$') {
				if (str.charAt(str.length() - 2) == '$') {
					return str;
				}
			
		int lastIndexOf$ = str.lastIndexOf('$') + 2;
		String split2 = str.substring(0, lastIndexOf$);	
		split2 += '$';
		str = split2 + str.substring(lastIndexOf$);
		return allDollars(str);
				
		} else {
			String split = str.substring(0,1);
			split += '$';
			str = split + str.substring(1); 
			return allDollars(str);
		}
	}
	
	//Method of teacher
	public static String allDollarsTeacher(String str) {
		if(str.length() <= 1) {
			return str;
		}
		return str.charAt(0) + "$" + allDollarsTeacher(str.substring(1));
	}
}
