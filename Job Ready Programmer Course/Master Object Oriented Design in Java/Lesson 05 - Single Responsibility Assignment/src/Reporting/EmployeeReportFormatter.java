package Reporting;

import Domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

	public EmployeeReportFormatter(Employee employee, FormatType type) {
		super(employee, type);
	
	}

	public String getFormattedEmployee() {
		return getFormattedValue();
	}
}
