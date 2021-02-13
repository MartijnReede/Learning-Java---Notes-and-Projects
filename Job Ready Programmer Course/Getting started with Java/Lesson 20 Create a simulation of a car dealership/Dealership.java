public class Dealership {

private static double cashOnBank = 10000;	
private static int soldCars = 0;
private static String name = "Best Cars Dealership";
private static String address = "Dealership Yard";

//Exercise: write a program that simulates a car dealership with employers, customers and vehicles.  

	public static void main(String[] args) {
		
		//This car dealership has 3 vehicles: 
		Vehicle vehicle1 = new Vehicle("Mercedes Sprinter", "Euro 3", "Blue", 15000, false, name, address);
		Vehicle vehicle2 = new Vehicle("Mitshubishi Colt", "Euro 5", "Silver", 6000, false, name, address);
		Vehicle vehicle3 = new Vehicle("Volvo", "Euro 6", "Black", 25000, false, name, address);
		
		System.out.println("The car dealership owns 3 vehicles:");
		vehicle1.getVehicleInformation();
		vehicle2.getVehicleInformation();
		vehicle3.getVehicleInformation();
		System.out.println("--------------------------------------------------------------");
	
		//This car dealership has 2 employers:
		Employer employer1 = new Employer("Harry");
		Employer employer2 = new Employer("Ben");
		
		System.out.println("The car dealerships has 2 employers:");
		employer1.employerPresents();
		employer2.employerPresents();
		System.out.println("--------------------------------------------------------------");	
		
		//A customer enters the dealership.
		Customer cust1 = new Customer("Tom", "Friesewal 43", 10000);
				
		System.out.println("A customer enters the dealership....");
		cust1.customerPresents();
		System.out.println("The customer wants some information about a car.....");
		cust1.purchaseCar(vehicle2, employer1, false);
		System.out.println("--------------------------------------------------------------");
		
		//Another customer enters the dealership
		Customer cust2 = new Customer("Caleb", "Bumpy Lane 11", 18000);
		
		System.out.println("Another customer enters the dealership....");
		cust2.customerPresents();
		System.out.println("The customer wants to buy a car.....");
		cust2.purchaseCar(vehicle1, employer2, true);
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Now lets see the updates values of the the customer and the car dealership.");
		cust2.getCustomerInformation();
		showSalesInformation();
		
	}
	
	public static void showSalesInformation() {
		System.out.println("The dealership has: " + cashOnBank + "dollar on the bank.");
		System.out.println("It has sold " + soldCars + ".");
	}
	
	public static void updateFinance(double cash, int carsSold) {
		cashOnBank += cash;
		soldCars += 1;
	}
	
}
	