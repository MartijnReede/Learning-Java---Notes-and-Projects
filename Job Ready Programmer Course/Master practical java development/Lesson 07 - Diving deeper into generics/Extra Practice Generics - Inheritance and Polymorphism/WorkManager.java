public class WorkManager<E extends Worker> {
	
	E worker;
		
	public void makeWorkerWork(E worker) {
		worker.work();
	}
	
}
