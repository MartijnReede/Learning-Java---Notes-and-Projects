package com.jobready.implementBinarySearchTree;

public class Application {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10, "Ten");
		tree.insert(3, "Three");
		tree.insert(2, "Two");
		tree.insert(11, "Eleven");
		tree.insert(20, "Twenty");
		tree.insert(9, "Nine");
		
		tree.remove(2);
		System.out.println(tree.findMin());
		System.out.println(tree.findMax());
		

	}

}
