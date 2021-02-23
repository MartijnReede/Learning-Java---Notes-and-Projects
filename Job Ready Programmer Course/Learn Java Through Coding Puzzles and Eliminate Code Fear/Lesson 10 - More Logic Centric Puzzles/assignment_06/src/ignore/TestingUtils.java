package ignore;

import assignment_06.App;

public class TestingUtils {
	public static void runTests(){
		

		int[] params1 = { 22, 23, 24, 21, 11, 12, 10, 9, 8, 0, 1, 2, 121, 122, 123, 46, 49, 52, 54, 55 };
		boolean[] expected = { true, true, false, false, true, true, false, false, false, true, true, false, true, true,
				false, false, false, false, false, true };
        
		for(int i=0; i < params1.length; i++){
			boolean result = App.isCool(params1[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object expected, Object result){
		return "PASS: isCool("+ params1.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: isCool("+ params1.toString()+ ") -> " + result.toString() 
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}