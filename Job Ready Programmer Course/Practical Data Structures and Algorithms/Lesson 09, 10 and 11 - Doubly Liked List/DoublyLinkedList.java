package com.jobready.doublyLinkedList;

public class DoublyLinkedList {

	private Node first;
	private Node last;

	public DoublyLinkedList(){
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (isEmpty()) {
			first = newNode;
			last = newNode;
		} else {	
			first.previous = newNode;
			newNode.next = first;
			first = newNode;
		}
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			newNode.previous = last;
			last = newNode;
		}
	}
	
	public int removeFirst() {
		
		if (first == null) {
			System.out.println("List is empty...");
			return 0;
		} else {
			int temp = first.data;
				if (first.next == null) {
					first = null;
				} else {
					first.next.previous = null;
					first = first.next;
				}
			return temp;
		}
	}
	
	public int removeLast() {
		if (last == null) {
			System.out.println("List is empty...");
			return 0;
		} else {
			int temp = last.data;
				if (last.previous == null) {
					last = null;
					first = null;
				} else {
					last.previous.next = null;
					last = last.previous;
				}
			return temp;
		}
	}
	
	public void printQueue() {
		if ( !(isEmpty()) ) {
			Node f = first;
			while (f != null) {
				System.out.println(f.data);
				f = f.next;
			}
		} else {
			System.out.println("List is empty...");
		}
	}
	
	public void printStack() {
		if ( !(isEmpty()) ){
			Node l = last;
			while (l != null) {
				System.out.println(l.data);
				l = l.previous;
			}
		} else {
			System.out.println("List is empty...");
		}
	}
	
	public boolean insertAfter(int key, int data) {
		if (isEmpty()) {
			System.out.println("List is empty...");
			return false;
		} else {
			Node current = first;
			while (current != null) {
				if (key == current.data) {
					Node newNode = new Node();
					newNode.data = data;
					if (current == last) {
							current.next = newNode;
							last = newNode;
							last.previous = current;
						} else {	
							newNode.next = current.next;
							newNode.previous = current;
							current.next.previous = newNode;
							current.next = newNode;
						}	
					return true;
				}
				current = current.next;
			}
		System.out.println("No match found...");	
		return false;		
		}
		
	}
	
	public boolean removeKey(int key) {
		if (isEmpty()) {
			System.out.println("List is empty...");
			return false;
		} else {
			Node current = first;
			while (current != null) {
				if (current.data == key) {
					if (current == first) {
						current.next.previous = null;
						first = current.next;
					} else if (current == last) {
						last.previous.next = null;
						last = last.previous;
					} else {
						current.previous.next = current.next;
						current.next.previous = current.previous;
					}
				return true;	
				}
			current = current.next;
			}
		System.out.println("No match found...");
		return false;
		}
	}
}
