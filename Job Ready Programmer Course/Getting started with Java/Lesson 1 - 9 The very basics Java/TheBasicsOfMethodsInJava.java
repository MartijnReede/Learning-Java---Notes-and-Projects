
public class TheBasicsOfMethodsInJava {

	public static void main(String[] args) {
		
		//Methods are blocks with instructions. 
		
		//An example of a method is shown below. "Hello World" is an argument in this case. 
		System.out.println("Hello World");
		
		// The syntax below invokes the printSoneJunk method which accepts a String argument. 
		printSomeJunk("Blablabla");
		
		// I can write another method that is exactly the same, except the type of argument. 
		//The compiler knows which method to choose based on the arguments.  
		printSomeJunk(30);
		
		// We can also invoke methods from other classes. We have to refer to them by the class name. 
		TheBasicsOfMethodsInJava2.printSomeJunk(" blablabla");
		
		// Another example to sum two numbers. This method is written in another class. 
		TheBasicsOfMethodsInJava2.sumTwoNumbers(10, 5);
		
		// This is a method that returns an Integer. 
		// To make this work, we don't use the return type "void" but "int". 
		System.out.println(TheBasicsOfMethodsInJava2.add10(10));
		
		//Exercise: return a string and print it. 
		String returnedArg = TheBasicsOfMethodsInJava2.getTheArgument("Hello");
		System.out.println(returnedArg);
		
		
	}
	
	public static void printSomeJunk(String argument) {
		System.out.println("Hi there" + argument);
	}
	
	public static void printSomeJunk(int argument) {
		System.out.println("Hi there, this is some integer Junk" + argument);
	}
}
