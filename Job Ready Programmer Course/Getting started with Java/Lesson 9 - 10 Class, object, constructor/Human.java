public class Human {
	
	// This class is the blueprint for our software-humans objects.
	
	// Fields: 
	String name;
	int age;
	int heigthInCm;
	String eyeColor;
	
	// The constructor creates an instance of this human-class. 
	//Constructor:
	public Human() {
		
	}
	
	// Constructor with arguments to assign the fields right away:
	public Human(String name, int age, int heigthInCm, String eyeColor) {
		this.name = name;
		this.age = age;
		this.heigthInCm = heigthInCm;
		this.eyeColor = eyeColor;
	}
	
	// We want the humans to have certain behavior:
	public void speak() {
		System.out.println("Hello my name is: " + name + ".");
		System.out.println("I am " + heigthInCm + " cm tall.");
		System.out.println("I am " + age + " years old.");
		System.out.println("My eyecolor is: " + eyeColor + ".");
	}
	
	public void eat() {
		System.out.println("Eating....");
	}
	
	public void walk() {
		System.out.println("Walking....");
	}
	
	public void work() {
		System.out.println("Working....");
	}
}
