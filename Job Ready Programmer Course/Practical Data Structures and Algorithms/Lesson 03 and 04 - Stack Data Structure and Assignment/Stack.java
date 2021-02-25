package com.jobready.stackdatastructure;

public class Stack {

	private int maxSize; 		//Store the size of the stack. 
	private long[] stackArray;	//This will be the container of type long. 
	private int top; 			//This will represent the index position of the last item that was placed on top. 
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new long[maxSize];
		top = -1;	//Since nothing is on the stack right now there is no top, so we assign the top index to -1. 
	}
	
	//Method will add a new long value to the top. 
	public void push(long j) {
		
		if (!isFull()) {
			top++;
			stackArray[top] = j;
		} else {
			System.out.println("The stack is full...");
		}
	}
	
	//This method is not going to remove anything from the array, it is only changing the pointer to the top value. 
	//Since remove or pop methods also return the value, this will also be the case here. 
	public long pop() {
		if (!isEmpty()) {
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		} else {
			System.out.println("Stack is allready empty...");
			return -1;
		}
	}
	
	//This method will return the item that is currently sitting on top.
	public long peak() {
		return stackArray[top];
	}
	
	//This method will check if the stack is empty.
	public boolean isEmpty() {
		return (top == -1);
	}
	//This method will check if the stack if full. 
	public boolean isFull() {
		return (top == maxSize -1);
	}
	

}
