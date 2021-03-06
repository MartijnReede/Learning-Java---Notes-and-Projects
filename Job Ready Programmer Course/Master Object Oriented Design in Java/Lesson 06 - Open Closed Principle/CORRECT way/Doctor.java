package com.jobready.openClosePrincipleCorrect;

public class Doctor extends Employee {

	public Doctor(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		// TODO Auto-generated constructor stub
	}
	
	private void treatPatient() {
		System.out.println("Treating patient....");
	}
	
	private void examinePatient() {
		System.out.println("Examine patient...");
	}

	@Override
	public void doWork() {
		treatPatient();
		examinePatient();
		
	}
	
	
}
