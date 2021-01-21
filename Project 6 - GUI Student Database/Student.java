package application;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String firstName;
	private String lastName;
	private String grade;
	private int uniqueID;
	private List<String> enrolledClasses = new ArrayList<String>();
	private int classesNotPayed;

	@Override
	public String toString() {
		return "\nID: " + uniqueID + "   name: " + firstName + " " + lastName + "   Grade: "  + grade + "  Total depth: $" + classesNotPayed + ",-  Enrolled classes: " + enrolledClasses;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void updateEnrolledClasses(String cls) {
		enrolledClasses.add(cls);
	}
	
	public List<String> getEnrolledClasses(){
		return enrolledClasses;
	}
	
	public void increaseClassesNotPayed() {
		classesNotPayed += 600;
	}
	
	public void decreaseClassesNotPayed() {
		classesNotPayed -= 600;
	}
	
	public int getClassesNotPayed() {
		return classesNotPayed;
	}
	
	public void updateDepth(int value) {
		classesNotPayed -= value;
	}
	
	public void setFirstName(String fn) {
		firstName = fn;
	}
	
	public void setLastName(String ln) {
		lastName = ln;
	}
	
	public void setGrade(String gr) {
		grade = gr;
	}
	
	public void setUniqueID(int id) {
		uniqueID = id;
	}
	
}
