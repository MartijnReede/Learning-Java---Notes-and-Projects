import java.util.ArrayList;
import java.util.List;

public class ApplicationMain {

	public static void main(String[] args) {
	
		//Both consumer and producer need to be threads. We can see these threads as tasks.
		
		//In this application we are going  to make an example, where people can ask questions on a website and where
		//other people can answer these questions. 
		
		// ****** PRODUCER CLASS ***********
		//Will produce the questions that will be asked on the website. And store them somewhere in a database.
		
		// ****** COMSUMER CLASS ***********
		// Is where the questions need to be answered. 
		
		// ****** IMPORTANT *********
		//Two threads are running. 
		
		//If the wait method is invoked in the producer class the producer thread will wait. 
		//If the notify method is invoked in the producer class, the consumer class will continue. 
		
		//If the wait method in the consumer class is invoked, the consumer thread will wait. 
		//If the notify method in the consumer class is invoked, the producer thread will continue; 
		
		
		List<Integer> questionList = new ArrayList<Integer>();
		
		Thread t1 = new Thread(new Producer(questionList));
		Thread t2 = new Thread(new Consumer(questionList));
		
		t1.start();
		t2.start();
		
		
	}

}
