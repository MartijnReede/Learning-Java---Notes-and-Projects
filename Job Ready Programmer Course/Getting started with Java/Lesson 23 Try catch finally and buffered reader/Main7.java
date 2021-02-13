import java.io.BufferedReader; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main7 {

static BufferedReader buffered;
	
	public static void main(String[] args) {
		
		//THIS IS AN OUTDATED FILE READING METHOD, BUT IT IS GOOD TO PRACTICE MORE WITH EXCEPTION HANDLING.
		
		File file = new File("myFile.txt");
		
		//Its also possible to read a file with the FileReader and BufferedReader class.
		
		try {
			FileReader reader = new FileReader(file); 	//Reads everything in characters
			buffered = new BufferedReader(reader);   	//Has the ability to read line by line. 
			
			//This code (line = buffered.readLine()) also needs to be able to catch an exception. 
			//We can do this easily by adding another catch clause to the try / catch block.
			
			String line = buffered.readLine();
			System.out.println(line);
			
			while (line!=null) {
				line = buffered.readLine();
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found...");
		} catch (IOException e) {
			System.out.println("Problem with reading the file:" + file.getName());
		} finally {
			// The finally block will always run! Also if there is an exception.
			try {
				buffered.close();
			} catch (IOException e) {
				System.out.println("Unable to close file." + file.getName());
			} catch (Exception e) {
				System.out.println("Buffered reader probably never opened.");
			}
		}
		
		
		
	}

}
