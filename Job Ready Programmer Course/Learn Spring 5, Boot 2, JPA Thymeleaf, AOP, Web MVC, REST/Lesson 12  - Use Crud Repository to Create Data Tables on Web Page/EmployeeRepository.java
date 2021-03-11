package com.jobready.pma.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jobready.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {


}
