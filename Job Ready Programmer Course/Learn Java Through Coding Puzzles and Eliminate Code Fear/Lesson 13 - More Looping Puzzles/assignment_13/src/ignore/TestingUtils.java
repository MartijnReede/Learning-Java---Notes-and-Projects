package ignore;

import java.util.Arrays;

import assignment_13.App;

public class TestingUtils {
	public static void runTests(){
		
		String[] [] params1 = { { "a", "bb", "b", "ccc" }, { "a", "bb", "b", "ccc" }, { "a", "bb", "b", "ccc" },
				{ "xx", "yyy", "x", "yy", "z" }, { "xx", "yyy", "x", "yy", "z" }, { "xx", "yyy", "x", "yy", "z" } };
				
		int [] params2 = {1,3,4,1,2,3};
		
		int[] expected = { 2, 1, 0, 2, 2, 1 };
        
		for(int i=0; i < params1.length; i++){
			int result = App.wordsCount(params1[i], params2[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], params2[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], params2[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(String[] params1, Object params2, Object expected, Object result){
		String str = "";
		
		return "PASS: wordsCount("+Arrays.toString(params1)+", "+ params2+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(String[] params1, Object params2, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: wordsCount("+Arrays.toString(params1)+", "+ params2+") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}