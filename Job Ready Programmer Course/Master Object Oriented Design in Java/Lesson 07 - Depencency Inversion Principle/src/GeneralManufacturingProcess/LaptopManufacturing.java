package GeneralManufacturingProcess;

import Products.Laptop;
import Products.Product;

public class LaptopManufacturing extends ManufacturingProcessManager {

	private static int laptopID = 0;
	
	@Override
	protected Product assembleProduct() {
		Laptop l = new Laptop(laptopID, "LenovoSX1", 40);
		laptopID += 1;
		System.out.println("Laptop created...");
		return l;
	}

	@Override
	protected boolean testProduct(Product p) {
		if (p.turnOnAndDoWork()) {
			System.out.println("Laptop testing succeeded...");
			return true;
		} else {
			System.out.println("Laptop testing failed...");
			return false;
		}
	}

	@Override
	protected boolean packageProduct(Product p) {
		System.out.println("Laptop is put in a nice box...");
		return true;
	}

	@Override
	protected void storeProduct(Product p) {
		System.out.println("STORED PRODUCT: " + p.toString());
		System.out.println("***************************************");
	}

}
