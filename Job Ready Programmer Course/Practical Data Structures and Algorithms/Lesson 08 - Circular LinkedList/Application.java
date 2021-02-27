package com.jobready.circularLinkedList;

public class Application {

	public static void main(String[] args) {
		
		//With a circular LinkedList there are variables available which point out the head and tail of the list. 
		//We can access them by using methods. We can insert data at the front or end of the list. 
		
		CircularLinkedList list = new CircularLinkedList();
		
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertLast(9);
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(40);
		

		System.out.println(list.deleteFirst());
		System.out.println(list.getLast());
		list.printContent();
	
		
		
	}

}
