package Products;


public class Laptop extends Product {

	public Laptop(int id, String name, int sizeCM) {
		super(id, name, sizeCM);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean turnOnAndDoWork() {
		System.out.println("Turning on, screen is lighting up, ready to work on, play games, send emails, etc...");
		return true;
	}

}
