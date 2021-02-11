public class AccesModifiersAndStaticReferences {

	public static void main(String[] args) {
		
		// void			= A return type that doesn't return anything. 
		// Method signature 	= The first line of code that presents the method and arguments. 
		// Method body 		= All the instructions between the curly brackets in the method. 
		
		// public		= A keyword and an access modifier. If this keyword is put in the method signature,
		//			this means that other classes can invoke this method.
		// private		= Also a keyword and an access modifier. If this keyword is put in the method signature,
		//			this means that other classes cannot invoke this method. It is only for local use,
		//			which means inside of the class. 
		
		// Access modifiers 	= Some extra information: it's also possible to make a public or private class for example. 
		// No Access Modifier	= If no access modifier is given to a class, so NOT: public class NameOfClass, but ONLY class NameOfClass,
		//			this means, that if we want to invoke methods from this class by another class, the other class should
		//			be in the same package. If it is in the same project, but in another package, the methods cannot be invoked.
		//			To make another class findable by another class in another package, it should be made public. 
		//			The package still has to be imported though!!
		
		// static		= A Keyword. If used in the method signature, the methods belong to the class. If static is not used,
		//			the methods belong to an instance of the class.
		

	}

}
