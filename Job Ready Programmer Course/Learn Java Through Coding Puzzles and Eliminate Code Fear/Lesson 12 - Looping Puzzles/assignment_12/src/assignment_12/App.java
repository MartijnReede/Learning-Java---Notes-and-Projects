package assignment_12;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Return a version of the given string, where for every star (*) 
	in the string the star and the chars immediately to its left and right are gone. 
	So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		starKill("cd*zq")  <b>---></b>"cq"<br>
		starKill("ab**cd")    <b>---></b> "ad" <br>
		starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */
	
	public static String starKill(String str) {

		String result = "";
		int[] printableChars = new int[str.length() + 2];
			
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '*') {
				printableChars[i] = 1;
				printableChars[i + 1] = 1;
				printableChars[i + 2] = 1;
			}
		}
		
		int positionCount = 0;
		for (int i : printableChars) {
			if (positionCount >= 1 && positionCount <= str.length() && i != 1) {
				result += str.charAt(positionCount -1);
			}
		positionCount++;	
		}
		
		return result;	
	}
	


	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
