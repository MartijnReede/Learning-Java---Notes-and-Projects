package DAO;

import Database.DatabaseConnectionManager;
import Domain.Employee;

public class EmployeeDAO {

//DAO stands for data access object.	
	

	
	public void saveEmployee(Employee employee) {
		DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
		connectionManager.connect();
		connectionManager.getConnection(); //.prepareStatement("INSERT INTO employee_tbl" etc)...
		System.out.println("Saved employee: " + employee);
		connectionManager.disconnect();
		System.out.println("------------------");
		
	}
	
	public void deleteEmployee(Employee employee) {
		DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
		connectionManager.connect();
		connectionManager.getConnection(); //.prepareStatement("DELETE FROM employee_tbl" etc)...
		System.out.println("Removed employee: " + employee);
		connectionManager.disconnect();
		System.out.println("-----------------");
		
	}
}
