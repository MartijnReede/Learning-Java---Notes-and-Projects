import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainApplication {

	public static void main(String[] args) {
		
		//A better way to handle the producer-consumer problem, is with BlockingQueue.
		
		//With the wait() and notify() methods, we had to code all the logic for it. 
		//(capacity, queue of tasks, etc..). It was not thread safe, we had to make it thread safe with a  lot of code.
		
		//The ArrayBlockingQueue is from the concurrent package, and we don't have to write the wait() and notify() methods. 
		
		//For this program we're going to use the BlockingQueue. We have to insert an integer which sets the capacity.
		BlockingQueue<Integer> questionList = new ArrayBlockingQueue<Integer>(5);
		
		// ***************IMPORTANT*****************
		//For the ArrayBlockingQueue we use the put() and take() method. Add and remove are not thread safe!! 
		
		Thread t1 = new Thread(new Producer(questionList));
		Thread t2 = new Thread(new Consumer(questionList));
		
		t1.start();
		t2.start();
	}

}
