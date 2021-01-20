import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Calculator {

	public void iNeedSomeFriends() {
		
		ScannerClass Intro = new ScannerClass();
		int totalRange = Intro.introScanner();
		
		List<Integer> allNumbers = new ArrayList<Integer>();
		LinkedList<Integer> removedNumbers = new LinkedList<Integer>();
		removedNumbers.add(-1);
		
		int indexnr = 0;
		
		for (int i = 0; i < totalRange; i++) {
			allNumbers.add(i+1);
		}
		
		for (int number : allNumbers) {
		
		if (removedNumbers.get(indexnr) == number) {
			continue;
		}
		
			int totalDeviders1 = 0;
			int totalDeviders2 = 0;
			
			for (int k = number / 2; k > 0; k--) {
				
					if ((number / k) * k == number) {
						totalDeviders1 += k;				
					}
			}
			
			for (int j = totalDeviders1 / 2; j > 0; j--) {
				
					if ((totalDeviders1 / j) * j == totalDeviders1) {
						totalDeviders2 += j;
					}
			}
			
			if (number == totalDeviders2 && number != totalDeviders1) {
				System.out.println("Found some friends: " + number + " and " + totalDeviders1 + ".");
				removedNumbers.add(totalDeviders1);
				indexnr += 1;
			}
		}
	}
}
