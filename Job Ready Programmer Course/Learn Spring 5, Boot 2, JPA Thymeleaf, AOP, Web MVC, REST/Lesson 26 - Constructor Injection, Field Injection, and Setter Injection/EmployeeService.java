package com.jrp.pma.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jobready.pma.DAO.EmployeeRepository;

//There are three types of dependency injection, they are coded below.

//VERY IMPORTANT: If I want the dependency injection to happen, I need to let Spring know
//that this class needs to be scanned. In the classes before, we used annotations like @CrudRepository
//or @Controller. This lets Spring know that these classes needs to be scanned. If I want this class to be
//scanned I can use the @Service annotation because this class represents an EmployeeService. 

//For the field and setter injection, an @Autowired annotation is needed. For a constructor injection this is not. 


@Service
public class EmployeeService {
	
	//Field injection
	@Autowired
	EmployeeRepository empRepo;
	
	//Constructor Injection
	public EmployeeService(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}
	
	//Setter Injection
	@Autowired
	public void setEmpRepo(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}
	
}
