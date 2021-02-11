
public class Exercise {

	public static void main(String[] args) {
		
		// Exercise:
		// Create a method that will extract a part of a String.
		// From the String below, extract all categories and print them to the console. 
		
		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apperal and the slightly "
				+ "more in demand category:makeup along with the category:furniture and...";
		
		printCategories(str);
		
		// Methods to use: 
		// - substring(String start, String end)
		// - indexOf(String s, int i)
		// - while(true){}
	}
	
	// Extract all categories from the string argument.
	public static void printCategories(String str) {
		
		int startIndex = 0;
		int secondStartIndex;
		int thirdStartIndex;
		
		while(true) {
			secondStartIndex = (str.indexOf(':', startIndex)) + 1;
			thirdStartIndex = str.indexOf(" ", secondStartIndex);
			String category = str.substring(secondStartIndex, thirdStartIndex);
			System.out.println(category);
			startIndex = thirdStartIndex;
			
				if (category.equals("furniture")) {
					break;
				}
			}
		}
	}


