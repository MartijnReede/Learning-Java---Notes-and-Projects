import java.util.Scanner;

public class ScannerClass {

	public void introduction() {
		System.out.println("Hi, I can search for befriended numbers!");
		System.out.println("Until what number do you want me to search?");
	}
	
	public int introScanner() {
		Scanner keyboard = new Scanner(System.in);
		int range = keyboard.nextInt();
		keyboard.close();
		System.out.println("Lets go! I will search for befriended numbers between 1 and " + range + ".");
		return range;
	}
		
}
	
