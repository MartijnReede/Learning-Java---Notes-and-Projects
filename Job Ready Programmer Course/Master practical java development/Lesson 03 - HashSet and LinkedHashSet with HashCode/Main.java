import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		
		// ******** SETS **********
		
		// Are very similar to ArrayLists and LinkedLists.
		// Sets is used to prevent duplicate entries!
		
		// ******** HASHSET *********
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(60);
		numbers.add(2);
		numbers.add(38);
		numbers.add(38);
		numbers.add(60);
		numbers.add(4);
		
		// If I iterate through the HashSet, you can see that only one of each numbers are shown. 
		// So it PREVENTS duplicate entries!
		for (int number : numbers) {
			System.out.println(number);
		}
		
		// As you can see: this HashSet doesn't keep the order of what numbers are added first. This is different from 
		// an ArrayList and LinkedList.
		System.out.println("\n---\n");
		
		// ******** LINKEDHASHSET *********
		
		// If the order needs to be maintained, you can use a LinkedHashSet. This does maintain the order!
		
		LinkedHashSet<String> animals = new LinkedHashSet<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Lion");
		
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		//As you can see, the LinkedHashSet maintains its order. 
		
		System.out.println("\n---\n");
		
		// *********** CUSTOM TYPES **************
		
		// Since two different objects with the same values are NOT the same object, objects with the same
		// values can be added to the HashSet and won't be filtered out as duplicates. 
		
		// To filter them out in a HashSet, the HashCode.Equals method should be overridden in the Animal class. 
		// Now, if I add all the objects like below, the objects with the same values will be filtered out. 
		
		Animal an1 = new Animal("Dog", 4);
		Animal an2 = new Animal("Cat", 5);
		Animal an3 = new Animal("Dog", 4);
		Animal an4 = new Animal("Cat", 5);
		Animal an5 = new Animal("Bird", 3);
		
		HashSet<Animal> animals2 = new HashSet<Animal>();
		
		animals2.add(an1);
		animals2.add(an2);
		animals2.add(an3);
		animals2.add(an4);
		animals2.add(an5);
		
		for (Animal animal : animals2) {
			System.out.println(animal.toString());
		}
		
		// *********** HASHCODE ***********
		
		// HashSets are going by HashCode, not by values. 
		

	}

}

