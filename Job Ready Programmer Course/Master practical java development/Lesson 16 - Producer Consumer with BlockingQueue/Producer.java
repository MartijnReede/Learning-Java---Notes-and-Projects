import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Integer> questionList;
	int questionNo;
	
	public Producer(BlockingQueue<Integer> questionList) {
		this.questionList = questionList;
	}
	//The incrementing of the questionNo is not thread safe, but in this case it doesn't matter.
	//The producer class is the only class using the questionNo variable. If we had multiple producers,
	//This could be a problem. Since this thread can be paused while it is not finished incrementing. 
	//This could result in duplicate question numbers. 
	
	//Still I put it in a synchronized block since I want to print out the addition of the question. 
	//I don't want the thread to pause before printing out that it added a question. 
	
	@Override
	public void run() {
		
		while (true) {
			
			synchronized(this) {
				try {
					int question = questionNo++;
					questionList.put(question);
					System.out.println("Got a new question: " + question);
					Thread.sleep(200);
				} catch (InterruptedException e) {
				
				}
			}
		}
	}
}
