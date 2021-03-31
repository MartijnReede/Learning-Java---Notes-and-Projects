public class ContributeToContext {
	
	public static void main(String[] args) {
		
	}

	//In the previous lesson we've learned how we can contribute a bean to the Spring context. 
	//We created a ManufacturingConfig class with the @Configuration annotation. In this class
	//we created a blueprint for a car object with certain dependencies. 
	
	//There are other ways to contribute to the Spring context.
	//If I want to contribute the class below, I can use several annotations like:
	//@Service, @Component and @Repository. All these annotations do exactly the same thing.
	//If I write the code like the example below with the constructor, Spring will add the ContributeThis object to 
	//to the context. 
	
@Service
public class ContributeThis{
		
		public ContributeThis() {	
		}
	}

	//So why do we have three different types of annotations? If the object is used as a service, we use the @Service annotation. 
	//If the object has something to do with data, we use the @Repository annotation. If it isn't both of theses things,
	//we can use the @Component annotation. 

}

	//When the application starts, Spring will first scan all the classes for particular components or annotations so it can be
	//added to the context. This process is called "Scanning".

	//---------- PACKAGES AND SCANNING ----------------
	
	//Until now, we've created all new classes and interfaces in packages that share the same name. If we add
	//a package that doesn't share the same name, this package will not be scanned by Spring. But what if we
	//want it to be scanned? 

	//If we want this, we have to go the the application class. Here we find the @SpringBootApplication annotation. Here we have
	//to specify what packages we want to have scanned as well. This will look like: 
	
	@SpringBootApplication(scanBasePackages= {"com.jrp.PMA", "com.jrp.utils"})
	public class ProjectManagementApplication{
		
	}
	
	//So why do we add the com.jrp.PMA package as well? This package should be already scanned right? If I only write
	//the argument "com.jrp.utils", spring is only going to scan this package, and not the other ones. 

