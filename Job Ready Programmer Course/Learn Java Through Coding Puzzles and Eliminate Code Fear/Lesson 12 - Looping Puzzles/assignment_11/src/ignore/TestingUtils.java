package ignore;

import assignment_11.App;

public class TestingUtils {
	public static void runTests(){
		
		String[] params1 = { "The", "AAbb", "Hi-There", "Word!", "!!", "", "a", ".", "aa" };
		
		String[] expected = { "TThhee", "AAAAbbbb", "HHii--TThheerree", "WWoorrdd!!", "!!!!", "", "aa", "..", "aaaa" };
        
		for(int i=0; i < params1.length; i++){
			String result = App.repeatChar(params1[i]);
			if(result.equals(expected[i])) {
				System.out.println(printPassResult(params1[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object expected, Object result){
		return "PASS: repeatChar("+ params1.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: repeatChar("+ params1.toString()+") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}