package com.jobready.LinkedList;

public class Application {

	public static void main(String[] args) {
			
		//The array data structure (not very efficient):
			// - Has a fixed size. If we want to go over the maxSize (as in an ArrayList), we have to copy the
			// complete array and double its size.
			// - If we want to insert something in the middle of the array, we have to iterate trough the complete
			// array and reassign all the positions of each value. 
	
		//This is where the LinkedList comes in: 
			// - You can easily add values in the middle, front or end of the list. See it as a train with wagons.
			// You can disconnect a particular part of the train and put another wagon in between. Or add something to the
			// head or tail of the train. 
			// Each cart in the train can be referred to as nodes which contains certain values. 
		
			// So if we would add a value to the middle of the linkedList, the only thing that changes is the direction address of the node 
			// before the particular value. 
		
	
			Node a = new Node();
			a.value = 5;
			
			Node b = new Node();
			b.value = 10;
			
			Node c = new Node();
			c.value = 6;
			
			Node d = new Node();
			d.value = 16;
			
			//Above I've created some nodes that contain the data. But we havn't linked them yet. This we can do by using the Node next variable
			//in the node class.
			
			a.next = b;
			b.next = c;
			c.next = d;
			
			//Connecting them creates a LinkedList, its only not providing us any benefit. 
			
			//Assignment methods:
			System.out.println(getSize(a));
			System.out.println(getSize(b));
	}
	
	//ASSIGNMENT: Create a method that returns the length of the LinkedList.
	public static int getSize(Node start) {
		int count = 1;	
	
		while(start.next != null) {
			count++;
			start = start.next; 
		}
		return count;
	}

}
