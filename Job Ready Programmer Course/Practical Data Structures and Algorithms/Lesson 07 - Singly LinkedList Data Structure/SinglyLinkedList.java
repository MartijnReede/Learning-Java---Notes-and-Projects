package com.jobready.singlyLinkedList;

//This is the abstract data type, which will utilize the Node class.

//This class only has one variable which points to the first node of the list. It doesn't need more since
//The first node is pointing to the second and the second to the third... etc... etc..

public class SinglyLinkedList {

	private Node first = null;
	Node last = null;
	
	public void SingleLinkedList() {	
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	//Used to insert at the beginning of the list. 
	public void insertFirst(int value) {
		Node n = new Node();
		n.setValue(value);
		n.setNext(first);
		first = n;
		if (last == null) {
			last = n;
		}
	}
	
	//Used to insert at the end of the list.
	public void insertLast(int Value) {
		Node l = first;
		
		while (l.getNext() != null) {
			l = l.getNext();
		}
		
		Node newNode = new Node();
		newNode.setValue(Value);
		l.setNext(newNode);
		last = newNode;
		if(first == null) {
			first = newNode;
		}
	}
	
	//inserts at the end of the linkedList
	public void insertLastEfficient(int value) {
		Node newNode = new Node();
		newNode.setValue(value);
		if (last != null) last.setNext(newNode);
		last = newNode;	
	}
	
	//Deletes the first. 
	public Node deleteFirst() {
		Node f = first;
		first = first.getNext();
		return f;
	}
	
	//This is going to print first to last. 
	public void printContent() {
		System.out.print("[" + first.getValue());
		
		Node one = first;
	
		while(one.getNext() != null) {
			System.out.print(", " + one.getNext().getValue());
			one = one.getNext();
		}
		System.out.println("]");
		
	}
	
	
}
