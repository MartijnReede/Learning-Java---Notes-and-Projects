
public class MainAppl {

	public static void main(String[] args) {
		
		//Until now I've learned that methods can only be invoked if they are written in a class.
		//This class is instantiated or the methods are static. Only then I can invoke the methods...
		
		//In Java 8 functional programming was introduced. This means that methods can exist independently on their own. 
		//Independent methods are often called functions. 
		
		//In functional programming, blocks of code do not necessarily need to be wrapped into methods belonging to a certain class.
		
		
		// ***********Lambdas ************
		// The need for some functionality to be associated with an object, is no longer necessary. 
		// We call these functionalities, that can run on their own, Lambdas.
		
		
		//We're going to create an anonymous class and then convert it to a lambda. 
		//We're going to do this with a Human and Robot class.
		
		Human tom = new Human();
		Robot wale = new Robot();
		
		tom.walk();
		wale.walk();
		
		walker(tom);
		
		System.out.println("--");
		everybodyWalk(tom);
		everybodyWalk(wale);
		
		//So where do anonymous classes come in? An anonymous class is when classes are instantiated on the fly. 
		//They are not given a name like tom or wale.
		everybodyWalk(new Walkable() {
			@Override
			public void walk() {
				System.out.println("Custom object walking...");		
			}
		});
		//As you can see in the method above, no instance of a Human or Robot need to be made, to make something walk. 
		//It is still connected to the Walkable interface though. This is the closest we can get to functional programming
		//Before lambda's were introduced. 
		
		
		//********** ACTUALLY CREATE A LAMBDA EXPRESSION **********
		
		everybodyWalk( () -> System.out.println("Custom object walking on a lambda!"));
		//So what exactly is this piece of code: " () -> System.out.println("Custom object walking on a lambda!")"
		//This piece of code represents the functional interface Walkable. 
		
		//I can also create a variable of type functional interface. A functional interface is an interface
		//with only ONE abstract method in it. 
		FunctionInterface1 someCode = () -> {
							System.out.println("I am walking around...");
							System.out.println("Some other random text...");
							};	
							
		// everybodyWalk(someCode); This doesn't work since the everybodyWalk method only takes a Walkable interface. 
							
		Walkable someWalkableCode = () -> {
								System.out.println("I am walking around...");
								System.out.println("Some other random text...");
								};	
								
		everybodyWalk(someWalkableCode); // This works fine!
	}
	
	//The method below has a problem, it can only make humans walk.
	//We can create a parent class, to make both the robot and human walk, 
	//or we can create an interface. And make both Human and Robot implement them. 
	public static void walker(Human human) {
		human.walk();
	}
	
	//So I've made an interface called Walkable and I made Human and Robot implement them. Now I can
	//create a method that is usable by humans and robots. 
	public static void everybodyWalk(Walkable walkers) {
		walkers.walk();
	}
	
}
