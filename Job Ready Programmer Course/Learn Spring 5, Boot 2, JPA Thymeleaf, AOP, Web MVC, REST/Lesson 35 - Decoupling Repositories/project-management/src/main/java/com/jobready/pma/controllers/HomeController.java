package com.jobready.pma.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jobready.pma.DTO.EmployeeProject;
import com.jobready.pma.DTO.ProjectStage;
import com.jobready.pma.Services.EmployeeService;
import com.jobready.pma.Services.ProjectService;


@Controller
public class HomeController {
	
	@Value("${version}")
	private String ver;
	
	@Autowired
	ProjectService proService;
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping(value="/")
	public String homePage(Model model) throws JsonProcessingException {
		
		model.addAttribute("versionNumber", ver);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<ProjectStage> projectStages = proService.projectStages();
		model.addAttribute("projectStagesList", projectStages);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = objectMapper.writeValueAsString(projectStages);
		model.addAttribute("chartData", jsonString);
		
		
		List<EmployeeProject> employeesProjects = empService.employeeProjects();
		model.addAttribute("employeesProjectsList", employeesProjects);
		
		return "home/home";
	}
}
