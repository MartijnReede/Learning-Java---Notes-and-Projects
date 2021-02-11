public class Main4 {
	
	public static void main(String[] args) {
		
		// An abstract class has only abstract methods. Abstract classes CAN NOT be instantiated. 
		// An abstract class is only meant to be a parent of another class. 
		// Classes that extend from an abstract class have to implement all the methods that are defined in the super class. 
		// Also, it forces the software developer to NOT define objects based on the super class. For example:
		// Animal chicken = new Chicken(); is not possible. This has to be Chicken chicken = new Chicken();
		
		// For this example I made a parent abstract class called Hobbyist and two sub-classes called Climber and Pianist. They can both do their hobby. 
		
		Hobbyist climber = new Climber();
		climber.doHobby();
		
		Hobbyist pianist = new Pianist();
		pianist.doHobby();
		
		// So now I have two different objects, but since they are both Hobbyists I can both use them in the method below:
		
		doHobbyMethod(climber);
		doHobbyMethod(pianist);
		
		// This doesnt work since the hobbyist class is abstract.  It cannot be instantiated. 
		//Hobbyist climber2 = new Hobbyist();
		
		// The different outcome for the same methods is called polymorphism. 
		
	}
	
	public static void doHobbyMethod(Hobbyist hobbyist) {
		hobbyist.doHobby();
	}
}
