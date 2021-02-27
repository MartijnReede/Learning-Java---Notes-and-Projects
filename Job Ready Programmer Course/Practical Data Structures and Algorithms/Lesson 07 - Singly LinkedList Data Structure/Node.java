package com.jobready.singlyLinkedList;

public class Node {

	private int value;
	private Node next = null;
	
	public void displayNode() {
		System.out.println("{" + value + "} ");
	}
	
	public void setNext(Node n) {
		this.next = n;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setValue(int v) {
		this.value = v;
	}
	
	public int getValue() {
		return value;
	}
}
