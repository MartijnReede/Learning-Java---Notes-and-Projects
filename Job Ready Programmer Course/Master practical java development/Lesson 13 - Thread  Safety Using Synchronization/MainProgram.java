public class MainProgram {

	public static void main(String[] args) {
		
		//If two threads work on the same data at the same time, things can go wrong. 
		//This program shows how to synchronize threads to prevent problems.
		
		//The code below is going to print out the numbers 1 to 100. 
		
		Sequence sequence = new Sequence();
		/*
		for (int i = 0; i< 100; i++) {
			System.out.println(sequence.getNext());
		}
		
		*/
		
		//The for-loop above, is not going to work with two threads. 
		
		DoSomething worker0 = new DoSomething(sequence);
		worker0.start();
		
		DoSomething worker1 = new DoSomething(sequence);
		worker1.start();
		//The sequence will now count to 200 or a little bit less. A little bit less because sometimes
		//a duplicate number is printed. 
		
		// The processor of a computer can only handle 1 thread at a time. So it runs something from
		// Thread1 and then from thread2, then again from thread1 etc. etc... 
		
		//Without finishing the complete method, the processor can choose to pause the thread, to continue
		//with another thread. This means, incrementing the variable may not have been completed while the.
		//other thread takes over.
		
		//So how do we make this thread safe? We want to make sure that all the code of the method runs,
		//before another thread takes over. 
		
		//Check this class to see how to make the thread safe. 
		SafeSequence safeSequence = new SafeSequence();
		
		DoSomethingSafe worker2 = new DoSomethingSafe(safeSequence);
		worker2.start();
		
		DoSomethingSafe worker3 = new DoSomethingSafe(safeSequence);
		worker3.start();
		
		//Worker 2 and 3 will now count to 200 together. 
	}

}

class DoSomething extends Thread {
	
	Sequence sequence = null;
	
		public DoSomething(Sequence sequence) {
			this.sequence = sequence;
		}
		
	public void run() {
		for (int i = 0; i< 100; i++) {
			System.out.println(sequence.getNext() + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class DoSomethingSafe extends Thread {
	
	SafeSequence safeSequence;
	
	public DoSomethingSafe(SafeSequence safeSequence) {
		this.safeSequence = safeSequence;
	}
	
	public void run() {
		for (int i = 0; i <100; i++) {
			System.out.println(safeSequence.getNext() + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}