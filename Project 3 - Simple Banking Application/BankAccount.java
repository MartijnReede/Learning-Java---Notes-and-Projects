import java.util.Scanner;

public class BankAccount {

	public int balance;
	public int latestTransaction;
	public String name;
	public int ID;
	
	BankAccount (String name, int ID){
		this.name = name;
		this.ID = ID;
	}
	
	public void deposit(int amount) {
		if (amount != 0 ) {					
			balance = balance + amount;
			latestTransaction = amount;
		}
	}
	
	public void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			latestTransaction = -amount;     
		}
	}
	
	public void getLatestTransaction() {
		if (latestTransaction > 0) {
			System.out.println("You deposited: " + latestTransaction + " euro.");
		
		} else if (latestTransaction < 0) {
			System.out.println("You withdrew: " + latestTransaction + " euro.");
		
		} else {
			System.out.println("No previous transactions found.");
		}
		
	}
	
	public void getBalance() {
		System.out.println("Your balance is: " + balance + " euro.");
	
	}

	public void menu() {
		char option;                        
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("************* Welcome *************");
		System.out.println(name + " || User ID: "+  ID + ".\n");
		System.out.println("A - Request balance.");
		System.out.println("B - Withdraw money.");
		System.out.println("C - Deposit money.");
		System.out.println("D - View latest transaction.");
		System.out.println("E - Exit.");
		System.out.println("\n");
		
		do {
		
			System.out.println("-------------------------------------------------");
			System.out.println("Choose an option from the menu.");
			System.out.println("Type option on keyboard, then press enter.");
			System.out.println("-------------------------------------------------");
			option = keyboard.next().charAt(0);	
			
			switch(option) {
			
			case 'A':
				System.out.println("Your balance is: " + balance + " euro.\n");
				break;
			
			case 'B':
				System.out.println("Enter amount, then press enter.");
				int amount1 = keyboard.nextInt();
					if (amount1 >= balance + 1) {
						System.out.println("Insufficient funds, going back to the main menu.");
						continue;
					}
				withdraw(amount1);
				System.out.println("You withdrew " + amount1 + " euro. Your new balance is: " + balance + " euro.\n");
				break;
				
			case 'C':
				System.out.println("Enter amount, then press enter.");
				int amount2 = keyboard.nextInt();
				deposit(amount2);
				System.out.println("You deposited " + amount2 + " euro on your account. Your new balance is: " + balance + " euro.\n");
				break;
				
			case 'D':
				getLatestTransaction();
				break;
				
			default:
				System.out.println("Incorrect choice, please try again!");
				System.out.println("Then press enter.");
				option = keyboard.next().charAt(0);
				break;	
				
			case 'E':	
				System.out.println("The program is closing.");
					
			}
				
		} while (option != 'E');								
		
		System.out.println("See you next time!");
		
		keyboard.close();
	}
}	


