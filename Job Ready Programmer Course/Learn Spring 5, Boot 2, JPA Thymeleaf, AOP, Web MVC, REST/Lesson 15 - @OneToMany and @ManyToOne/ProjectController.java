package com.jobready.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jobready.pma.DAO.EmployeeRepository;
import com.jobready.pma.DAO.ProjectRepository;
import com.jobready.pma.entities.Employee;
import com.jobready.pma.entities.Project;

@Controller
@RequestMapping(value="/projects")
public class ProjectController {
	
	//Because of the autowired annotation, we don't need to instantiate ProjectRepository.
	//Spring is going to inject an object if we need one. 
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping(value="/displayprojects")
	public String displayProjects(Model model) {
		List<Project> projectsList = (List<Project>) proRepo.findAll();
		model.addAttribute("projectsList", projectsList);
		return "projects/list-projects";
	}
	
	//@GetMapping and @PostMapping is way easier than RequestMapping method = RequestMapping.GET
	@GetMapping(value ="/new")
	public String displayProjectForm(Model model) {
		Project aProject = new Project();
		model.addAttribute("project", aProject);
		List<Employee> employees = (List<Employee>) empRepo.findAll();
		model.addAttribute("employees", employees);
		return "projects/new-projects";	
	}
	
	//To see which RequestParam name we need for handling the employeeId's we can go to the developers
	//page in google chrome. Fill in the form and go to headers.
	@PostMapping(value = "/save")
	public String createProject(Project project, @RequestParam List<Long> employees, Model model) {
		//This handles saving to the database. 
		proRepo.save(project);
		
		List<Employee> chosenEmployees = (List<Employee>) empRepo.findAllById(employees);
		for (Employee employee : chosenEmployees) {
			employee.setTheProject(project);
			empRepo.save(employee);
		}
		//We do a redirect because we don't want duplicate submissions.
		return "redirect:/projects/displayprojects";
	}
}
	
