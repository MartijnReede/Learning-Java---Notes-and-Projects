package com.jobready.openClosePrincipleCorrect;

public class Nurse extends Employee {

	public Nurse(int id, String name, String department, boolean working) {
		super(id, name, department, working);
	}
	
	private void drawBlood() {
		System.out.println("Drawing blood...");
	}
	
	private void cleaningPatientArea() {
		System.out.println("Cleaning patient area...");
	}
	
	private void checkingVitalsOnPatient() {
		System.out.println("Checking patient vitals....");
	}

	@Override
	public void doWork() {
		drawBlood();
		cleaningPatientArea();
		checkingVitalsOnPatient();	
	}

	
	
}
