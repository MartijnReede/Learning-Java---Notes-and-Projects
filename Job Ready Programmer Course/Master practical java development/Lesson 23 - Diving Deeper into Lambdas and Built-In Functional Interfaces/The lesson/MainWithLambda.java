import java.util.Arrays;
import java.util.List;

public class MainWithLambda {

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
		
		//As being said in the MainWithoutLambdas class, cars are printed if they meet a certain condition. 
		//When using lambda's we only have to write one method.
		//Now we can fill in ourselves what conditions the car needs to have to meet the conditions.
		
		//****** ANNONYMOUS CLASS DEFINITION ****************
		System.out.println("Printing white cars.");
		printCars(cars, new CarCondition() {

			@Override
			public boolean checkCondition(Cars c) {
				if (c.getColor().equals("White")) {
					return true;
				} else {
					return false;
				}
			}
		});
		
		//********* DOING THE SAME AS ABOVE BUT WITH A LAMBDA ***************
		System.out.println("\n--\n");
		System.out.println("Printing cars between a certain pricerange.");
		printCars(cars, (c) -> c.getPrice() >= 18000 && c.getPrice() <= 25000);
		System.out.println("\n--\n");
		System.out.println("Printing white cars....");
		printCars(cars, (c) -> c.getColor().equals("White"));
	}
	
	public static void printCars(List<Cars> cars, CarCondition carCondition) {
		for (Cars car : cars) {
			if (carCondition.checkCondition(car)){
				car.printCar();
			}
		}
	}
}