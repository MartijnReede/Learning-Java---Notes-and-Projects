package ignore;

import assignment_12.App;

public class TestingUtils {
	public static void runTests(){
		
		String[] params1 = { "ab*cd", "ab**cd", "sm*eilly", "sm*eil*ly", "sm**eil*ly", "sm***eil*ly", "stringy*",
				"*stringy", "*str*in*gy", "abc", "a*bc", "ab", "a*b", "a", "a*", "*a", "*", "" };
		
		String[] expected = { "ad", "ad", "silly", "siy", "siy", "siy", "string", "tringy", "ty", "abc", "c", "ab", "",
				"a", "", "", "", "" };
        
		for(int i=0; i < params1.length; i++){
			String result = App.starKill(params1[i]);
			if(result.equals(expected[i])) {
				System.out.println(printPassResult(params1[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object expected, Object result){
		return "PASS: starKill("+ params1.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: starKill("+ params1.toString()+") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}