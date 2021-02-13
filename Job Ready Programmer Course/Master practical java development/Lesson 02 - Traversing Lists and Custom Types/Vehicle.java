
public class Vehicle {
	
	String make;
	String model;
	int price;
	boolean fourWheelDrive;
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fourWheelDrive=" + fourWheelDrive
				+ "]";
	}
	public Vehicle(String make, String model, int price, boolean fourWheelDrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.fourWheelDrive = fourWheelDrive;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}
	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}
	
	
}
