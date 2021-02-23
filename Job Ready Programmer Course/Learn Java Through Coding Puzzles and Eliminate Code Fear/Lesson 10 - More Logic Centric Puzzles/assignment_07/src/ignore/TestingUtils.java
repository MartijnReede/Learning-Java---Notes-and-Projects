package ignore;

import assignment_07.App;

public class TestingUtils {
	public static void runTests(){
		

		int[] params1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 16, 18, 19, 21, 44, 45, 100 };
		String[] expected = { "1!", "2!", "Fizz!", "4!", "Buzz!", "Fizz!", "7!", "8!", "Fizz!", "FizzBuzz!", "16!",
				"Fizz!", "19!", "Fizz!", "44!", "FizzBuzz!", "Buzz!" };

		for(int i=0; i < params1.length; i++){
			String result = App.fizzyWizzy(params1[i]);
			if(result.equals(expected[i])) {
				System.out.println(printPassResult(params1[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object expected, Object result){
		return "PASS: fizzyWizzy("+ params1.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: fizzyWizzy("+ params1.toString()+ ") -> " + result.toString() 
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}