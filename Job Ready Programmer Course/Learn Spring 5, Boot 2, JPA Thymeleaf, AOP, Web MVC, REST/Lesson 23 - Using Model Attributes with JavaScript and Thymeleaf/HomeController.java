package com.jobready.pma.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jobready.pma.DAO.EmployeeRepository;
import com.jobready.pma.DAO.ProjectRepository;
import com.jobready.pma.DTO.EmployeeProject;
import com.jobready.pma.DTO.ProjectStage;


@Controller
public class HomeController {

	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping(value="/")
	public String homePage(Model model) throws JsonProcessingException {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<ProjectStage> projectStages = proRepo.projectStages();
		model.addAttribute("projectStagesList", projectStages);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = objectMapper.writeValueAsString(projectStages);
		model.addAttribute("chartData", jsonString);
		
		
		List<EmployeeProject> employeesProjects = empRepo.employeeProjects();
		model.addAttribute("employeesProjectsList", employeesProjects);
		
		return "home/home";
	}
}
