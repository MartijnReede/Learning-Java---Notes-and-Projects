import java.util.HashSet;
import java.util.Set;

public class Main101 {

	public static void main(String[] args) {
	
		// ********** GENERIC CLASSES ***********
		
		// Before going deeper into generics, I've created a class that handles Strings.
		Container container = new Container("Hello", "Bye");
		container.printItems();
		
		// The class container only works with Strings. To make it usable to other types as well, we can change it. 
		// For example, we can create an ObjectContainer class. We are still not using generics. 
		// But, we can use it in a somewhat generic way: 
		
		ObjectContainer OC1 = new ObjectContainer("Hi", "Bye");
		OC1.printItems();
		
		ObjectContainer OC2 = new ObjectContainer(10, 20);
		OC2.printItems();
		
		//As you can see, we can add both Strings and Integers. But, there is a problem....
		//The values are not stored as Strings or Integers, they are stored as objects.
		
		// String hi = OC1.getItem1();
		// int ten = OC2.getItem2();
		// So this won't work!
		
		//To make the container class completely generic, we use generics! 
		GenericContainer<String, Integer> GC1 = new GenericContainer<String, Integer>("Bonjour!", 5);
		
		//Now the compiler knows, that item1 is a String, and item2 is an Integer. 
		String frenchHello = GC1.getItem1();
		int five = GC1.getItem2();
		
		// We can use this for any kind of type: classes, lists, etc. etc.
		System.out.println("\n--\n");
		
		// ************** GENERIC METHODS ***************
		
		// We can also use generics with methods. Below I've created a method which unites two Sets. 
		// To "let the method know" what the <E> means, we put it before we start with writing the name of the method. 
		
		Set<String> AnimalSet1 = new HashSet<String>();
		AnimalSet1.add("Fish");
		AnimalSet1.add("Bird");
		AnimalSet1.add("Lion");
		AnimalSet1.add("Giraffe");
		
		Set<String> AnimalSet2 = new HashSet<String>();
		AnimalSet2.add("Bird");
		AnimalSet2.add("Fish");
		AnimalSet2.add("Snake");
		AnimalSet2.add("Snail");
		AnimalSet2.add("Lion");
		
		Set<String> resultSet = Union(AnimalSet1, AnimalSet2);
		
		for (String animal : resultSet) {
			System.out.println(animal);
		}	
	}

	public static <E> Set<E> Union(Set<E> set1, Set<E> set2) {
		
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		
		return result;
	}
}
