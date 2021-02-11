public class Main5 {

	public static void main(String[] args) {
		
		String a = "Hello!";
		
		//.length() is a method that prints the length of the String. 
		System.out.println(a.length());
		
		//.length() method also counts spaces.
		String b = "H e l l o";
		System.out.println(b.length());			
	
		String str = "ABCDEFG";
		
		System.out.println(str.charAt(3));  	   	// Gets the character at index number 3. It returns a char data type.
		
		System.out.println(str.indexOf('A'));		// Gets the index number at char 'A'.
		System.out.println(str.indexOf("EFG")); 	// This also works!
		System.out.println(str.indexOf("B", 1));	// Starts searching from index number 1.
		
		int lastIndex = str.lastIndexOf("G");
		System.out.println("Searching from right till left, 'G' is at index number:" + lastIndex + "'.");
		
		// Extracting strings
		// The method below skips the first 2 characters.
		String sub = "HiHaHo";
		String extractedString = sub.substring(2);
		System.out.println(sub + " / " +  extractedString);
		
		// Extracting strings 2
		// The method below skips the first character and skips everything after the 3rd character.
		String sub2 = "HoiHai";
		String extractedString2 = sub2.substring(1, 3);
		System.out.println(sub2 + " / " + extractedString2);	
		
		//The correct way to compare Strings...
		String f = "Hello";
		String g = "There";
		if (f.equals(g)) {
			System.out.println("f equals g");
		} else {
			System.out.println("f does not equals g.");
		}
		
		//DONT compare Strings with f == g. 
		
		//Compare Strings and ignore capital letters.
		String i = "HeLlo";
		String j = "hellO";
		if (i.equalsIgnoreCase(j)) {
			System.out.println("i and j are the same!");
		}
	}
}
