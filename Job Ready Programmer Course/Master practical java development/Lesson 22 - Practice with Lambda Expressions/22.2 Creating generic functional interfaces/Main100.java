
public class Main100 {

	public static void main(String[] args) {
		
		//In the previous lesson I made a lot of different Functional Interfaces. '
		//This wasn't really necessary since I could make the interfaces generic. 
		
		//For example: if I want to make two lambda expressions:
		// 		1. Takes an Integer as an argument and returns an Integer.
		//		2. Takes a String as an argument and returns a String. 
		
		//I could use a generic functional interface for this.
		
		GenericFunctionalInterface<Integer> getIntPlus50 = (a) -> a + 50;
		System.out.println(getIntPlus50.genericMethod(50));
		
		GenericFunctionalInterface<String> getReverseString = (str) -> 
				{
				String result = "";
				for(int i = str.length()-1; i >=0; i--) {
					result += str.charAt(i);
				}
				return result;
			};
		
			getReverseString.genericMethod("Reverse me!");
			
		//Now I use one functional interface for two completely different lambdas!

	}

}
