package com.jobready.inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
	
	List<Product> soldProductsList = new ArrayList<Product>();
	//List<Product> purchasedProductList = new ArrayList<Product>();
	
	public void populateSoldProducts() {
		
		
		for (int i=0; i< 400; i++) {
			Product p = new Product(i, ("Product: " + i));
			soldProductsList.add(p);
			System.out.println("ADDED: " + p);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void displaySoldProducts() {
		for(Product p : soldProductsList) {
			System.out.println("SOLD PRODUCT: "+ p);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void emptySoldProductsList() {
		soldProductsList.clear();
	}
}
