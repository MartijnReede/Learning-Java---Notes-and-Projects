package com.jobready.singlyLinkedList;

public class Application {

	public static void main(String[] args) {
		
		//In this program we're going to create a LinkedList data structure. We are not going to use an Array
		//as an underlying structure, we are going to use the Node class as a container. 
		
		//So a singly LinkedList is a list where the nodes only know about the next node. It's a one way List
		//from the first until the last. 
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(10);
		list.insertFirst(15);
		list.insertFirst(20);
		list.insertLast(99);
		
		
		//The insert last method is not efficient now. It traverses the whole list to see what is the last node
		//before adding another one. It would  be better to create a variable in the linkedList which points directly to the 
		//last node. 
		
		//ASSIGNMENT: Create a method which inserts a value at the end of the list efficiently. 
		list.insertLastEfficient(100000);
		
		//When the begin and end of the list are available for the LinkedList data structure, we are
		//not speaking of a singly LinkedList anymore, it's a circular LinkedList. 
		
		list.printContent();

	}

}
