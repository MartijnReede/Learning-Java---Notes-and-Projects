package com.jobready.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobready.pma.DAO.EmployeeRepository;
import com.jobready.pma.entities.Employee;

@Controller
@RequestMapping(value="/employees")
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/new")
	public String newEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "new-employees";
	}
	
	@PostMapping("/save")
	public String saveEmployee(Employee employee) {
		empRepo.save(employee);
		return "redirect:/employees/new";
	}
	
	
	
}
