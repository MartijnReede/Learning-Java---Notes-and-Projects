
public class main6 {

	public static void main(String[] args) {
		
		// The toString() method is a way to print out objects easily. 
		
		Person martijn = new Person("Martijn", "Tweede Oosterparkstraat 121-D", 30);
		
		// I've created an object of the Person class. 
		// In the Person class, I have overridden the toString method by: right-click --> source --> generate toString.
		// Now I can print out the martijn object easy by:
		
		System.out.println(martijn.toString());	
		
		// If I instantiate another person with exactly the same values, these are not the same object.
		Person martijn2 = new Person("Martijn", "Tweede Oosterparkstraat 121-D", 30);
		System.out.println(martijn.equals(martijn2)); // this is false. 
		
		// Although the objects have the same values, they are still two different objects. 
	
		// Now i will create another class called Cats. In this class I will instantiate two objects with the same values. 
		// By overriding the equals method in the Cats class, I can use the equals method to check if both objects are
		// equal, based on their values. 
		
		Cats tiger = new Cats("Tiger", "Orange", 3);
		Cats tiger2 = new Cats("Tiger", "Orange", 3);
		
		System.out.println(tiger.equals(tiger2)); // Now this is going to be true!
		
		// IMPORTANT: If I didn't override the equals method, the equals method checks if the objects are equal based
		// on their memory location. Now they are checked on their values. 
	}
}
