public class Animal {
	
	String name;
	int age;
	int weightInKg;
	
	public Animal(String name, int age, int weigthInKg) {
		this.name = name;
		this.age = age;
		this.weightInKg = weigthInKg;
	}
	
	public void eat() {
		System.out.println("I'm eating...");
	}
	
	public void sleep() {
		System.out.println("I'm sleeping...");
	}
	
	public void walk() {
		System.out.println("I'm walking...");
	}
	
	public void describeAnimal() {
		System.out.println("Hi I am " + name + ". I am " + age + " years old and I weigh " + weightInKg + " kilograms.");
	}
}
