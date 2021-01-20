import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// PROGRAM TO KEEP TRACK OF THE FINANCE SITUATION OF A SCHOOL (HUIZERMAAT).
		
		// STUDENTS ON HUIZERMAAT.
		List<Student> students = new ArrayList<Student>();
		
		Student Lucia = new Student("Lucia Willems", 1, 3000);
		Student Martijn = new Student("Martijn Reede", 2, 3000);
		Student Kevin = new Student("Kevin Leijnse", 3, 3000);
		Student Cyrille = new Student("Cyrille Jones", 4, 3000);
		
		students.add(Lucia);
		students.add(Martijn);
		students.add(Kevin);
		students.add(Cyrille);
		
		// TEACHERS ON HUIZERMAAT. 
		List<Teacher> teachers = new ArrayList<Teacher>();
		
		Teacher Harry = new Teacher("Harry Peters", 101, 800);
		Teacher Gerda = new Teacher("Gerda Vos", 102, 1200);
		Teacher Bert = new Teacher("Bert van Oosten", 103, 1600);
		Teacher Bas = new Teacher("Bas Smoors", 104, 2000);
		
		teachers.add(Harry);
		teachers.add(Gerda);
		teachers.add(Bert);
		teachers.add(Bas);
		
		// CREATING THE SCHOOL (HUIZERMAAT).
		School Huizermaat = new School(students, teachers); 
		
		// STUDENT PAYMENTS
		Lucia.updateFeesPaid(100);
		Lucia.updateFeesPaid(250);
		Martijn.updateFeesPaid(500);
		Kevin.updateFeesPaid(1500);
		Cyrille.updateFeesPaid(1500);
		Cyrille.updateFeesPaid(1250);
		
		// SALARY PAID TO TEACHERS.
		Harry.paySalary();
		Gerda.paySalary();
		Bert.paySalary();
		Bas.paySalary();
		
		// PRINT FULL FINANCE REPORT.
		System.out.println(Huizermaat.toString());
	}

}