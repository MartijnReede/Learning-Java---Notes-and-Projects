public class myOwnException extends Exception {
	
	// To create your own Exception, you need to extend the Exception class and refer the message to the super class.
	// With the constructor.
	
	public myOwnException(String message) {
		super(message);
	}
}
