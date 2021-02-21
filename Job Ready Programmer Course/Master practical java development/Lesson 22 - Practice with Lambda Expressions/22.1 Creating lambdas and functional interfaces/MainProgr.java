
public class MainProgr {

	public static void main(String[] args) {
		
		//Lambda expression: They are blocks of code used to implement a method defined by a functional interface.
		
		//What is the whole point of using lambdas?
		//It't not about using less code, it allows us to dissociate a set of instructions from an object.
		//Its the separation of behavior from an object.
		
		//It is not really about writing less code, as you can see below, we have to write a lot of code
		//and create functional interfaces. Java has a lot of build-in interfaces that make the use of lambdas
		//easier. This will be covered in the next lesson. 
		
		//Its good practice to write an annotation in the functional interface: @FunctionalInterface.
		//This lets other programmers know that they can't add other methods.
		//Functional interfaces only work with ONE abstract method in it. 
		
		//Practice lambda 1:'
		//Print some random text...
		SomeFunctionalInterface someCode = () -> {
			System.out.println("Hi there!");
			System.out.println("How are you doing?");
		};
		//Using the lambda expression can be done in two ways.
		sayHello(someCode); //Using the method below.
		someCode.someRandomMethod(); // Using the method from the functional interface.
		
		//Practice lambda 2:
		//Print the sum of two integers...
		//We have to create another functional interface which takes both the Integer arguments. 
		//We don't have to code the return type, since the lambda expression is smart to know what arg1 + arg2 needs to be returned.
		SomeCalculationInterface someCalculation = (arg1, arg2) -> arg1 + arg2;
		System.out.println(someCalculation.Sum(2, 2));
		
		//Practice lambda 3:
		//Divide two integers, but return 0 if arg1 == 0....
		//With this lambda expression you need to code with the return keyword. We can use the same interface
		//as for the last lambda expressions since that also takes two integers. 
		SomeCalculationInterface divider = (arg1, arg2) -> {
				if (arg1 == 0) {
					return 0;
				} else {
				return arg1 / arg2;
				}};
		System.out.println("Where arg1 = 0, devided nr is: " + divider.Sum(0, 10));
		System.out.println("Where arg1 = 100, devided nr is: " + divider.Sum(100, 5));
				
		//Practice lambda 4:
		//Reverse a string...
		//For this I made a new functional interface which returns a String. 
		StringInterface reverser = (a) -> {
			String result = "";
			for(int i = a.length()-1; i >=0; i--) {
				result += a.charAt(i);
			}
			return result;
		};
		System.out.println(reverser.reverse("Hello there!"));
		
		//Practice lambda 5:
		//Return a factorial number (factorial number of 5 = 1*2*3*4*5 = 120).
		//For this I create a new functional interface which accepts one Integer and returns an Integer. 
		
		FactorialInterface factory = (factNum) -> {
			int result = 1;
			
			for (int i = 1; i <= factNum; i++) {
				result = i * result;
			}
			
			return result;
		};
		System.out.println(factory.factorial(5));
		
	}
	
	public static void sayHello(SomeFunctionalInterface SFI) {
		SFI.someRandomMethod();
	}
	
	
	
	

}
