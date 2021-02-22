package assignment_01;

import ignore.TestingUtils;

public class App {
	
	/**
	Given a string of odd length, return the middle 3 characters from the string, 
	so the string <b>"Monitor"</b> yields <b>"nit"</b>. 
	If the string length is less than 3, return the string as is. <br> <br>

	<b>EXPECTATIONS:</b><br>
	middleThree("bunny") <b>---></b> "unn" <br>
	middleThree("peter") <b>---></b> "ete" <br>
	middleThree("Jamaica") <b>---></b>"mai" <br>
	 */
	
	//EXERCISE: FILL THIS METHOD SO IT WORKS!*************************************
	
	public static String middleThree(String str) {
		String result =  "";
		
		if (str.length() <= 3) {
			result = str;
		} else if (str.length() > 3) {
			
			int middle;
			middle = (str.length()/2)-1;
			result = str.substring(middle, middle + 3);
		}
		
		return result;
	}
	
	//WRITE CODE UNTIL HERE!******************************************************
	
	
	
	
	
//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
	}
}
