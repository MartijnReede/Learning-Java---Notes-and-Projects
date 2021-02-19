import java.util.List;

public class Producer implements Runnable {

	//The list will be a shared recourse since both the producer and consumer is going to use it. 
	
	List<Integer> questionList = null;  //We see the numbers stored as questions..
	final int LIMIT = 5;				//Maximum amount of questions.
	private int questionNo;				//Question number.
	
	
	public Producer(List<Integer> questionList) {
		this.questionList = questionList;
	}

	//If this method is run, and the limit of the questionList is reached, it is going to wait().
	//To make it not wait anymore, it has to get a sign. We do this with the notify() method. 
	//wait() and notify() can only run in an synchronized block. 
	
	public void submitQuestion(int questionNo) throws InterruptedException {
		
		synchronized(questionList){
			while (questionList.size() == LIMIT) {
				System.out.println("Questions have piled up... wait for answers.");
				questionList.wait();
			}
		
			synchronized(questionList) {
				System.out.println("New Question: " + questionNo);
				questionList.add(questionNo);
				Thread.sleep(100);
				questionList.notify(); //This is going to kick-off the waiting threads. 
				//This only happen when this complete synchronized block is finished executing.
				//This will only happen when the wait method is invoked in THIS class.
				//This is because the whole method is inside of a synchronized block. 
			}
		}
	}
	
	//The method below is going to produce questions. 
	@Override
	public void run() {
		
		while (true) {
		
			try {
				submitQuestion(questionNo++);
			} catch (InterruptedException e) {
		
			}
		}
	}
}
