package GeneralManufacturingProcess;

import Products.Product;

//This class is responsible for the managing the general manufacturing process.

public abstract class ManufacturingProcessManager {
	
	//Template method...
	public void startManufacturingProcess() {
		//Assemble
		Product p = assembleProduct();
		
		//Test product.
		if (testProduct(p)) {
			//If test succeeded package product.
			if (packageProduct(p)) {
				//If package succeeded store product.
				storeProduct(p);
			}
		}
	}
	
	//Methods that will be implemented in the child classes.
	protected abstract Product assembleProduct();
	protected abstract boolean testProduct(Product p);
	protected abstract boolean packageProduct(Product p);
	protected abstract void storeProduct(Product p);
}
