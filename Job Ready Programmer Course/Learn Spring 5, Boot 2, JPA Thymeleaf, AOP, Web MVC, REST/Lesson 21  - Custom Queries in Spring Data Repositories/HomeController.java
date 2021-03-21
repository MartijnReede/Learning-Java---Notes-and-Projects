package com.jobready.pma.controllers;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.jobready.pma.DAO.EmployeeRepository;
import com.jobready.pma.DAO.ProjectRepository;
import com.jobready.pma.DTO.EmployeeProject;
import com.jobready.pma.DTO.ProjectStage;
import com.jobready.pma.entities.Project;

@Controller
public class HomeController {

	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping(value="/")
	public String homePage(Model model) {
		
		List<ProjectStage> projectStages = proRepo.projectStages();
		model.addAttribute("projectStagesList", projectStages);
		
		List<EmployeeProject> employeesProjects = empRepo.employeeProjects();
		model.addAttribute("employeesProjectsList", employeesProjects);
		
		return "home/home";
	}
}
