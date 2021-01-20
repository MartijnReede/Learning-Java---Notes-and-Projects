
public class Student {

	private String studName;
	private int studID;
	private int feesTotal; 
	private int feesPaid;
	private int feesRemaining;
	
	public Student(String studName, int studID, int feesTotal) {
		this.studName = studName;
		this.studID = studID;
		this.feesTotal = feesTotal;
		feesPaid = 0;
		feesRemaining = feesTotal;
		School.updateSchoolMoneyNotYetReceived(feesTotal);
	}
	
	public void updateFeesPaid(int amountPaid) {
		feesPaid += amountPaid;
		feesRemaining -= amountPaid;
		School.updateSchoolIncome(amountPaid);
	}
	
	public int getFeesRemaining() {
		return feesRemaining;
	}

	@Override
	public String toString() {
		return "\nID: " + studID + " Student: " + studName + " Total fees: " + feesTotal + " Paid: " + feesPaid + " Fees remaining: " + feesRemaining + "\n";
	}
}
