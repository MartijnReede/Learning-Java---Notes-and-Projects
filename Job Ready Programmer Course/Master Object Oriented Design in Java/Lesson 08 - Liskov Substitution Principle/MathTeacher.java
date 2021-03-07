package com.jobready.liskovSubstitutionPrinciple;

public class MathTeacher extends SchoolStaff implements Teacher {

	@Override
	public void teach() {
		System.out.println("Teaching math..");
	}

}
