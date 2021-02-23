package assignment_06;

import ignore.TestingUtils;

public class App {

	/**
	We'll say a number is cool if it's a multiple of 11 or if it is one more than a multiple of 11. 
	Return true if the given non-negative number is cool. Use the % "modulus" operator 
	we spoke about in the prerequisite section. Watch the lesson on modulus if you need to review
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		isCool(22)   <b>---></b> true <br>
		isCool(23)    <b>---></b> true <br>
		isCool(24) <b>---></b> false <br>
	 */
		public static boolean isCool(int n) {
			return (n % 11 == 0) || (n % 11 == 1);
		}

	
	
	
	
	
	
	
	
	
	
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}


