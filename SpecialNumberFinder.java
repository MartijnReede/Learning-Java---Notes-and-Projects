import java.util.ArrayList;
import java.util.List;

public class SpecialNumberFinder {
	
	int x;
	
	public SpecialNumberFinder(int x) {
		this.x = x;
		
		int [] allNumbers = new int[x];									// ARRAY MET ALLE GETALLEN WAARIN GEZOCHT GAAT WORDEN. 
			for (int i = 0; i < x; i++) {			
			allNumbers[i] = i + 1;
			}
		
		for (int number : allNumbers) {									// ALLE ELEMENTEN AFGAAN BINNEN DE ARRAY.
			
			int	s = 0;
			
			for(int k = number / 2; k > 0; k--) {						// BEREKENINGEN UITVOEREN		
				int check = ((number / k) * k);
	
					if (check == number) {
					s += k;
					}			
			}
					
			if (s == number) {
				SpecialNumbers.add("Found one!! It is number: " + number);
			}
		}				
}
	
	public List<String> SpecialNumbers = new ArrayList<String>();		// LIJST MET SPECIALE GETALLEN.
	
	public void showSpecialNumbers() {									// PRINT SPECIALE GETALLEN.
		for (String numbers : SpecialNumbers) {
			System.out.println(numbers);
		}
	}
	
	
}

