package com.jobready.liskovSubstitutionPrinciple;

public class ScienceTeacher extends SchoolStaff implements Teacher {

	@Override
	public void teach() {
		System.out.println("Teacher science...");
		
	}

}
