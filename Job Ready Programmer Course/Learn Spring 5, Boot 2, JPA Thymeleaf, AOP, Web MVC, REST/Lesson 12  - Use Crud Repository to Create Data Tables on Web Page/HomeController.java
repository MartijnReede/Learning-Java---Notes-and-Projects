package com.jobready.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jobready.pma.DAO.EmployeeRepository;
import com.jobready.pma.DAO.ProjectRepository;
import com.jobready.pma.entities.Employee;
import com.jobready.pma.entities.Project;

@Controller
public class HomeController {

	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping(value="/")
	public String homePage(Model model) {
		List<Project> projects = (List<Project>) proRepo.findAll();
		model.addAttribute("projectsList", projects);
		List<Employee> employees = (List<Employee>) empRepo.findAll();
		model.addAttribute("employeesList", employees);
		return "home";
	}
}
