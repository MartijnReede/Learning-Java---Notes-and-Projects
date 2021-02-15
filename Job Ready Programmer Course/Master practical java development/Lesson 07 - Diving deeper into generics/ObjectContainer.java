public class ObjectContainer {

	Object item1;
	Object item2;
	
	public ObjectContainer(Object item1, Object item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void printItems() {
		System.out.println("Printing the content of the object container:");
			System.out.println("Item 1: " + item1);
			System.out.println("Item 2: " + item2);
			System.out.println();
	}
	
	public Object getItem1() {
		return item1;
	}
	
	public Object getItem2() {
		return item2;
	}
	
}
