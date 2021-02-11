public class Main1 {

	public static void main(String[] args) {
		
		// Example with "human" objects.
		// The human class is the blueprint of our software-humans. With the constructor method from the Human class, we create human objects.
		
		
		// Below we've created a human object named tom. 
		Human tom = new Human("Tom", 25, 165, "blue");
		tom.speak();
		
		System.out.println();
		
		// It's also possible to assign the fields in this way:
		Human joe = new Human();
		joe.name = "Joe";
		joe.age = 48;
		joe.heigthInCm = 135;
		joe.eyeColor = "brown";
		joe.speak();
		
		// Tom and Joe are completely different objects. Although they have the same behavior.
		// Tom and Joe are both instance or object variables.
		
		// When objects have the same values, they are still not the same. They are still two completely different objects. 
	}

}
