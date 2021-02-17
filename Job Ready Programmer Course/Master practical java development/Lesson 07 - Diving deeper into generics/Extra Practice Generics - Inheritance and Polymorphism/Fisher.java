public class Fisher extends Worker {

	public Fisher(String name, int age, int salary) {
		super(name, age, salary);
	}

	@Override
	public void work() {
		System.out.println("Hi I am: " + name + ". I am " + age + " years old and my salary is: " + salary + " euros.");
		System.out.println("My profession is fishing, so I will hop on my boat to go fishing, bye!");
	}

}
