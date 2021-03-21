package com.jobready.pma.DAO;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jobready.pma.DTO.EmployeeProject;
import com.jobready.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	@Query(nativeQuery=true, 
	value="SELECT e.first_name as firstName, e.last_name as lastName, COUNT(pe.employee_id) as projectCount " + 
	"FROM employee e left join project_employee pe ON pe.employee_id = e.employee_id " +
	"GROUP BY e.first_name, e.last_name ORDER BY 3 DESC")
	public List<EmployeeProject>employeeProjects();

}
