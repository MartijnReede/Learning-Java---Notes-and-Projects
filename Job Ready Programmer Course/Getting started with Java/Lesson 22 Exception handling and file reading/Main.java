import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// With a scanner, I can give input to the java program. 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter some junk in the console....");
		String input = keyboard.nextLine();
		System.out.println("You've entered: " + input);
		keyboard.close();
		System.out.println("----------------------------------------------------------");
		
		// We can also use the scanner to read from a file. To do that, we need to create a txt file in the java project folder.
		// Then we need to import the file class and create an object of the file. 
		// To use this, we need to handle the fileNotFound exception. This means, if the file is not found, what is the program going to do? 
		
		// To do this correctly we use the try-catch block. It tries the following code, but when an error occurs, it runs the catch block. 
		// You can choose what code is going to run, instead of displaying a user unfriendly error.
		
		try {
			
			File file = new File("myTextFile.txt");
			Scanner inputFromFile = new Scanner(file);
			
			System.out.println("Text from the file: ");
			
			while (inputFromFile.hasNext()) {
				String line = inputFromFile.nextLine();
				System.out.println(line);
				
			}
			
			inputFromFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("The file cannot be found...");
		}
		
		System.out.println("----------------------------------------------------------");
		
		// Its also possible to create methods which throw exceptions (see the method below).
		// If I code the throws Exception in the signature, it means the method might throw an exception and we
		// cannot invoke this method without handling it. 
		
		try {
			System.out.println(getNumberMinus10(11));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("----------------------------------------------------------");
		
		try {
			System.out.println(getNumberMinus10(9));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("----------------------------------------------------------");
	}

		
	public static int getNumberMinus10(int number) throws Exception {
		
		if (number < 10) {
			throw new Exception("The number entered is smaller than 10.");
		}
		
		return number - 10;
	}
	
}
