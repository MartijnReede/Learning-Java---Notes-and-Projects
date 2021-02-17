package com.jobready.inventory;

public class Product {

	int id;
	String productName;
	
	public Product(int id, String productName) {
		super();
		this.id = id;
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + "]";
	}
	
	
}
