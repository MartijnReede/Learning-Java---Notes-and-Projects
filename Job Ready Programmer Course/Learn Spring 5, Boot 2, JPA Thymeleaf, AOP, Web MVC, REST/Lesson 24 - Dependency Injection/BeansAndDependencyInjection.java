package DependencyInjection;

public class BeansAndDependencyInjection {
	
	public static void main(String args) {
		
	//Spring has something like the spring context. When your spring application starts, something
	//called the Spring context is also started. The Spring context is the place where all the objects
	//that are needed for your application are loaded into. Wherever we need an object, Spring will
	//inject an object. For example, Spring knows how to create an object of a class that extends a CRUD repository.
	//So whenever we use the @Autowired annotation Spring know that the class needs to have a CRUD repository injected 
	//in this class, because this class has a dependency on a CRUD repository. 
	
	//If we would manually create an instance of a CRUD repository, this means we also have to implement all methods.
	//This would create a big mess.
	
	//Check the car class for an example: The dependencies of this car are:
	// - The Doors class.
	// - The Engine class.
	// - The Tires class.
	
	//Without the doors, engine and tires, the car can not exist. 
		
	//So if I want to make an instance of a car manually, I have to create instances of all the dependencies as well. 
	
		Tires tires = new Tires();
		Doors doors = new Doors();
		Engine engine = new Engine();
		Car car = new Car(engine, doors, tires);
		
	//In Spring, we would create the car instance with the @Autowired notation. 
		
		@Autowired
		Car car2;
		
	//If we would use the @Autowired annotation in a Spring annotation, we would get an error. This is
	//because Spring has no idea what a car is. CRUD repositories are already defined in the Spring context but
	//a car isn't. If we want to use @Autowired for a Car object, we need to create a bean. 
	
	//In the application class we would create a bean like this: 
		
	}
	
	@Bean
	public Car newCar() {
		Engine e = new Engine();
		Tires t = new Tires();
		Doors d = new Doors();
		return new Car(e, d, t);
	}
	
	//A better way define a bean for the Spring context is to create a configuration class. Only the @bean
	//annotation is not enough, we also need to use the @Configuration annotation.
	//This class will look like this: 
	
	@Configuration
	public class ManufacturingConfig {
		
		@Bean
		public Car newCar() {
			Engine e = new Engine();
			Tires t = new Tires();
			Doors d = new Doors();
			return new Car(e, d, t);
		}
	}
	
	//When the Spring application starts, it scans the classes and it will find this configuration class. Then it will
	//run the code so it knows how to inject a car object if needed. 
	
	
}
