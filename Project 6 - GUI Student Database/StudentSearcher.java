package application;

public class StudentSearcher {

	public static int getStudentIndex(String firstname, String lastname) {
		
		int studentIndex = -1;
		int studentCount = 0;
		
		for (Student student : Main.getAllStudents()) {
			
		if(student.getFirstName().toLowerCase().equals(firstname) && student.getLastName().toLowerCase().equals(lastname)) {
			studentIndex = studentCount;
			}
		
		studentCount++;
		}
		
		return studentIndex;
	}
	
}
