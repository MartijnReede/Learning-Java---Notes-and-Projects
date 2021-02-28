package com.jobready.recursion;

public class BasicsExplained {

	public static void main(String[] args) {
		
		//Recursion: a method which invokes itself (see work() example below);
		
		//The stack memory handles invoked methods. If recursion is not the case but different methods
		//are invoked inside of running methods, the stack memory will look like this: 
		//
		//			____STACK MEMORY_____
		//			|					|	
		//			|doOnelastThing()__	|	
		//			|doSomethingmore()__|		
		//			|__doSomething()___	|	
		//			|______MAIN()___	|	

		//This represents the methods below. doSomething is watining for doSomethingMore to complete.
		//doSomethingMore is waiting for doOneLastThing to complete. If the last one is complete, the other
		//methods are also complete and they will be (one by one) removed from the memory stack. 
		
		/*
		public void doSomething() {
			doSomethingMore();
		}
		
		public void doSomethingMore() {
			doOneLastThing();
		}
		
		public void doOneLastThing() {
			System.out.println("BLA");
		}
		*/
		
		//With recursion the memory stack will look like this:
		
		//			____STACK MEMORY_____
		//			|					|	
		//			|____doWork()_______|	
		//			|____doWork()_______|		
		//			|_____doWork()____	|	
		//			|______MAIN()_______|	
		//
		//This will pile up until we run out of stack space.  If this happens we will get a stack overflow error. 
		//To prevent this, we need a way to stop the methods invoking themselves. Below an example with reduceByOne().
	
		reduceByOne(10);
	}

	
	public static void work() {
		work();
	}
	
	public static void reduceByOne(int i) {
		
		if (i == 0) {
			System.out.println("I'm at 0");	
		} else {
			System.out.println(i);
		reduceByOne(i-1);
		}
	}
}
