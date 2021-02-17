public class MainThread {

	public static void main(String[] args) {
			
		//Below I've written some code to start two new threads:
		System.out.println("Starting thread 1");
		
		Task2 task1 = new Task2();
		task1.setThreadName("This is thread 1...");
		task1.start();
		
		System.out.println("Starting thread 2");
		Task2 task2 = new Task2();
		task2.setThreadName("This is thread 2...");
		task2.start();
		
		
		//Both threads will execute very fast. To look better on what is happening, I can use the sleep()
		//method from the Thread class. This method needs to be written in a try/catch block.
		
		//To find out what thread is printing what number, we can invoke the getName method.
		//The syntax for this is Thread.currentThread().getName(); The name of the Thread is an Integer by default. 
		//To set the name of the Thread, I need to set the name with Thread.currentThread().setName(String name);
		// I have to do this within the Task2 class. 
		
		//The thread class implements the Runnable interface. We can't implement this interface to the Task2 class
		//for multi-threading to work. Because then Task2 isn't a Thread.
		
		//Check the other Java file that explains how to do this!
	}	
}

class Task2 extends Thread{

	String threadName = "";
	
	public void setThreadName(String name) {
		this.threadName = name;
	}
	
	public void run() {
		
		Thread.currentThread().setName(threadName);
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
			
			try {
				// 100 = Milliseconds....
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

