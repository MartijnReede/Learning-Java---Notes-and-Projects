package com.jobready.pma;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.jobready.pma.DAO.EmployeeRepository;
import com.jobready.pma.DAO.ProjectRepository;


@SpringBootApplication
public class ProjectManagementApplication {
	
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
		
	}
				
}