import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainApp {

	public static void main(String[] args) {
		
		//Thread pools are the most practical and useful way to work with threads.
		
		//A thread pool is a container of threads.
		//You are not getting involved by creating the actual threads. 
		
		//The executor service has a size (of threads) which is the pool of threads.
		//This executor service is going to start the threads. We only submit the work that
		//needs to get done. 
		
		//In the MessageProcessor I've created some work to be done. 
		//Below, I've created a new ExecutorService. The Integer at the end represents the amount of threads.
		//We are not saying which thread is going to work on what... The pool takes care of that.
		
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		// ******* IMPORTANT ********
		// Classes that implement the Runnable interface should be seen as a task.
		
		//So below, I've created some tasks and I let the ExecutorService execute them.
		
		MessageProcessor processor1 = new MessageProcessor(1);
		executor.execute(processor1);
		
		MessageProcessor processor2 = new MessageProcessor(2);
		executor.execute(processor2);
		
		MessageProcessor processor3 = new MessageProcessor(3);
		executor.execute(processor3);
		
		MessageProcessor processor4 = new MessageProcessor(4);
		executor.execute(processor4);
		
		//This application will stay running because of the ExecutorService. This is why I have to invoke the shutdown() method. 
		
		executor.shutdown(); //makes the executor reject new tasks (gracefully shuts down service).
		
		//This will print out first, since submitting the tasks is something different from executing them. This means 
		//All the code I will write below, will be executed while the tasks are running. 
		System.out.println("Submitted all tasks");
	
		
		//If I want the program to wait until all tasks are completed by the executor, I can create this while loop. 
		//The program will be stuck in this loop until it is shutdown. Only after that it will continue. 
		while(!executor.isTerminated()) {
		}
		
		// Another method that can be useful: The one below is going to wait 10 seconds before moving on to the next line of code.
		try {
			executor.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
		}
		
		System.out.println("Program shuts down....");
		
		//A variation to the shutdown() method is executor.shutdownNow();
		//This will end the ExecutorService immediately. 
		
	}
	
}
