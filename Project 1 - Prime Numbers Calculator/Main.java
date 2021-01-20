import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//INTRODUCTION MESSAGE.
		
		System.out.println("I can find prime numbers!");
		System.out.println("Until what number do you want me to search for them?");
		
		//USER INPUT.
		
		Scanner keyboard = new Scanner(System.in);
		int range = keyboard.nextInt();
		Calculator itsMagic = new Calculator(range);
		keyboard.close();
		
		//PRINT METHOD FOR SHOWING ALL PRIME NUMBERS FOUND.
		
		itsMagic.showPriemNumbers();
	}
}
