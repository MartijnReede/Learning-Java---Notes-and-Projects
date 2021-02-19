import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> questionList;
		
	public Consumer(BlockingQueue<Integer> queestionList) {
		this.questionList = queestionList;
	}

	
	// For this run method, we use the questionList.take() method. Which returns the
	// value of the head of the queue, but it also removes it. 
	
	@Override
	public void run() {
		
		while (true) {
			try {
				System.out.println("ANSWERED: " + questionList.take());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
