package ignore;

import assignment_15.App;

public class TestingUtils {
	public static void runTests(){
		

		String[] params1 = { "hoopla", "abbCCCddBBBxx", "", "xyz", "xxyz", "xyzz", "abbbcbbbxbbbx", "XXBBBbbxx",
				"XXBBBBbbxx", "XXBBBbbxxXXXX", "XX2222BBBbbXX2222" };

		int[] expected = { 2, 3, 0, 1, 2, 2, 3, 3, 4, 4, 4 };
        
		for(int i=0; i < params1.length; i++){
			int result = App.longestStreak(params1[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object expected, Object result){
		return "PASS: longestStreak("+ params1.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: longestStreak("+ params1.toString()+ ") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}