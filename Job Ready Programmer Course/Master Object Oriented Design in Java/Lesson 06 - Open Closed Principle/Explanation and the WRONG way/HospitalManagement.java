package com.jobready.openClosed;

public class HospitalManagement {
	
	public void callUpon(Employee employee) {
		if (employee instanceof Nurse) {
			checkVitalSigns();
			drawBlood();
			cleanPatientArea();
		} else if (employee instanceof Doctor) {
			prescribeMedicine();
			diagnosePatient();
		}
	}
	
	//Nurses
	private void checkVitalSigns() {
		System.out.println("Checking vital signs...");
	}
	
	private void drawBlood() {
		System.out.println("Drawing blood...");
	}
	
	private void cleanPatientArea() {
		System.out.println("Cleaning patient area...");
	}
	
	//Doctors
	private void prescribeMedicine() {
		System.out.println("Prescribing Medicine...");
	}
	
	private void diagnosePatient() {
		System.out.println("Diagnose patient....");
	}
	
}
