package com.jobready.stackdatastructure;

public class charStack {

	private int maxSize;
	private char[] characters;
	private int top;
	
	public charStack(int maxSize) {
		this.maxSize = maxSize;
		characters = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char c) {
		if (top == maxSize -1) {
			System.out.println("Stack is allready full...");
		} else {
			top ++;
			characters[top] = c;
		}
	}
	
	public char pop() {
		if(top == -1) {
			System.out.println("Stack is allready empty...");
			return 0;
		} else {
			int oldTop = top;
			top--;
			return characters[oldTop];
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
}
