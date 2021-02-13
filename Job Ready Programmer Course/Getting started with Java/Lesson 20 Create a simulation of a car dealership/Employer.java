public class Employer {
	
	String name;
	
	public Employer(String name) {
		this.name = name;
	}
	
	public void employerPresents() {
		System.out.println("Hi, welcome to Best Car Dealership! I am " + name + ".");
		System.out.println("--");
	}
	
	public void handleCustomer(Customer cust, Vehicle vehicle, double customerCashOnHand, boolean finance) {
		if (finance) {
			System.out.println(name + ": So, you would like to buy the " + vehicle.getVehicleName() + "? Well lets see...");
			if (vehicle.getVehicleSold() == false) {
				handleFinance(cust, vehicle, customerCashOnHand);
			} else {
				System.out.println(name + ": I'm very sorry but this car is already sold to someone else!");
			}
		} else {
			System.out.println(name + ": That's ok, here you have it:");
			vehicle.getVehicleInformation();
		}
	}

	public void handleFinance(Customer cust, Vehicle vehicle, double customerCashOnHand) {
		double vehiclePrice = vehicle.getVehiclePrice();
		double customerCash = cust.getCustomerCashOnHand();
		System.out.println(name + ": The price of the car is: " + vehiclePrice + ", and you've brought: " + customerCash + ".");
		
		if (customerCash >= vehiclePrice) {
			vehicle.setVehicleSold();
			System.out.println("The customer pays the car...");
			cust.payForCar(vehiclePrice);
			makeASale(vehiclePrice);
			System.out.println(name + ": Lets put the car on your name!");
			transferCarToCustomer(cust, vehicle);
		} else {
			System.out.println(name + ": Sorry but you have to bring more money to buy this car...");
		}
		
	}
	
	public void makeASale(double cash) {
		Dealership.updateFinance(cash, 1);
	}
	
	public void transferCarToCustomer(Customer cust, Vehicle vehicle) {
		vehicle.setVehicleOwner(cust.getCustomerName(), cust.getCustomerAddress());
		cust.setVehicle(vehicle);
		System.out.println(name + ": Congratulations! The car is yours!");
	}
}
