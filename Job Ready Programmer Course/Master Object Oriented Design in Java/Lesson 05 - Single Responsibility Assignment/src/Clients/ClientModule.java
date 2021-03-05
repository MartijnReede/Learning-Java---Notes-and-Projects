package Clients;

import DAO.EmployeeDAO;
import Domain.Employee;
import Reporting.EmployeeReportFormatter;
import Reporting.FormatType;

public class ClientModule {

	public static void main(String[] args) {
		Employee emp1 = new Employee(0, "Harry", "Doctor", true);
		hireNewEmployee(emp1);
		printEmployeeReport(emp1);
		terminateEmployee(emp1);
	}
	
	public  static void hireNewEmployee(Employee employee) {
		EmployeeDAO DAO = new EmployeeDAO();
		DAO.saveEmployee(employee);
	}
	
	public static void terminateEmployee(Employee employee) {
		EmployeeDAO DAO = new EmployeeDAO();
		DAO.deleteEmployee(employee);
	}
	
	public static void printEmployeeReport(Employee employee) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, FormatType.XML);
		System.out.println(formatter.getFormattedEmployee());
	}
}

