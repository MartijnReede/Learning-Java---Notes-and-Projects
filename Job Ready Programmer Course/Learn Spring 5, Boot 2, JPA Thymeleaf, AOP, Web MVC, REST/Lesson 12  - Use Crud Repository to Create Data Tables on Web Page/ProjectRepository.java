package com.jobready.pma.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jobready.pma.entities.Project;

//We need this to be an Interface. This is a mechanism to access data in the database. 
//DAO stands for Data Access Object. 
//This needs to be a CRUD repository, so we need to extend this interface with CrudRepository.

public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	//<Project stands for the records that we're going to add to the database>
	//<Long stands for the type of the id. Notice that we use the Long class, not the primitive data type>

	//If we need to, we can write our own methods in here, but we have access to multiple default methods.
	


}
