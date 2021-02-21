
public class Cars {

	String make;
	String model;
	String color;
	int price;
	
	
	public Cars(String make, String model, String color, int price) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
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


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Cars [make=" + make + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
	public void printCar() {
		System.out.println(this);
	}
	
}
