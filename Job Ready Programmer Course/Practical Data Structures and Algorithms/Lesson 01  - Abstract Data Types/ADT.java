package com.lesson.abstractdatatype;

public class ADT {

	public static void main(String[] args) {
		
		//Abstract data type is capable of handling more advanced functionality than primitive data types.
		//Abstract data types can be seen as trustworthy containers, capable of doing things with data.
		//They can be used as a tool by creating an instance of the class.
		
		//Abstract data type = ADT.
		
		//Assignment: Create an ADT which is used as a counter. Clients can use this counter without having to 
		//worry how to ADT works.
		
		Counter c = new Counter("My Counter");
		
		c.increment();
		System.out.println(c.getCurrentValue());
		System.out.println(c.toString());
		
		
		//So an example of more ADT's are for example Lists, or Stacks.
		//These are containers for values, and the client can use methods to do something with it.
	}

}
