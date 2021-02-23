package assignment_05;

import ignore.TestingUtils;

public class App {

	/**
	Given three ints, first, second, third, return true if second is greater than first, and third is 
	greater than second. However, with the exception that if the parameter "itsOk" is true, 
	second does not need to be greater than first but still better be less than third.
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		isOrdered(1, 2, 4, false)   <b>---></b> true <br>
		isOrdered(1, 2, 1, false)    <b>---></b> false <br>
		isOrdered(1, 1, 2, true) <b>---></b> true <br>
	 */
	public static boolean isOrdered(int first, int second, int third, boolean itsOk) {
		
		if (second > first || itsOk) {
			if (third > second) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
	}
}


