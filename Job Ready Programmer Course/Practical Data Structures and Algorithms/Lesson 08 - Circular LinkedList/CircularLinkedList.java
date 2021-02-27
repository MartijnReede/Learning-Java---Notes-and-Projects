package com.jobready.circularLinkedList;

public class CircularLinkedList {
	
	private Node first = null;
	private Node last = null;	
	
	public CircularLinkedList() {
	}
	
	public void insertFirst(int value) {
		Node newNode = new Node();
		newNode.data = value;
	
		if (last == null) last = newNode;
		newNode.next = first;
		first = newNode;
	}
	
	public void insertLast(int value) {
		Node newNode = new Node();
		newNode.data = value;
		if (first == null) {
			first = newNode;
		}
		
		if (last == null) {
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}		
	}
	
	public int deleteFirst() {
		if (isEmpty()) {
			System.out.println("Nothing to delete, list is already empty...");
			return 0;
		} else {
			int temp = first.data;
				if (first.next == null) {
					first = null;
					last = null;
				}
				else first = first.next;
			return temp;
		}
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int getFirst() {
		if (first == null) {
			System.out.println("List is empty");
			return 0;
		} else {
			return first.data;
		}
	}
	
	public int getLast() {
		if (last == null) {
			System.out.println("List is empty...");
			return 0;
		} else {
			return last.data;
		}
	}
	
	public void printContent() {
		if (first == null) {
			System.out.println("List is empty....");
		} else {
			
			Node n = first;
			System.out.print("[");
			while (n != null) {
				System.out.print(n.getData());
				if (n.next != null) {
					System.out.print(", ");
				}
				n = n.next;
			}
			System.out.print("]");
		}
	}
}
