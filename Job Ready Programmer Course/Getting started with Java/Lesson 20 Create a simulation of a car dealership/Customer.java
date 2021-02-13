public class Customer {
	
	private String name;
	private String address;
	private double cashOnHand;
	Vehicle vehicle;
	
	public Customer(String name, String address, double cashOnHand) {
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}
	
	public void customerPresents() {
		System.out.println("Hi, I am " + name + ".");
		System.out.println("--");
	}
	
	public void purchaseCar(Vehicle vehicle, Employer emp, boolean finance) {
		if (finance) {
			System.out.println(name + ": I would like to buy the " + vehicle.getVehicleName() + " car.");
			emp.handleCustomer(this, vehicle, cashOnHand, finance);
		} else {
			System.out.println(this.name + ": I am not into buying a car right now, I only want some information about the " + vehicle.getVehicleName() + " car.");
			System.out.println("--");
			emp.handleCustomer(this, vehicle, cashOnHand, finance);	
		}
	}
	
	public double getCustomerCashOnHand() {
		return cashOnHand;
	}
	
	public void payForCar(double amount) {
		cashOnHand -= amount;
	}
	
	public String getCustomerName() {
		return name;
	}
	
	public String getCustomerAddress() {
		return address;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void getCustomerInformation() {
		System.out.println("Name:" + name + ".");
		System.out.println("Address:" + address + ".");
		System.out.println("Cash on hand:" + cashOnHand + ".");
		if (vehicle != null) {
			vehicle.getVehicleInformation();
		}
		System.out.println("--");
	}

}
