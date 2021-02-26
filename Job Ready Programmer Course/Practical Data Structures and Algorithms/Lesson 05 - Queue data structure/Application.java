package com.jobready.queuedatastructure;

public class Application {

	public static void main(String[] args) {
		
		//The queue data structures is (just as the stack) an array. But instead of LIFO a queue is
		//FIFO which stands for First In - First Out.  
		
		//Think of it as a line for a roller coaster in a theme park or the waiting line of print assignments
		//for an office printer. Who comes first, will be served first. 
		
		//In this program we're going to code a queue datastructure.
		
		Queue myQueue = new Queue(5);
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(5);
		myQueue.insert(10);
		myQueue.insert(20);

		//As you can see, it maintains the proper order. 1 goes in first and will be printed out first. 
		myQueue.view();
		

	}

}
