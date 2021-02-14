public class Employer implements Comparable<Employer> {
	
	String name;
	String department;
	int salary;
	
	public Employer(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employer [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employer e) {
		
		// Here it says: If this employer has less salary than the passed in employer e, return -1. etc...
		
		if (this.salary < e.salary ) { 
			return -1;
		} else if (this.salary > e.salary){
			return 1;
		}
		
		return 0;
	}
	
	
}
