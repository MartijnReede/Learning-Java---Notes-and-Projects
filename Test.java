
public class Test {

	public static void main(String[] args) {
		
		
		
		int getallen[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29}; 
		
		for (int getal : getallen) {
		
		int s = 0;
		
		for(int k = getal / 2; k > 0; k--) {						// BEREKENINGEN UITVOEREN		
			
			int check = ((getal / k) * k);
		
			
			if (check == getal) {
			s += k;	
			}
			
			}
		if (s == getal) {
			System.out.println("Found a special number!!! It is: " + getal);
		}
	}
	}
}
