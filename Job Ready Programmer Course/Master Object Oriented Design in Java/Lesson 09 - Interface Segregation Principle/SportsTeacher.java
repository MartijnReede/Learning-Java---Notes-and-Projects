package com.jobready.intefaceSegregationPrinciple;

public class SportsTeacher {
	
	SportsStorage storage;
	
	public void prepareWork(SportsStorage aStorage) {
		storage = aStorage;
	}
	
	public void getStuff() {
		storage.getGymAttributes();
	}
}