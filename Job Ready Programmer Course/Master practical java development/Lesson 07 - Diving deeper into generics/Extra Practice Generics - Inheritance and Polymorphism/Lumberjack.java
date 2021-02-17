
public class Lumberjack extends Worker {

	public Lumberjack(String name, int age, int salary) {
		super(name, age, salary);
	}

	@Override
	public void work() {
		System.out.println("Hi I am: " + name + ". I am " + age + " years old and my salary is: " + salary + " euros.");
		System.out.println("My profession is cut trees down, so I will go into the forest now, bye!");
	}


}
