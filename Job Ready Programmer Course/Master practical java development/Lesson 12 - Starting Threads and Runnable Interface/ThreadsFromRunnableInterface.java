public class ThreadsFromRunnableInterface {

	public static void main(String[] args) {
		
		//In this program I want to show that we don't need to extends the Thread class to start
		//a new thread. We can also just implement the runnable interface which holds the run() method. 
		
		Tasks task1 = new Tasks();
		// task1.start() does not work now since task1 is not a thread.
		
		// To run the task in the Tasks class, I need to create a Thread first. 
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		
		//Also, there is also one other way to start a thread:
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i ++) {
					System.out.println("This is from thread 2");
				}
			}
		});
		
		thread2.start();
	}
}

class Tasks implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Number is: " + i + ".");
		}
		
	}
	
}