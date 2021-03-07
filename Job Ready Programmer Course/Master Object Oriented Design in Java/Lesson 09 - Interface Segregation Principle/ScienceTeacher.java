package com.jobready.intefaceSegregationPrinciple;

public class ScienceTeacher {

	ScienceStorage storage;
	
	public void prepareWork(ScienceStorage aStorage) {
		storage = aStorage;
	}
	
	public void getStuff() {
		storage.getChemicals();
		storage.getGlassBottles();
	}
}
