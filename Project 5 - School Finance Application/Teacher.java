
public class Teacher {

	private String teachName;
	private int teachID;
	private int teachSalary;
	private int totalSalaryPaid;
	
	public Teacher (String teachName, int teachID, int teachSalary) {
		this.teachName = teachName;
		this.teachID = teachID;
		this.teachSalary = teachSalary;
		totalSalaryPaid = 0;
	}
	
	public void paySalary() {
		totalSalaryPaid += teachSalary;
		School.updateSchoolSpend(teachSalary);
	}

	@Override
	public String toString() {
		return "\nID: " + teachID + " Teacher: " + teachName + " Salary: " + teachSalary + " Total salary paid: " + totalSalaryPaid + "\n";
	}
}
