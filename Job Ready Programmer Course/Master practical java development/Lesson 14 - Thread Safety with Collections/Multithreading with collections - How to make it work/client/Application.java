package com.jobready.client;

import com.jobready.inventory.ProductManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		//To make two threads use the same List at the same time, we have to use a thread-safe collection. 
		//In the ProductManager class I've created a List<Product> soldProducts = new CopyOnWriteArrayList<Product>();
		//The import for this is java.util.concurrent.listtype...
		
		//This collection works the same as a normal collection, but it has thread safety build in. 
		
		ProductManager manager = new ProductManager();
		
		Thread task1 = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.addProductsToList();	
			}
		});
		
		Thread task2 = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.displaySoldProducts();	
			}
		});
		
		task1.start();
		Thread.sleep(2000);
		task2.start();
		
		//Now both threads can work on the same list at the same time. There is only one important thing not to forget:
		//task2 will only print the products that are added to the list before the display-thread kicks off. 
		
		//Products that are added while or after the products are displayed, will not be displayed.
		//So in short: the displaySoldProducts method will take the list as it is when started. 
	}

}
