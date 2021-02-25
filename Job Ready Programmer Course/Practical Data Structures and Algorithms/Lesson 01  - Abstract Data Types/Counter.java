package com.lesson.abstractdatatype;

public class Counter {

	private String name = "";
	private int counter = 0;
	
	public Counter(String str) {
		this.name = str;
	}
	
	public void increment() {
		counter += 1;
		System.out.println("Value incremented...");
	}
	
	public int getCurrentValue() {
		return counter;
	}

	@Override
	public String toString() {
		return "Counter [name=" + name + ", counter=" + counter + "]";
	}
}
