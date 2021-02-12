
public class MainClass {

	public static void main(String[] args) {
		
		//With the debugger, we can check our code and variables line by line. 
		//To activate it: choose a starting point by clicking on the numbered bar to the left. This will show a blue dot.
		//Then go to run, debug as --> java application. 
		//To see all the variables and their values, go to window --> show view --> variables. 
		//The green bar is not executed yet. If you click step-over, it is executed. 
		
		//Nested for loop:
		//This prints every idx count 10 times. 
		
		for (int idx = 0; idx < 100; idx++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("The value of idx was " + idx + "------" + j);
			}	
		}
		
		// Loops in loops in loops in loops are very slow. Don't use it if it is not necessary. 
	}
}
