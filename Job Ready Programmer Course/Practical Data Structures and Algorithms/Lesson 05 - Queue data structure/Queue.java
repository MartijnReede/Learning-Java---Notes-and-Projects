package com.jobready.queuedatastructure;

public class Queue {

	private int maxSize; 		//initializes the max amount of slots
	private long[] queueArray; 	//slots to maintain the data
	private int front;			//Points to the index position for the value in the front of the queue. 
	private int rear;			//Points to the index position for the value at the back of the queue. 
	private int nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0; //index position of the first slot of the array.
		this.rear = -1; //This is -1 since there is no value yet in the queue.
		this.nItems = 0;
	}
	
	//Inserting in a queue goes at the back of the array. 
	public void insert(long l) {
		
		/*
		if (rear == maxSize -1) {
			rear = -1;
		}                     	THIS PIECE OF CODE makes it a circular queue. It overrides the value
								on index number 0, if a 6th element is added to the size 5 queue. 
		*/
			rear++;
			queueArray[rear] = l;
			nItems ++;
		
	}
	
	//The value will be removed from the front
	public long remove() {
		long temp = queueArray[front];
		front++;
		if(front == maxSize) {    //Which means we removed everything from the queue.
			front = 0; //Set front to 0 so we can utilize the entire array again. 
		}
		nItems--;
		return temp;
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public long peakFront() {
		return queueArray[front];
	}
	
	public void view() {
		System.out.print("[ ");
		for (int i = 0; i< queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}
	
}
