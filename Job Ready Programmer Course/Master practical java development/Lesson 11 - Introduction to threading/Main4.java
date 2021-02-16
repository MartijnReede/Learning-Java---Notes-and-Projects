public class Main4 {

	public static void main(String[] args) {
		
		// Until now, we've only created programs that have a single thread. This thread is called the main thread.
		// With only one thread, instructions (lines of code that I wrote) were only executed one by one. 
		// This is called single threaded executing. 
		
		// It is also possible to write multiple threaded programs. 
		// For example, your browser can download files, and while this is done, you can still do other things with it. 
		// So, we have one thread is responsible for downloading and one other thread is responsible for handling your Internet surfing instructions. 
		// This means, multiple lines of codes are running at the same time. 
		
		
		// The code below starts a new thread.
		Task task = new Task();
		task.start(); 
		
		// It is not "legal" to start a thread again. To repeat the code, we have to create a new instance first!
		Task task2 = new Task();
		task2.start();	
		
		// So, to start a new thread: 
		// 1. Make a class
		// 2. Extend it to Thread.
		// 3. Write a run() method.
		// 4. Do NOT invoke the run() method, but invoke the start method. This will run the run() method. 
		
		// Also good to know: the main thread can end, before the other threads are ended.
	}
}

class Task extends Thread {	
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Number from task: " + i);
		}
	}
}