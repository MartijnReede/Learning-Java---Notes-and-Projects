package com.jobready.heapDataStructure;

public class HeapDataStructure {

	public static void main(String[] args) {
		
		//The heap data structure looks almost the same as a binary search tree, there are only different
		//rules.
		
		// - A parent node has a maximum of 2 children. 
		// - Data will be added per level. There will be no data in the next depth level until the one before is filled. 
		// - Nodes will be added from left to right.
		// - There are two different heap data structures: a max heap and a min heap.
		// - With a max heap, the biggest number is the root node. All children must be smaller or equal to the parent.
		// - With a min heap, the smallest number is the root node, All children must be bigger or equal to the parent.
		
		
		//Since we have to add data in a certain way it can happen that the number we want to add to for example a max heap
		//Is bigger than the parent. If this happens, we swap the parent with the child until it fits in the max heap without
		//breaking any rules.
		
		//Deleting from a max heap. The value that needs to be deleted will be removed. 
		//Then the value at the bottom of the heap will be placed there instead. 
		//If this value breaks the rules of the heap, nodes will be swapped around until it doesn't
		//break any rules anymore.
		
		//Data in a heap will be stored in an Array or LinkedList. To know what the relations
		//between the data we use arithmetic.
		//To get the left child from a certain node we use the formula 2 * n + 1;
		//To get the right child from a certain node we use the formula 2 * n + 2;
		//n stands for the index position of the parent.
		
		//To find the index position of a parent node, we use the [n-1 / 2] formula and we floor the result. 
	}

}
