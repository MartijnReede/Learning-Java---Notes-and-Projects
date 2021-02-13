import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {

	public static void main(String[] args) {
		
		//******** A COLLECTION *********
		
		// A collections is a group of things put together, a collection of items. 
		
		//******** AN ARRAYLIST **********
		
		// The size of a normal array is not dynamic. The number of slots cannot be changed. 
		// This is why the collection framework was introduced. 
		
		// The most popular collection used is an ArrayList. 
		ArrayList words = new ArrayList();
		
		//You can put things into it:
		words.add("Hello");
		words.add("Bye");
		words.add(10);
		words.add(9);
		words.add(8.5);
		
		//You can also remove things out of it.
		words.remove(1); //This removes the word on index nr 1. 
		
		//As long as we are not declaring the data type of the items in the array, I can put everything in it.
		//But, to get items out of it and use them, I have to specify the data type, because the array is returning objects. 
		
		String item1 = (String)words.get(0);
		int item2 = (Integer)words.get(2);
		
		// A much better way to store items into an ArrayList, is to specify the type of the items.
		// This means, only items of the specified type can be stored into the ArrayList. This is where generics come in.
		// GENERICS  --> <type> Is the data type between <>. Now the ArrayList stores and returns only Strings. 
		
		ArrayList<String> betterArrayWithStrings = new ArrayList<String>();
		betterArrayWithStrings.add("Hello");
		betterArrayWithStrings.add("10");
		betterArrayWithStrings.add("false");
		
		// It is not possible to use primitive data types. We have to use the wrapper classes between the <>.
	
		// ******* LINKEDLIST *********
		
		LinkedList<Integer> multipleIntegers = new LinkedList<Integer>();
		multipleIntegers.add(10);
		multipleIntegers.add(12);
		multipleIntegers.add(15);
		multipleIntegers.add(19);
		
		// The difference between a LinkedList and an ArrayList is a resizable array, and a LinkedList is
		// a bunch of nodes linked together. The idea is for both the same. 
		
		//******** FOR-EACH LOOP *********
		
		// Iterating through a LinkedList or an ArrayList can be done with a for-each loop:
		
		for (int number : multipleIntegers) {
			System.out.println(number);
		}
		
		//********** BEHIND THE SCENES **********
		
		// By default, an ArrayList holds 10 available slots. When a value is entered for the 11th slot, a new array will be created with size 20.
		// All the data from the first array will be copied into the new array. When the 21th item is passed in, a new array of 40 slots will be created. 
		// It continues to double its size all the time if more and more items are inserted. 
		// An ArrayList is faster for retrieving data. You just give the index position and it retrieves the data right away from the right spot. 
		
		// A LinkedList is different. It has sort of a train of boxes. When more data is added, a new box is added to the train.
		// This makes manipulating data in the LinkedList way more faster than in a ArrayList. To retrieve data, it has to
		// traverse the complete LinkedList to find the particular data. 

	}

}
