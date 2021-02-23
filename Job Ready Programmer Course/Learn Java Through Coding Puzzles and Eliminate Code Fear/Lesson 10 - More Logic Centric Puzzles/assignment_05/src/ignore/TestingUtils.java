package ignore;

import assignment_05.App;

public class TestingUtils {
	public static void runTests(){
		

		int[] params1 = { 1, 1, 1, 3, 2, 3, 4, 4, 2, 7, 7, 7 };

		int[] params2 = { 2, 2, 1, 2, 3, 2, 2, 5, 4, 9, 5, 5 };
		
		int[] params3 = { 4, 1, 2, 4, 4, 4, 2, 2, 6, 10, 6, 4 };

		boolean[] params4 = { false, false, true, false, false, true, true, true, true, false, true, true };

		boolean[] expected = { true, false, true, false, true, true, false, false, true, true, true, false };
        
		for(int i=0; i < params1.length; i++){
			boolean result = App.isOrdered(params1[i], params2[i], params3[i], params4[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], params2[i],params3[i], params4[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], params2[i], params3[i], params4[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object params2, Object params3, Object params4, Object expected, Object result){
		return "PASS: isOrdered("+ params1.toString()+ ", "+ params2.toString()+", "+ params3.toString()+", "+ params4.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object params2, Object params3, Object params4, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: isOrdered("+ params1.toString()+ ", "+ params2.toString()+", "+ params3.toString()+", "+ params4.toString()+ ") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}