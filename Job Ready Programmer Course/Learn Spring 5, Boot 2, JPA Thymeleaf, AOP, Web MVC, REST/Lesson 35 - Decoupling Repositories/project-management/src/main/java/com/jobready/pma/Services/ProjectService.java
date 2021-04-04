package com.jobready.pma.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobready.pma.DAO.ProjectRepository;
import com.jobready.pma.DTO.ProjectStage;
import com.jobready.pma.entities.Project;

@Service
public class ProjectService {

		@Autowired
		ProjectRepository proRepo;
		
		public List<Project> findAll(){
			return (List<Project>) proRepo.findAll();
		}
		
		public void save(Project project) {
			proRepo.save(project);
		}
		
		public List<ProjectStage> projectStages(){
			return proRepo.projectStages();
		}
}
