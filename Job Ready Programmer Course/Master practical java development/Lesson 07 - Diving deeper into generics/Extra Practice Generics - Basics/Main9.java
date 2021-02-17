import java.util.ArrayList;
import java.util.List;

public class Main9 {

	public static void main(String[] args) {
		
		//Generics are created to have data type safety.
		//The List below for example only takes integers.
		List<Integer> numbers = new ArrayList<>();
		
		//If I don't define the generic type in it, I can store anything in the List.
		List messages = new ArrayList();
		messages.add("Hello");
		messages.add(50.2);
		messages.add(true);
		
		//As you can see, I've added a String, Double and Boolean value. If I wanted to iterate
		//Through this list and do something with the values, this could be a problem. All the entries
		//in the list are considered of type Object. So I can't easily make Strings from them. 
		
		//for (String message : messages) THIS DOES NOT WORK NOW!
		
		//************ CREATE GENERIC CLASSES **************
		
		//I've created a new generic class called Item<T>. 
		
		//If I instantiate the class, I have to give it the type for <T>, in this case a String. 
		Item<String> item = new Item<String>();
		item.item1 = "Hello";
		
		//I could also use <T> for another class, in this case I used the person Class.
		Item<Person> item2 = new Item<Person>();
		Person p1 = new Person("Harry", 25);
		item2.item1 = p1;
		
		//It is also possible to create a class with multiple generics. So now I've made another class
		//called MultipleItems<T, E>;
		//I could pass in two persons for example, but also a person and an animal. 
		
		//Two persons.
		Person p2 = new Person("Ben", 40);
		MultipleItems<Person, Person> multiplePersons = new MultipleItems<Person, Person>();
		multiplePersons.setE(p1);
		multiplePersons.setT(p2);
		
		//A person and an animal.
		Animal2 a1 = new Animal2("Bird", "Yellow");
		MultipleItems<Person, Animal2> multipleCreatures = new MultipleItems<Person, Animal2>();
		multipleCreatures.setE(a1);
		multipleCreatures.setT(p2);	
	}
}


