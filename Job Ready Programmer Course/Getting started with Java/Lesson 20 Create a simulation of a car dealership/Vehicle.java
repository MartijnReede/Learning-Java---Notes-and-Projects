public class Vehicle {
	
	private String name;
	private String engine;
	private String color;
	private double price;
	private boolean sold;
	private String ownerName;
	private String ownerAddress;
	
	public Vehicle(String name, String engine, String color, double price, boolean sold, String ownerName, String ownerAdress) {
		this.name = name;
		this.engine = engine;
		this.color = color;
		this.price = price;
		this.sold = sold;
		this.ownerName = ownerName;
		this.ownerAddress = ownerAdress;
	}
	
	public void getVehicleInformation() {
		System.out.println("Name: " + name + "." );
		System.out.println("Engine: " + engine + "." );
		System.out.println("Color: " + color + "." );
		System.out.println("Price: " + price + ".");
		System.out.println("Owner: " + ownerName + ".");
		System.out.println("Owner adress: " + ownerAddress + ".");
		System.out.println("--");
	}
	
	public String getVehicleName() {
		return name;
	}
	
	public double getVehiclePrice() {
		return price;
	}
	
	public boolean getVehicleSold() {
		return sold;
	}
	
	public void setVehicleSold() {
		sold = true;
	}
	
	public void setVehicleOwner(String name, String address){
		this.ownerName = name;
		this.ownerAddress = address;
	}
}
