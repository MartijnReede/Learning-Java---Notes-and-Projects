package com.jobready.pma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobready.pma.entities.Project;

@Controller
@RequestMapping(value="/projects")
public class ProjectController {
	
	//@GetMapping and @PostMapping is way easier than RequestMapping method = RequestMapping.GET
	@GetMapping(value ="/new")
	public String displayProjectForm(Model model) {
		Project aProject = new Project();
		model.addAttribute("project", aProject);
		return "new-projects";	
	}
	
	@PostMapping(value = "/save")
	public String createProject(Project project, Model model) {
		//This should handle saving to the database. 
		return "";
	}
}
	
