package com.jobready.doublyLinkedList;

public class Application {

	//The nodes in the doubly LinkedList are not only pointing to the next node, but also to the previous node. 
	//The doubly linkedList class still contains only a first and last node reference. 
	
	
	//If all communication with a certain node is removed, the garbage collector will remove the object. 
	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		
		list.insertAfter(1, 11);
		
		list.insertLast(5);
		list.insertLast(6);
		list.insertLast(7);
		
		list.removeKey(6);

		
		System.out.println("Queue: ");
		list.printQueue();
		
		System.out.println("\n\nStack: ");
		list.printStack();
	}

}
