package com.jobready.pma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

//Sometimes there are two objects competing when we ask for a dependency injection. 
//In this package I've created an interface called IStaffRepository. This interface doesn't
//have an annotation to let Spring know that it is part of the Spring Context. 

//I've created two classes who are implementing this interface. Those two classes have the
//@Repository annotation, since they are implemented by a repository interface. When I want to
//have Spring inject an object of the type IStaffRepository, both implementations are available. 
//Spring can not inject both objects into this one field, so we have to let Spring know which one
// to choose. 
	
//There are two ways of doing this:
//1. Use the @Primary annotation in one of the implementations. See example in implementation 1. 
//2. We can use the @Qualifier annotation to specify which object qualifies for this field.

//* We have to choose one of these methods, using them both won't work!
	
	
	//OPTION 1: (see other classes for @Primary annotation.)
	@Autowired
	IStaffRepository empRepo;
	
	//OPTON 2: (Notice the small first letter of implementation 2! We have to do this otherwise it won't work)
	
	IStaffRepository empRepo;
	public EmployeeService(@Qualifier("staffRepoImpl2") IStaffRepository empRepo) {
		this.empRepo = empRepo;
	}
	
	//------
	
	@Autowired
	@Qualifier("staffRepoImpl2")
	IStaffRepository empRepo;
	
	
	//-----
	
	IStaffRepository empRepo;
	
	public void setEmpRepo(@Qualifier("staffRepoImpl2")IStaffRepository empRepo) {
		this.empRepo = empRepo;
	}
}
