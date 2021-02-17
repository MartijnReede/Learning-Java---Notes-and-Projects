
public class MainApplication {

	public static void main(String[] args) {
		
		//Generics are really useful in inheritance / polymorphism situations.
		//In this example I will create different types of Workers with a work() method
		//and a WorkManager class that put all the workers to work. 
		
		//Since all the different kind of workers do different kind of work, I want the output
		//of each different worker to be different. 
		
		//Creating all the workers:
		Miner miner = new Miner("Harry", 25, 1500);
		Lumberjack lumberjack = new Lumberjack("Chuck", 38, 1200);
		Fisher fisher = new Fisher("Captain Sparrow", 67, 3000);
		
		//Creating a work manager which can put all the workers to work:
		WorkManager manager = new WorkManager();
		manager.makeWorkerWork(miner);
		System.out.println("--");
		manager.makeWorkerWork(lumberjack);
		System.out.println("--");
		manager.makeWorkerWork(fisher);
		System.out.println("--");
		
		//This above works fine, but eclipse still gives a warning that we didn't specify what type of worker is going to be used. 
		//To prevent this, I could specify the generic type while instantiating the workManager.
		
		WorkManager<Miner> minerManager = new WorkManager<Miner>();
		minerManager.makeWorkerWork(miner);
	}

}
