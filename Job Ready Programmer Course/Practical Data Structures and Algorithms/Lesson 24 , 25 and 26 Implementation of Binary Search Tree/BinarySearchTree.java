package com.jobready.implementBinarySearchTree;

public class BinarySearchTree {

	private Node root;		//The root at the top of the tree.
	
	public void insert(int key, String value) {
		
		Node newNode = new Node(key, value);
		
		if (root == null) {    // If we don't have a root node yet.
			root = newNode;
		} else {
			
			Node current = root;
			Node parent;
			
			while(true) {
				parent = current;
				
				if (key <= current.key) {
					current = current.leftChild;
						if (current == null) {			// The parent is the leaf node.
							parent.leftChild = newNode;
							return;
						}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
						}
				}
			}
		}	
	}
	
	public Node findMin(){
		
		if (root == null) {
			System.out.println("Binary Search Tree is empty...");
			return null;
		} else {
			Node current = root;
			Node last = null;
			
			while (current != null) {
				last = current;
				current = current.leftChild;
			}
			return last;
		}	
	}
	
	public Node findMax() {
		if (root == null) {
			System.out.println("Binary Search Tree is empty...");
			return null;
		} else {
			Node current = root;
			Node last = null;
			
			while (current != null) {
				last = current;
				current = current.rightChild;
			}
			return last;
		}
	}
	
	//Deleting a leaf node is simple. We change the reference of the parent to null and since the node
	//is not connected to anything anymore, the garbage collector will get rid of it. 
	
	//When deleting a node from the middle of the three, things get more complicated. 
	//If the particular node has only one child. The child node will take over the place of the one that is
	//deleted. 
	
	//What do we do if the node has two children? Things get tricky.... The node that will replace the one that
	//is going to be deleted, is the smallest node, from the set of node that is larger than the node that is
	//going to be deleted. 

	public boolean remove(int key) {
		if (root == null) {
			System.out.println("Binary Search Tree is empty....");
			return false;
		} else {
			
			Node current = root;
			Node parent = root; //This will be the parent of the current node. But for now we both assign them to the root node.
			
			boolean isLeftChild = false; //This is going to determine if what we are going to delete is a left or right child. 
			
			//Searching to find the node with the key to delete.
			while (current.key != key) {
				parent = current;
				if (key < current.key) {
					isLeftChild = true;
					current = current.leftChild;
				} else {
					current = current.rightChild;
					isLeftChild = false;
					
				}
				
				//If we can't find the keyvalue:
				if (current == null) {
					System.out.println("Value does not exist in the tree...");
					return false;
				}
			}
			
			//From here, we found the node to delete.
			Node nodeToDelete = current; //This is the same as current, but nodeToDelete is easier to read.
			
			//Check if the node is a leaf node. 
			if (nodeToDelete.rightChild == null && nodeToDelete.leftChild == null) {
				
				//We only need to change the parents reference to this node to null.
				if (nodeToDelete == root) {
					root = null; //because it is a leaf node, we don't have to do anything else now. The tree will be empty after this.
				} else if (isLeftChild) {
					parent.leftChild = null;
				} else {
					parent.rightChild = null;
				}
			
			//Check if the node has one child on the left.
			} else if (nodeToDelete.rightChild == null) {
				
				if (nodeToDelete == root) {
					root = nodeToDelete.leftChild;
				} else if (isLeftChild) {
					parent.leftChild = nodeToDelete.leftChild;
				} else {
					parent.rightChild = nodeToDelete.rightChild;
				}
				
			//Check if the node has only one child on the right.	
			} else if (nodeToDelete.leftChild == null) {
				
				if (nodeToDelete == root) {
					root = nodeToDelete.rightChild;
				} else if (isLeftChild) {
					parent.leftChild = nodeToDelete.rightChild;
				} else {
					parent.rightChild = nodeToDelete.rightChild;
				}
			
			//Check if the node has two children (tricky one).
			} else {
				
				Node successor = getSuccessor(nodeToDelete);     //Successor = the smallest node on the big side of the tree 
																 //from the node that we want to delete.
					
				//connect the parent of the nodeToDelete to successor instead.
				if (nodeToDelete == root) {
					root = successor;
				} else if (isLeftChild) {
					parent.leftChild = successor;
				} else {
					parent.rightChild = successor;
				}
				
				successor.leftChild = nodeToDelete.leftChild; //This line is actually replacing the nodes.
			}
			return true;
		}		
	}

	private Node getSuccessor(Node nodeToDelete) {
		Node successorParent = nodeToDelete;
		Node successor = nodeToDelete;
		
		Node current = nodeToDelete.rightChild; //First we go one step to the right.
		while (current != null) {	//Start going left until node doesn't have a left cild. 
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		//If the successor is not a right child.
		if (successor != nodeToDelete.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = nodeToDelete.rightChild;
		}
		return successor;
	}

}

