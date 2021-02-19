import java.util.List;

public class Consumer implements Runnable {

	List<Integer>questionList = null;
	
	public Consumer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
	public void answerQuestion() throws InterruptedException {
		synchronized(questionList){
		while (questionList.isEmpty()) {
			System.out.println("No questions to answer....");
			questionList.wait();
		}
		
		synchronized(questionList) {
			Thread.sleep(5000);
			System.out.println("ANSWERED Question: " + questionList.remove(0)); //The remove method also returns the value. The 0 is going to remove the first question added.
			questionList.notify(); //This is going to kick-off the waiting threads. 
		}
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				answerQuestion();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
