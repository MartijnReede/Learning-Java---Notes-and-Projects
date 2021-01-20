import java.util.Scanner;

public class SpecialNumbersMAIN {

	public static void main(String[] args) {
		
		System.out.println("I can find special numbers!");
		System.out.println("Until what number do I need to search?");
		
		Scanner keyboard = new Scanner(System.in);
		int range = keyboard.nextInt();

		SpecialNumberFinder itsMagic = new SpecialNumberFinder(range);
		
		itsMagic.showSpecialNumbers();
		
		keyboard.close();
	}
	

}
