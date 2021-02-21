package com.jobready.Condition;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Person> allPersons = new ArrayList<Person>();
			allPersons.add(new Person("Henk", 1.20, "Red", 21));
			allPersons.add(new Person("Harry", 1.45, "Brown", 45));
			allPersons.add(new Person("Warry", 2.15, "Black", 24));
			allPersons.add(new Person("Stupid", 1.90, "Brown", 13));
			allPersons.add(new Person("Fatty", 1.91, "Blonde", 18));
			allPersons.add(new Person("Drinky", 1.66, "Black", 65));
			allPersons.add(new Person("Dopey", 1.39, "Brown", 73));
			allPersons.add(new Person("Suckely", 1.10, "Blonde", 31));
			allPersons.add(new Person("Skinny", 2.05, "Blonde", 21));		

			//The goal is to iterate through this list using a lambda which checks a certain condition. 
			//We only need one method for this....
			System.out.println("\n-- Everybody with brown hair--\n");
			checkPersons(allPersons, (Person p) -> p.getHairColor().equals("Brown"));
			System.out.println("\n-- Everybody with length between 1 and 1.5m--\n");
			checkPersons(allPersons, (Person p) -> p.getLength() > 1.0 && p.length < 1.5);
			
			
	}

	public static void checkPersons(List<Person> allPersons, CheckingCondition check) {
		for (Person p : allPersons) {
			if (check.test(p)) {
				p.printPerson();
			}
		}
	}
	
}
