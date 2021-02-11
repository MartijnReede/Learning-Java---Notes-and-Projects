
public class VariablesAndDataTypesContinued {

	public static void main(String[] args) {
		
		// The int datatype is 32bit and has a maximum amount. 
		// If I add 1 more 0 it gets an error.
		int x = 1000000000;
		 
		// The long datatype: It costs a lot of memory. The computer isn't sure if this is an int or a long,
		// That's why we need to put the capital L at the end.
		// Even if you don't use a big long number, the computer is going to reserve the memory for it. 
		long bigNumber = 1000000000000000000L;
		
		// short has a maximum of 32767.
		short bigNumber2 = 32767;
		
		// Maximum of 127. 
		byte reallySmallNumber = 127;
		
		//To store decimal numbers
		double decimalVariable = 390.10;
		
		// boolean true or false.
		boolean decision = false;
		
		//char only stores 1 character. 
		char letter = 'L';
		
	}

}
