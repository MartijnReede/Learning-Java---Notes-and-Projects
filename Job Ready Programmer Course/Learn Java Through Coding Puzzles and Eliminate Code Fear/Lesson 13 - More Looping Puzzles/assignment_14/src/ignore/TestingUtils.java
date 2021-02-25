package ignore;

import java.util.Arrays;

import assignment_14.App;

public class TestingUtils {
	public static void runTests(){
		
		String[][] params1 = { { "aa", "bb", "cc" }, { "aa", "bb", "cc" }, { "aa", "bb", "cc" }, { "", "", "ccc" },
				{ "", "", "" }, { "aa", "bb", "cc" }, { "aa", "", "ccc" }, { "x", "y", "z" }, { "", "y", "z" },
				{ "x", "y", "z" }, { "x", "y", "z" }, { "b", "x", "y", "z" }, { "aaa", "bb", "c" } };
		
		String[][] params2 = { { "aaa", "xx", "bb" }, { "aaa", "b", "bb" }, { "", "", "ccc" }, { "aa", "bb", "cc" },
				{ "", "bb", "cc" }, { "", "", "" }, { "", "bb", "cc" }, { "y", "z", "x" }, { "", "y", "x" },
				{ "xx", "yyy", "zzz" }, { "xx", "yyy", "" }, { "a", "xx", "yyy", "zzz" }, { "aaa", "xx", "bb" } };

		
		int[] expected = { 1, 2, 1, 1, 0, 0, 1, 0, 1, 3, 2, 3, 1 };
        
		for(int i=0; i < params1.length; i++){
			int result = App.matchingChar(params1[i], params2[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], params2[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], params2[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(String[] params1, String[] params2, Object expected, Object result){
		String str = "";
		
		return "PASS: matchingChar("+Arrays.toString(params1)+", "+ Arrays.toString(params2)+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(String[] params1, String[] params2, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: matchingChar("+Arrays.toString(params1)+", "+ Arrays.toString(params2)+") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}