public class main2createExceptions {
	
	public static void main(String[] args) {
	
		// It is possible to create your own exceptions. I've made this exception in the same package as the main classes.
		// It is better to create another package with Exceptions for this.
		// See the myOwnException class for instructions...
		
		try {
			getNumberMinus20(19);
		} catch (myOwnException e) {
			System.out.println(e);
		}	
	}
	
	public static int getNumberMinus20(int number) throws myOwnException {
		
		if (number < 20) {
			throw new myOwnException("Input number is smaller than 20.");
		}
		return number - 20;
		
	}
}
