package GeneralManufacturingProcess;

import Products.Iphone;
import Products.Product;

public class IphoneManufacturing extends ManufacturingProcessManager {
	
	private static int IphoneId = 1000;
	
	@Override
	protected Product assembleProduct() {
		Iphone iphone  = new Iphone(IphoneId, "Iphone6S", 15);
		IphoneId +=1;
		System.out.println("Iphone6S created");
		return iphone;
	}

	@Override
	protected boolean testProduct(Product p) {
		if (p.turnOnAndDoWork()) {
			System.out.println("Iphone test completed...");
			return true;
		} else {
			System.out.println("Iphone test failed...");
			return false;
		}
	}

	@Override
	protected boolean packageProduct(Product p) {
		System.out.println("Iphone is wrapped in a nice package...");
		return true;
	}

	@Override
	protected void storeProduct(Product p) {
		System.out.println("STORED PRODUCT: " + p.toString());
		System.out.println("***************************************");
		
	}

}
