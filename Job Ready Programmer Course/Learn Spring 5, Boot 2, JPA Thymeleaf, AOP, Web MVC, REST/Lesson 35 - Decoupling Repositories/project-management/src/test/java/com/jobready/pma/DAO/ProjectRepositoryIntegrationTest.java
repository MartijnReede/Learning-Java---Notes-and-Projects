package com.jobready.pma.DAO;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;

import com.jobready.pma.DAO.ProjectRepository;
import com.jobready.pma.entities.Project;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProjectRepositoryIntegrationTest {

		@Autowired
		ProjectRepository proRepo;
		
		@Test 
		public void ifNewProjectSaved_thenSuccess() {
			Project newProject = new Project("New test project", "COMPLETE", "Some interesting project.");
			proRepo.save(newProject);
			
			List<Project> projects = (List<Project>) proRepo.findAll();
			
			assertEquals(1, projects.size());
		}
}
