package assignment_15;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	public static int longestStreak(String str) {
	
		int score = 1;
		int bestScore = 0;
		
		if ( !str.equals("") ) {	
			for (int i = 0; i< str.length(); i++) {
			
				if (i > 0 && str.charAt(i) == str.charAt(i -1)) {
					score += 1;
					if (score >= bestScore) bestScore = score;
				}
				
				if (i > 0 && str.charAt(i) != str.charAt(i -1)) {
					if (score > bestScore) bestScore = score;
					score = 1;	
				}
			}
		}
		return bestScore;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

