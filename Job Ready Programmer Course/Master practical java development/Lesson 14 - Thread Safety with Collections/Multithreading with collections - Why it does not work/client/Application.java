package com.jobready.client;

import com.jobready.inventory.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		//In this program, I wrote two methods that access the same List at the same time. 
		
		InventoryManager manager = new InventoryManager();
		
		Thread inventoryTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.populateSoldProducts();	
			}	
		});
	
		Thread displayTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.displaySoldProducts();	
			}	
		});
		
		//To make sure there is something in the list before displaying anything from the same list,
		//I make the thread sleep for two seconds before starting the display method. 
		
		inventoryTask.start();
		Thread.sleep(2000);
		displayTask.start();	
		
		//We will get an error now, since the List cannot be accessed by the display method while
		//being modified by the populateSoldProducts method. 
		inventoryTask.join();
		manager.emptySoldProductsList();
		
		//To make sure that a thread finished before we start another, we can use the join() method.
		//But, if we use it, there is no multi-threading anymore, since the code will run method after method.
		
		Thread inventoryTask2 = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.populateSoldProducts();
			}
			
		});
		
		Thread displayTask2 = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.displaySoldProducts();
			}
		});
	
		
		//Now starting both threads will work since the program will wait with starting displayTask2
		//until inventoryTask2 is finished. 
		inventoryTask2.start();
		inventoryTask2.join();
		displayTask2.start();
	}

}
