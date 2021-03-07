package com.jobready.liskovSubstitutionPrinciple;

public class SchoolStaff {
	
	public void doWork() {
		doPaperwork();
		monitorHallways();
	}
	
	private void doPaperwork() {
		System.out.println("Doing some paperwork...");
	}
	
	private void monitorHallways() {
		System.out.println("Monitoring the hallway...");
	}
	
}
