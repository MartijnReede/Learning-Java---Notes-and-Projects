package com.jobready.binarySearchTree;

public class Application {

	public static void main(String[] args) {
		
		//The binary search tree is a data structure which is inspired on the binary search algorithm.
		//The tree inherits the same advantage as the algorithm. 
		
		//Data will be stored in a sorted way. 
		
		//Inserting data in an Array: the downside of doing this is that the algorithm first has to
		//find the particular spot it wants to add it to, and then it has to reposition all the elements
		//behind it. Finding a particular value on the other hand is really fast if we know what the
		//index position is. 
		
		//Inserting data in a LinkedList is much more efficient, since we only have to change some references
		//between nodes. Finding a particular value on the other hand is much slower since we have to traverse
		//the elements to find it. 
		
		//****** WHY USE THE BINARY SEARCH TREE? **********
		//It offers the searching benefit of an ordered array
		//as well as the inserting and deleting benefits of a LinkedList. 
		//This makes it an excellent container for searching and storing data. It's the most popular also. 
		
		//https://en.wikipedia.org/wiki/Binary_search_tree#/media/File:Binary_search_tree.svg
		//Click the link above to see how to the tree is structured. All the circles represent a node. 
		//The node at the top is called the 'root' node. 
		//All the circles below are children of the root node. 
		//Nodes that don't have any children are called 'leaf' nodes.
		
		//The difference between a binary tree or non-binary tree is the amount of children. 
		//Binary means 2. Non-binary trees can have more than 2 children. A binary tree can not have more
		//than 2 children nodes. This means, a BinarySearchTree can never have more than two children per node. 
		
		//Check the link again, when adding a certain value to the BinarySearchTree it looks first to the
		//root node. Then it asks itself: is the value I want to add bigger or smaller? 
		//If bigger, the value will be stored at the right side of the root node, of smaller, it will be stored
		//at  the left side. 
		
		//So what to do with nodes that are equal? These will go to the left. 

	}

}
