package com.jobready.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobready.pma.Services.EmployeeService;
import com.jobready.pma.entities.Employee;

@Controller
@RequestMapping(value="/employees")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/displayemployees")
	public String displayEmployees(Model model) {
		List<Employee> employeesList = empService.findAll();
		model.addAttribute("employeesList", employeesList);
		return "employees/list-employees";
	}
	
	@GetMapping("/new")
	public String newEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "employees/new-employees";
	}
	
	@PostMapping("/save")
	public String saveEmployee(Employee employee) {
		empService.save(employee);
		return "redirect:/employees/displayemployees";
	}
	
	
	
}
