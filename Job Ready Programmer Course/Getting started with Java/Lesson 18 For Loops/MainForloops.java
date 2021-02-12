public class MainForloops {

	public static void main(String[] args) {
			
		// For loop: do something for something. 
		
		//This for loop repeats itself a 10 times. 
		for (int i = 0; i<= 10; i++) {
			System.out.println(i);
		}
	
		String name = "BLabliejifeifalkmflkamflakemfeaf";
		
		// This for loop iterates through the String name. 
		for (int j = 0; j < name.length(); j++) {
			System.out.println(name.charAt(j));
		}
		
		// The for loop iterates through the String name from right to left. 
		for (int k = name.length()-1; k >= 0; k--) {
			System.out.println(name.charAt(k));
		}
		
		// A for loop that only prints all the even numbers until 100. 
		for (int e = 0; e<=100; e+=2) {
			System.out.println(e);
			}
		}
		
		
	}

