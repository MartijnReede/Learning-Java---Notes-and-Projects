package com.jobready.pma.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobready.pma.DAO.EmployeeRepository;
import com.jobready.pma.DTO.EmployeeProject;
import com.jobready.pma.entities.Employee;

@Service
public class EmployeeService {

	@Autowired 
	EmployeeRepository empRepo;
	
	public List<Employee> findAll(){
		return (List<Employee>) empRepo.findAll();
	}
	
	public void save(Employee employee) {
		empRepo.save(employee);
	}
	
	public List<EmployeeProject> employeeProjects(){
		return empRepo.employeeProjects();
	}
}
