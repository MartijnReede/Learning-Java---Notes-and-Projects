import java.util.Random;
import java.util.Scanner;

public class EmailCreator {

	private String firstname;
	private String lastname;
	private String department;
	private String company = "patagonia";
	private String password = "";
	private String emailAddress;
	private int emailCapacity;
	private String possibleChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwqyz!?-()=+-";
	private int passwordLength = 8;
	
	Scanner keyboard = new Scanner(System.in);
	
	// CONSTRUCTOR.
	public EmailCreator (String fn, String ln){
		firstname = fn;
		lastname = ln;
		System.out.println("Email created for: " + firstname + " " + lastname + ".\n");
		
	// SETTING DEPARTMENT.
		department = setDepartment();
			if (department.equals("")) {
				System.out.println("Department is set to: no department.");
			} else {
				System.out.println("Department is set to: " + department);
			}
	
	// SHOWING GENERATED EMAIL ADRESS.
		emailAddress = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + company + ".com";
		System.out.println("Email created: " + emailAddress);
					
			
	// PASSWORD GENERATOR.
		password = generatePassword();
		System.out.println("Password created: " + password + "\n");
		
	// SETTING EMAIL CAPACITY.
		emailCapacity = setEmailCapacity();
		System.out.println("Email capacity is set to: " + emailCapacity + " MB.\n");
		System.out.println("-------------------------------------------------------------------------------------\n");
		
	// GOING TO FINAL MENU.
		finalMenu();
	}
	
	// SETTING DEPARTMENT METHOD.
	private String setDepartment() {
		System.out.println("What is your department? Type in the corresponding number, then press enter.");
		System.out.println("1 - For sales.");
		System.out.println("2 - For development.");
		System.out.println("3 - For accounting.");
		System.out.println("0 - For none of the above.\n");
		int depChoice = keyboard.nextInt();
			if (depChoice == 1) {return "sales.";}
			else if (depChoice == 2) {return "development.";}
			else if (depChoice == 3) {return "accounting.";
			}else {return "";}		
	}
	
	// PASSWORD GENERATOR METHOD.
	public String generatePassword() {
		
		Random rand = new Random();
		char[] charArray = new char[passwordLength];
		
			for (int i = 0; i < passwordLength; i++) {
				charArray[i] = possibleChar.charAt(rand.nextInt(possibleChar.length()));
			}
	
			for (int i = 0; i < passwordLength; i++) {
				password += charArray[i];
			}
			
	return password;
	}
	
	//SETTING INBOX CAPACITY METHOD.
	private int setEmailCapacity() {
		System.out.println("How much MB capacity for inbox is required? Type in the amount.");
		return keyboard.nextInt();
	}
	
	//FINAL MENU
	private void finalMenu() {
		
		int option;
		
		do {
			System.out.println("Do you wish to change your email address or password? Type in the corresponding number, then press enter.");
			System.out.println("1 - For change password.");
			System.out.println("2 - For change email address.");
			System.out.println("0 - For exit the program and don't change anything.");
			
			option = keyboard.nextInt();
			switch(option) {
			
			case 1:
			System.out.println("Please type in your new password.");
			Scanner pass1 = new Scanner(System.in);
			password = pass1.nextLine();
			System.out.println("Password is set to: " + password + "\n");
			break;
			
			case 2:
			System.out.println("Please type in your new email address.");
			System.out.println("Beware! The text behind the '@' stays the same. Write only the text before the '@'.");
			System.out.println("So: .....................@department.patagonia.com");
			Scanner EM = new Scanner(System.in);
			String newEmail = EM.nextLine();
			emailAddress = newEmail + "@" + department + company + ".com";
			System.out.println("New email address is set to: "+ emailAddress + "\n");
			break;
			
			default:
			System.out.println("No option for this number, please try again!\n");
			break;
			
			case 0:	
			System.out.println("Processing all information.....");
			showInfo();
			break;
			}
			
		} while (option != 0);
	}
	
	//CONFIRMING EMAIL INFORMATION AND CLOSING THE PROGRAM.
	public void showInfo() {
		System.out.println("-------------------------------------------------------------------------------------\n");	
		System.out.println("EMAIL INFORMATION IS PERMINENTLY SET TO:\n");
		System.out.println("EMAIL ADDRESS: " + emailAddress);
		System.out.println("PASSWORD:      " + password);
		System.out.println("CAPACITY:      " + emailCapacity);
		System.out.println("PROGRAM SHUTS DOWN! THANKS AND GOODBYE!\n");
		System.out.println("-------------------------------------------------------------------------------------\n");
	}
	
}	
