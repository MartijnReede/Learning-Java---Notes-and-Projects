import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Application {

	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
		// There are two ways of iterating through this ArrayList:
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		System.out.println("\n*** ANOTHER METHOD ***\n");
		
		for (String animal : animals){
			System.out.println(animal);
		}
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		// We can add vehicles this way:
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
		
		// Or this way:
		Vehicle vehicle1 = new Vehicle("Jeep", "Duster", 15000, true);
		Vehicle vehicle2 = new Vehicle("Mercedes", "Sprinter", 25000, false);
		
		vehicles.add(vehicle1);
		vehicles.add(vehicle2);
		
		// Now we can iterate through the list with vehicle objects.
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.toString());
		}
		
		// If I would create a LinkedList now with also Vehicles:
		List<Vehicle> linkedVehicles = new LinkedList<Vehicle>();
		linkedVehicles.add(vehicle1);
		linkedVehicles.add(vehicle2);
	
		System.out.println("\n******* ANOTHER METHOD *********\n");
		
		// I could pass in both the ArrayList and LinkedList in the method from below.
		// They are both Lists, so this will work fine, even with the animals List.
		iterateThroughLists(vehicles);
		iterateThroughLists(linkedVehicles);
		iterateThroughLists(animals);
		// This means, that the method is made in a generic way. 
		
	}
	
	public static void iterateThroughLists(List someList) {
		for (int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i).toString());
		}
	}
}
