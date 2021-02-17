package com.jobready.inventory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ProductManager {

	private List<Product> soldProducts = new CopyOnWriteArrayList<Product>();
	
	public void addProductsToList() {
		
		for (int i = 0; i < 400; i++) {
			Product p = new Product(i, "Product: " + i);
			soldProducts.add(p);
			System.out.println("ADDED: " + p);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void displaySoldProducts() {
		for (Product p : soldProducts) {
			System.out.println("PRODUCT SOLD: " + p);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
