package com.jobready.liskovSubstitutionPrinciple;

public class Application {

	public static void main(String[] args) {
		
		//********** LISKOV SUBSTITUTION PRINCIPLE **********
		// Imagine that we have the following class diagram where teachers have two methods: teach() and otherWork().

		//	- ABSTRACT CLASS: TEACHER (parent class).
		
		//	- Public class: English teacher (child class).
		//	- Public class: Science teacher (child class).
		
		// Both child-classes will implement the methods teach() and otherWork(). Lets assume that a substitute teacher
		// comes in the diagram because one of the teachers is sick. A substitute teacher is doing otherWork() but it
		// is not really teaching like a normal teacher would do. If we would extend the SubstituteTeacher class with
		// the Teacher parent class this would VIOLATE THE LISKOV PRINCIPLE! Because it is not really a teacher!
		
		// So how to correctly organize this? We should change the name of the parent teacher class to SchoolStaff.
		// Then we create a Teacher interface. 
		//- The substitute teacher will extend SchoolStaff.
		//- The teachers will extends to schoolStaff and implement the teacher interface.
		
		SchoolStaff substituteTeacher = new SubstituteTeacher();
		substituteTeacher.doWork();
		
		MathTeacher mathTeacher = new MathTeacher();
		mathTeacher.doWork();
		mathTeacher.teach();
		
		ScienceTeacher scienceTeacher = new ScienceTeacher();
		scienceTeacher.doWork();
		scienceTeacher.teach();
						
	}

}
