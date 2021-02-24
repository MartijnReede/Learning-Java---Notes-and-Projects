package ignore;

import assignment_10.App;

public class TestingUtils {
	public static void runTests(){
		
		int[] params1 = { 1, 1, 1, 1, 6, 13, 13, 13, 9, 8, 7, 3 };
		
		int[] params2 = { 2, 2, 13, 13, 5, 2, 2, 13, 4, 13, 2, 3 };

		int[] params3 = { 3, 13, 3, 13, 2, 3, 13, 2, 13, 2, 1, 13 };

		int[] expected = { 6, 3, 1, 1, 13, 0, 0, 0, 13, 8, 10, 6 };
        
		for(int i=0; i < params1.length; i++){
			int result = App.partialSum(params1[i], params2[i], params3[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], params2[i],  params3[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], params2[i],  params3[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object params2, Object params3, Object expected, Object result){
		return "PASS: partialSum("+ params1.toString()+ ", "+ params2.toString()+ ", "+ params3.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object params2, Object params3, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: partialSum("+ params1.toString()+ ", "+ params2.toString()+", "+ params3.toString()+ ") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}