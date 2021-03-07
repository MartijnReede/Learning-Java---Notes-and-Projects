package com.jobready.intefaceSegregationPrinciple;

public class SchoolStorage implements ScienceStorage, SportsStorage {
	
	@Override
	public void getGlassBottles() {
		System.out.println("Getting glass bottles");
	}
	
	@Override
	public void getChemicals() {
		System.out.println("Getting chemicals");
	}
	
	@Override
	public void getGymAttributes() {
		System.out.println("Getting gym attributes");
	}
}
