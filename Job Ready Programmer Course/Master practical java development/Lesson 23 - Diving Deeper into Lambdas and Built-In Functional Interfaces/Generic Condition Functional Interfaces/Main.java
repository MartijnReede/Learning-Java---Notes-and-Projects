package com.jobready.genericfunctionalinterfaces;

import java.util.Arrays;
import java.util.List;

import com.jobready.Condition.Person;

public class Main {

	public static void main(String[] args) {
		
		//In this class I will create two different lists. One of type Person and one of type Car. 

		List<Car> allCars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500)
				);
		
		List<Person> allPersons = Arrays.asList(
				new Person("Henk", 1.20, "Red", 21),
				new Person("Harry", 1.45, "Brown", 45),
				new Person("Warry", 2.15, "Black", 24),
				new Person("Stupid", 1.90, "Brown", 13),
				new Person("Fatty", 1.91, "Blonde", 18),
				new Person("Drinky", 1.66, "Black", 65),
				new Person("Dopey", 1.39, "Brown", 73),
				new Person("Suckely", 1.10, "Blonde", 31),
				new Person("Skinny", 2.05, "Blonde", 21)		
				);
		
		//Now I want to use a generic functional interface to iterate through them both and checking certain requirments.
	
		checkRequirments(allCars, (c) -> c.getColor().equals("White")); 
		checkRequirments(allPersons, (p) -> p.getAge() > 25 && p.getAge() < 50);
	
	}
	
	public static <L> void checkRequirments(List<L> list, ConditionChecker<L> conditionChecker) {
		for (L l : list) {
			if(conditionChecker.check(l)) {
				System.out.println(l);
			}
		}
	}

}
