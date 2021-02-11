public class TheBasicsOfMethodsInJava2 {
		
	public static void printSomeJunk(String argument) {
		System.out.println("This method is comming from another class!");
		
	}
	
	public static void sumTwoNumbers(int num1, int num2) {
		System.out.println("The sum of the two arguments is: " + (num1 + num2));
	}
	
	public static int add10(int someArgument) {
		int result = someArgument + 10;
		return result;
	}
	
	public static String getTheArgument(String argument) {
		return argument;
	}
}
