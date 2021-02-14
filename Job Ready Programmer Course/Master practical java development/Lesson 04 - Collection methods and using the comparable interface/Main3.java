import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main3 {

	public static void main(String[] args) {
		
		// ********* MERGING LISTS (ADDALL) **********
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		
		// To merge these two lists together, I can use the addAll method. 
		
		list1.addAll(newList);
		System.out.println("Lists are merged: " + list1);
		System.out.println("\n--\n");
		
		// *************** REMOVING VALUES (REMOVE ALL) ***********
	
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(12);
		list2.add(43);
		list2.add(15);
		list2.add(67);
		list2.add(43);
		list2.add(43);
		list2.add(43);
		
		ArrayList<Integer> newList2 = new ArrayList<Integer>();
		newList2.add(43);
		newList2.add(12);
		newList2.add(67);
		
		
		list2.removeAll(newList2);
		System.out.println("The values of newList2 are removed from list2: " + list2);
		System.out.println("\n--\n");
		
		// What removeAll does, is: It checks if list2 contains numbers that are in newList2. If this is the case
		// It will remove those numbers from the list, even duplicates (number 43 in list2 for example).
		
		// *************** DELETE ALL DATA FROM THE LIST *******************
		
		newList.clear();
		System.out.println("All values are removed with the clear() method: " + newList);
		System.out.println("\n--\n");
		
		// *************** SEARCH FOR A PARTICULAR VALUE *******************
		
		System.out.println("With the contains method I check if newList2 contains the number 43: " + newList2.contains(43));
		System.out.println("\n--\n");
		
		// **************** CHECK IF A LIST IS EMPTY OR NOT *****************
		
		System.out.println("With the isEmpty() method I can check if newList2 is empty or not: " + newList2.isEmpty());
		System.out.println("\n--\n");
		
		
		// *************** REMOVE EVERY VALUE EXCEPT SOME VALUES ************
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);
		
		ArrayList<Integer> newList3 = new ArrayList<Integer>();
		newList3.add(1);
		newList3.add(2);
		newList3.add(3);
		
		// This method is going to remove all the in list3 except the values of newList3.
		list3.retainAll(newList3);
		
		System.out.println(list3);
		System.out.println("\n--\n");
		
		// **************** CONVERT SETS OR LISTS INTO OTHER LIST/SET-TYPES ********************
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(38);
		set1.add(1);
		
		ArrayList<Integer> convertedHashSet = new ArrayList<Integer>(set1);
		convertedHashSet.add(2);
		convertedHashSet.add(5);
		convertedHashSet.add(3);
		convertedHashSet.add(1);
		
		System.out.println(convertedHashSet);
		System.out.println("\n--\n");
		
		// **************** SORTING ********************
		
		// The sort() method only accepts a List, not a Set. To sort a Set, we can convert it to an ArrayList and then sort it. 
		
		Collections.sort(convertedHashSet);
		System.out.println(convertedHashSet);
		System.out.println("\n--\n");
		
		// ************* SORTING CUSTOM TYPES ***********
		
		Bird sparrow = new Bird("Sparrow", 2);
		Bird eagle = new Bird("Eagle", 15);
		Bird volture = new Bird("Volture", 3);
		Bird pidgeon = new Bird("Pidgeon", 4);
		Bird swallow = new Bird("Swallow", 6);
		
		HashSet<Bird> allBirds = new HashSet<Bird>();
		allBirds.add(sparrow);
		allBirds.add(eagle);
		allBirds.add(volture);
		allBirds.add(pidgeon);
		allBirds.add(swallow);
		
		// We cannot sort a HashSet, so I need to convert this to a List first. 
		
		ArrayList<Bird> birdList = new ArrayList<Bird>(allBirds);
		
		// Collections.sort(birdList); This doesn't work! It doesn't know on what subject it needs to sort the birds. 
		// To compare the birds, we have to implement the comparable interface in the Bird class.
		
		Collections.sort(birdList);
	
		//Now the birds are sorted by their age!
		for (Bird bird : birdList){
			System.out.println(bird);
		}
		
		
		
		
		
	}

}
