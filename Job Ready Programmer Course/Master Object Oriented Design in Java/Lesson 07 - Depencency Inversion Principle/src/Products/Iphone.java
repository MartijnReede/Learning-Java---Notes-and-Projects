package Products;

public class Iphone extends Product {

	public Iphone(int id, String name, int sizeCM) {
		super(id, name, sizeCM);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean turnOnAndDoWork() {
		System.out.println("Iphone turning on, screen is lighting up, ready to call someone!");
		return true;
	}

}
