package ignore;

import assignment_09.App;

public class TestingUtils {
	public static void runTests(){
		

		int[] params1 = { 19, 21, 19, 22, 22, 22, 33, 1, 34, 17, 18, 16, 3, 3, 21 };

		int[] params2 = { 21, 19, 22, 19, 50, 22, 1, 2, 33, 19, 17, 23, 4, 2, 20 };

		int[] expected = { 21, 21, 19, 19, 0, 0, 1, 2, 0, 19, 18, 16, 4, 3, 21 };
        
		for(int i=0; i < params1.length; i++){
			int result = App.nearestTwentyOne(params1[i], params2[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], params2[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], params2[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object params2, Object expected, Object result){
		return "PASS: nearestTwentyOne("+ params1.toString()+ ", "+ params2.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object params2, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: nearestTwentyOne("+ params1.toString()+ ", "+ params2.toString()+ ") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}