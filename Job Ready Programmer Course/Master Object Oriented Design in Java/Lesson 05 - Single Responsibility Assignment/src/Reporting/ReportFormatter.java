package Reporting;

public class ReportFormatter {

	String formattedOutput;
	
	public ReportFormatter(Object object, FormatType type) {
		
		switch(type) {
		case XML: 
			formattedOutput = convertObjectToXML(object);
			break;
		case CSV:
			formattedOutput = convertObjectToCSV(object);
		}
	}
	
	private String convertObjectToXML(Object object) {
		return "XML : <title>" + object.toString() + "</title>";
	}
	
	private String convertObjectToCSV(Object object) {
		return "CSV : <title>" + object.toString() + "</title>";
	}
	
	protected String getFormattedValue() {
		return formattedOutput;
	}
}
