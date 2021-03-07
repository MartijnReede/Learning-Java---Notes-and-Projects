package Products;


public abstract class Product {

	private int id;
	private String name;
	private int sizeCM;
	
	public Product(int id, String name, int sizeCM) {
		super();
		this.id = id;
		this.name = name;
		this.sizeCM = sizeCM;
	}
	
	//Returns true if it turns on and does the work it is suppose to do. 
	public abstract boolean turnOnAndDoWork();

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", sizeCM=" + sizeCM + "]";
	}
	
}

