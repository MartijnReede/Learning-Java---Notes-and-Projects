package com.jobready.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.jobready.pma.DAO.ProjectRepository;
import com.jobready.pma.entities.Project;

@Controller
@RequestMapping(value="/projects")
public class ProjectController {
	
	//Because of the autowired annotation, we don't need to instantiate ProjectRepository.
	//Spring is going to inject an object if we need one. 
	@Autowired
	ProjectRepository proRepo;
	
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
		return "projects/new-projects";	
	}
	
	@PostMapping(value = "/save")
	public String createProject(Project project, Model model) {
		//This handles saving to the database. 
		proRepo.save(project);
		
		//We do a redirect because we don't want duplicate submissions.
		return "redirect:/projects/displayprojects";
	}
}
	
