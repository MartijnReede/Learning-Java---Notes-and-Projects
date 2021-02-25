package assignment_13;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given an array of strings, return the count of the number of strings with the given length	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		wordsCount({"a", "bb", "b", "ccc"}, 1) <b>---></b> 2<br>
		wordsCount({"a", "bb", "b", "ccc"}, 3) <b>---></b> 1 <br>
		wordsCount({"a", "bb", "b", "ccc"}, 4) <b>---></b> 0 <br>
	 */
	
	public static int wordsCount(String[] words, int len) {
		
		int count = 0;
		
		for (String word : words) {
			if (word.length() == len) count += 1;
		}
		return count;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
