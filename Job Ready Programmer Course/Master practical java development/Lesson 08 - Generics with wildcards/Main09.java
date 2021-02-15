import java.util.ArrayList;
import java.util.List;

public class Main09 {

	public static void main(String[] args) {
		//********** OBJECTS *************
		
		// The Object class is sort of the grand daddy of everything in java. 
		// If I make a String, this is an object. 
	
		Object myObject = new Object();
		String myVar = "Hello";
		
		//Since a String is an Object, I can say myObject is myVar.
		myObject = myVar;
		
		//I've made two classes (Employee, and Accountant which is a child-class of Employee).
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		
		//Since accountant is an Employee, I could assign an Employee to be an accountant. 
		emp = acc;
		
		// *************** GENERICS AND ARRAYLISTS ****************
		
		//If I make two Lists of type Employee and Account:
		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Accountant> accountants = new ArrayList<>();
		
		// employees = accountants; THIS DOES NOT WORK!
		// An ArrayList of Employee is not a parent of an ArrayList of Accountant.
		// The relationship between Employee and Accountant breaks a part when we use generics.
		// So: a list of accountants is NOT a list of employees.
		
		// *************** WILDCARDS AND ARRAYLISTS ***************
		
		// We can use wildcards <?> to make sure that we can assign the accountants List to the employees List. 
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<?> accountants2 = new ArrayList<>();
		
		// Now this works since it is going to treat the values in the ArrayList as Objects. 
		employees2 = accountants2;
		
		// I could even make a String array and assign it to the wildcard array.
		ArrayList<String> stringsArray = new ArrayList<>();
		accountants2 = stringsArray;
		
		// ************** SMART USE OF WILDCARDS (CLASSES) *****************
		
		// Now the wildcard represents all the child-classes of Employee.
		ArrayList<? extends Employee> employee3 = new ArrayList<>();
		
		//Now we can make a list of different kind of employees that are child-classes of Employee.
		ArrayList<Accountant> accountants3 = new ArrayList<>();
		employee3 = accountants3;
		
		// ************** SMART USE OF WILDCARDS (INTERFACES) *****************
		
		// This will also work with classes that implement an interface.
		ArrayList<? extends ComputerParts> computerParts = new ArrayList<>();
				
		//Now we can make a list of different kind of employees that are child-classes of Employee.
		ArrayList<Keyboard> keyboards = new ArrayList<>();
		computerParts = keyboards;
		
		//**************** SUPER KEYWORD AND WILDCARDS **********************
		
		// This means only an Employee or a class higher in the hierarchy can be added to this list.
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		
		// Adding the accountant will give an error since it is a child of the Employee class. 
		
		// ***************** HOW WILL THIS WORK WITH METHODS? ********************
		
		// With the use of the <?> wildcard in the method, I can pass in a list of type Accountant
		// and of type Employee.
		
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee());
		emps.add(new Employee());
		emps.add(new Accountant());
		
		ArrayList<Accountant> accs = new ArrayList<>();
		accs.add(new Accountant());
		accs.add(new Accountant());
		
		makeEmployeesWork(accs);
		makeEmployeesWork(emps);	
	}
	
	public static void makeEmployeesWork(List<? extends Employee> employees) {
		
		for (Employee emp : employees) {
			emp.work();
		}
		System.out.println("\nWork is done..\n");
	}
}
