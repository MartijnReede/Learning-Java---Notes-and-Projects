
public class WhileLoops {

	public static void main(String[] args) {
		
		int count = 0;
		
		while (count <= 10) {
			System.out.println("Martijn " + count);
			count++;
		}
		
		// If the condition behind the while loop equals true, the while loop will repeat itself. 
		
		int count2 = 0;
		
		// It's possible to break out of the while loop before the count reaches 10.
		// The while loop before will stop when count2 equals 5. 
		while (count2 <= 10) {
			count2++;
			
			System.out.println(count2);
			if (count2 == 5) {
				break;
			}
		}		
	}
}
