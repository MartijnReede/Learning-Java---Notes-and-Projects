
import java.util.Arrays;
import java.util.List;

public class MainWithoutLambda {
	
	public static void main(String[] args) {
		
		List<Cars> cars = Arrays.asList(
				new Cars("Honda", "Accord", "Red", 22300),
				new Cars("Honda", "Civic", "Blue", 17700),
				new Cars("Toyota", "Land Cruiser", "White", 48500),
				new Cars("Toyota", "Corolla", "Black", 16200),
				new Cars("Toyota", "Camry", "Blue", 24000),
				new Cars("Nissan", "Sentra", "White", 17300),
				new Cars("Mitsubishi", "Lancer", "White", 20000),
				new Cars("Jeep", "Wrangler", "Red", 24500)
				);
		
		printCarsOnPrice(cars, 20000, 25000);
		printCarsOnColor(cars, "White");
		
		//If we want to create more possibilities to print certain cars, we'd have to write more methods.
		//This results in a lot of code. What if we could give the user only one method, and that's enough...
		//We can do this using lambdas. 
		
		//********* HOW TO DO THIS?? *********
		//There are certain things about these methods that are similar.
		//		1. They all take the list of cars as an argument.
		//		2. Cars are printed when they have certain conditions. 
	}

	//Two methods:
		// Method 1: Is going to print cars between a certain price range. 
		// Method 2: Is going to print cars that match a certain color.
	
	public static void printCarsOnPrice(List<Cars> cars, int bottomPrice, int maxPrice) {
		for (Cars car : cars) {
			if (car.getPrice() >= bottomPrice && car.getPrice() <= maxPrice)
				car.printCar();
		} 
	}
	
	public static void printCarsOnColor(List<Cars> cars, String color) {
		for (Cars car : cars) {
			if (car.getColor().equals(color)) {
				car.printCar();
			}
		}
	}
}

