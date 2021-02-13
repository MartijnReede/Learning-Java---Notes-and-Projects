import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main6 {

	public static void main(String[] args) {
		
		// Try with resources --> A newer way to handle exceptions
		
		// If you use a Connection, Statement, Scanner, FileReader etc class... this class needs to be closed by keyboard.close() for example. 
		// Closing resources can give all sorts of Exceptions. Handling multiple resources can result in a lot of code to handle them all. 
		// Try with resources is a solution to this. 
		
		File file = new File("myFile.txt");
		
		try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader);) {
				
			// Code that uses the fileReader and BufferedReader
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		// This below is not necessary anymore since the classes will be closed automatically. 
		// 
		// finally {
		//	fileReader.close();
		//	bufferedReader.close();
		//	
		// }
		// 
		// By using this try with resources, the classes are auto-closed. You can also write your own classes that close automatically. 
		
	}
}
