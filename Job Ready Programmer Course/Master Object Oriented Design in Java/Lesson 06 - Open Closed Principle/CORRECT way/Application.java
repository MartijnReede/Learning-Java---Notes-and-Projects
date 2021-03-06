package com.jobready.openClosePrincipleCorrect;

public class Application {

	public static void main(String[] args) {
		
		//Now the HospitalManager has a lot less responsibility, it doesn't have to know what exactly each employee does.
		//Now it is open for extension and closed for modification.
		
		HospitalManager manager = new HospitalManager();
		Employee peggy = new Nurse(1, "Peggy", "Emergency", true);
		Employee harry = new Doctor(2, "Harry", "Intensive Care", true);
		
		manager.callOnEmployee(peggy);
		manager.callOnEmployee(harry);
	}

}
