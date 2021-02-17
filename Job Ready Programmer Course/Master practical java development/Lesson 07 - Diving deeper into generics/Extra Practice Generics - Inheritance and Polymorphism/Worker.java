public abstract class Worker {
	
	String name;
	int age;
	int salary;
	
	public Worker(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public abstract void work();
}
