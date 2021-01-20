import java.util.List;

public class School {
	
	private List<Student> students;
	private List<Teacher> teachers;
	private static int schoolIncome;
	private static int schoolSpend;
	private static int schoolBalance;
	private static int schoolFeesStillExpected;	
	
	public School (List<Student>students, List<Teacher>teachers) {
		this.students = students;
		this.teachers = teachers;
		schoolIncome = 0;
		schoolSpend = 0;
		schoolBalance = 0;			
	}
	
	public static void updateSchoolMoneyNotYetReceived(int amount) {
		schoolFeesStillExpected += amount;
	}
	
	public static void updateSchoolIncome(int amount) {
		schoolIncome +=amount;
		schoolBalance +=amount;
		schoolFeesStillExpected -=amount;
	}
	
	public static void updateSchoolSpend(int amount) {
		schoolSpend +=amount;
		schoolBalance -=amount;
	}

	@Override
	public String toString() {
		return "----- HUIZERMAAT FULL FINANCE REPORT -----\n\n" + 
			   "Total income: " + schoolIncome + "\n" +
			   "Total amount spent: " + schoolSpend + "\n" +
			   "Balance bank account: " + schoolBalance + "\n" +
			   "Fees still expected: " + schoolFeesStillExpected + "\n\n" +
			   "----- STUDENTS -----\n" +
			   students +
			   "\n\n----- TEACHERS -----\n" +
			   teachers + 
			   "\n----- END OF REPORT -----"
			   + "";
	}	
}
