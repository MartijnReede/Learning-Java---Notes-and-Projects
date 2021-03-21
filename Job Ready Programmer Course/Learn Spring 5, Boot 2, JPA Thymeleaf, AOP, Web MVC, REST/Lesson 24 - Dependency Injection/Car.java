package DependencyInjection;

public class Car {

	Engine engine;
	Doors doors;
	Tires tires;
	
	public Car (Engine engine, Doors doors, Tires tires) {
		this.engine = engine;
		this.doors = doors;
		this.tires = tires;
	}

}
