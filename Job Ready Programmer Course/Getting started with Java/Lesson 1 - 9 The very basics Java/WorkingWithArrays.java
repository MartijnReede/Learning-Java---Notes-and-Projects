
public class WorkingWithArrays {

	public static void main(String[] args) {
		
		// An array is a way to store a collection of elements.
		
		// In a normal array, the size is fixed.
		// Creating an array with 100 possible elements:
		int[] values = new int[100];
		
		// Adding values to the array. The array "values" has the index number 0 - 99.
		values[0] = 10;
		values[1] = 3;
		
		// Printing values from the array.
		System.out.println(values[1]);
		
		// By default, non-assigned values are 0.
		System.out.println(values[10]);
		
		// You cannot enter different data types into one array.
		// values[11] = "word"; is not possible for this array. 
		
		//Other way of creating an array.
		String[] words = new String[] 
				{"My", "Name", "Is"};

		System.out.println(words[2]);
	}
}
