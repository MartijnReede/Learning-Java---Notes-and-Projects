import java.util.ArrayList;
import java.util.List;

public class Calculator {

	int x;
	public List<String> PriemNumbers = new ArrayList<String>();	
	
	public Calculator(int x) {
		this.x = x;
		
		// CREATES RANGE OF NUMBERS BASED ON USER INPUT.
		
		int [] allNumbers = new int[x];									
			for (int i = 0; i < x; i++) {			
			allNumbers[i] = i + 1;
			}
		
		//CHECKS EVERY NUMBER IN RANGE.
			
		for (int number : allNumbers) {									
			
			int	s = 0;
			
			for(int k = number; k > 0; k--) {							
				int check = ((number / k) * k);
	
					if (check == number) {
					s += k;
					}			
			}
			
			//CHECKS IF THE NUMBER IS A PRIME NUMBER OR NOT.
			
			if (s == number + 1) {
				PriemNumbers.add("Found one!! It is number: " + number);
			}
		}				
	}
	
	// PRINTS ALL PRIME NUMBERS FOUND TO USER.
	
	public void showPriemNumbers() {									
		for (String numbers : PriemNumbers) {
			System.out.println(numbers);
		}
	}	
}
	

