
public class Main3 {

	public static void main(String[] args) {
		// Interfaces and abstract classes are ways to structure the code. 
		
		// An interface is basically a contract. A class that implements an interface has to implement all the methods from the interface. 
		// Interfaces should be named after the functionality they are trying to abstract. 
		// An interface only has abstract methods. 
		
		// The chicken and eagle class are both birds, but only one of them can fly. I can make an interface and implement it to the bird that can fly. 
		
		Chicken chick = new Chicken("Ben");
		//chick.fly() is not visible for chickens. 
		
		Eagle eddy = new Eagle("Eddy the eagle");
		eddy.fly();
		
		
		
		// Method overriding:
		// I've made a Horse class which extends the animal class. The horse class inherits the move() method, but since a horse moves in a specific way
		// I can override the move() method. 
		// The output of both methods is different although animal and horse are both belonging to the Animals super class. 
		
		Animals animal = new Animals("Harry");
		animal.move();
		
		Animals horse = new Horse("Chuck");
		horse.move();
		
		// A class can only extend to 1 other class. 
		// A class can implement multiple interfaces!
	
	}

}
