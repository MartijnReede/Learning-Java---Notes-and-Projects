import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ExtraPracticcMain {

	public static void main(String[] args) {
		
		// In this extra practice I will create a HashSet with employers and convert it to an ArrayList
		// so I can sort it. I'm going to sort the employers based on their salary, which I will do
		// with the comparable interface. 
		
		HashSet<Employer> employers = new HashSet<Employer>();
		
		Employer henk = new Employer("Henk", "Sales", 3000);
		Employer harry = new Employer("Harry", "Sales", 4000);
		Employer ted = new Employer("Ted", "Sales", 2000);
		Employer lucia = new Employer("Lucia", "Administration", 3500);
		Employer kevin = new Employer("Kevin", "Building", 3200);
		
		employers.add(henk);
		employers.add(harry);
		employers.add(ted);
		employers.add(lucia);
		employers.add(kevin);
		
		ArrayList<Employer> allEmployers = new ArrayList<Employer>(employers);
		Collections.sort(allEmployers);
		
		
		// Now all the employers are sorted based on their salary. 
		for (Employer employer : allEmployers) {
			System.out.println(employer.toString());
		}
		
		

	}

}
