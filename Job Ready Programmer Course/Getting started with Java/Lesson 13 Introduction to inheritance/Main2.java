
public class Main2 {

	public static void main(String[] args) {
		
		// Inheritance: one class inherits behavior from another class. 
		// The whole point of inheritance and object oriented programming is to organize your code better!
		
		// For example:
		// - Parent class = Animal. 	(Also named as super-class)
		// - Child class = bird.		(Also name as sub-class)
		// - Child class = rabbit.		(Also name as sub-class)
		// - Child class = dog.			(Also name as sub-class)
		
		// All the child classes could have similar behavior like: walk, sleep, eat, etc. 
		
		Animal bird = new Bird("Harry", 3, 6);
		bird.describeAnimal();
		bird.walk();
		System.out.println(bird.age);
		
		// If the super class has a specific constructor and you extend a child class with it. The child-class needs to take over the same constructor. 
		// Below the constructor in the child-class, the keyword super is shown. This means that the constructor of the super class is used. 
		
		// Without defining all the eat, sleep and walk methods for each specific animal, we can still use them since they all inherit the super class Animal. 
	
		// ALL the animals can only have the methods that are designed in the parent class. If I would write a fly() method in the bird class, this doesn't work.
		// If I would create a bird instead of an animal, it would work to invoke a fly method, since the fly method is only used for the bird itself. 
		
		// Example:
		
		Animal bird2 = new Bird("Gloria", 2, 3);
		// bird2.fly(); gives an error!
		
		Bird bird3 = new Bird("Henkie", 5, 2);
		bird3.fly(); //This works!
		bird3.describeAnimal(); // Still, we can use the methods that are described in the parent class. 
	
		// Why use inheritance? Well, if we didn't use it, we'd have to copy all the methods from the Animal class to each individual child-class. This 
		// means there would be a lot of duplicate code. 
		
		Animal dog = new Dog("Mazzel", 12, 20);
		dog.describeAnimal();
	}
	
	

}
