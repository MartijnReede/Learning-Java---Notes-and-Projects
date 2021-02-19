public class MessageProcessor implements Runnable{
	
	private int message;
	
	public MessageProcessor(int message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "[RECIEVED] Message: " + message);
		respondToMessage(); //make the thread sleep to simulate doing some work. 
		System.out.println(Thread.currentThread().getName() + "[DONE] Answered message: " + message);	
	}
	
	
	public void respondToMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Unable to process message...");
		}
	}
}
