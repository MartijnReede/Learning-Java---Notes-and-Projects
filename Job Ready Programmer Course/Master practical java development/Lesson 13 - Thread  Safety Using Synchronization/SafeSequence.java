public class SafeSequence {

	int value = 0;
	
	public synchronized int getNext() {
		//We are using the synchronized keyword, to make sure all the code is run before another thread
		//can take over.
			value = value + 1;
			return value;
		
	}
	
}
