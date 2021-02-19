package com.jobready.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

private static Connection connection;	
private static int totalSalary;
	
	public static void main(String[] args) {
		
		//In this class we're going to connect with the database and retrieve results from it. 
		
		// ******** SETTING UP THE CONNECTION *******
		
		// 1. First we have to add the connector JAR file to the classpath.
		//		- Create a new folder inside of the java project named "lib".
		//		- Copy the driver JAR file into the lib.
		//		- Go to properties --> build path --> libraries --> class path --> add external JARs.
		//		- Select the driver downloaded from the corresponding vendor in the lib folder.
		// 2. Create an url to set up the connection. 
		// 3. Set username and password.
		// 4. Connect to database with DriverManager.
		
		//ServerInfo: Can be found when opening MySql Workbench. It is the IP-address (127.0.0.1) and the port number (3306). 
		String serverInfo = "127.0.0.1:3306";
		
		//DatabaseName: Name of the database that is created in MySql workbench. 
		String databaseName = "employees_database";
		
		//Complete url is:
		String url =  "jdbc:mysql://" + serverInfo + "/" + databaseName; 
		
		//Set username. This is the username that is used to log into the database in MySql workbench. 
		String username = "root";
		
		//Set password. This is the password that  is used to log into the database in MySql workbench. 
		String password = "12Amsterdam!";	
		
		//Connect to database and establish connection object. 
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("Connection to database failed..." +  e);
		}
		
		// ******** COMMUNICATE WITH DATABASE *******
		
		// 1. To communicate with the database we use the Statement class. 
		// 2. Create the statement.
		// 3. Create a ResultSet (to handle the returned information from the query).
		// 4. Execute the statement, insert a query.
		// 5. Process the data with for example a while loop. 
		
		try {
			//Create statement.
			Statement stmt = connection.createStatement();
			
			//Execute statement with query.
			ResultSet rs = stmt.executeQuery("SELECT * FROM employees_tbl");
		
			//Process the data. We have to enter the column name. 
			//Example: get the total salary of all the employees.
			
			totalSalary = 0;
			
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("salary"));
				totalSalary += rs.getInt("salary");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} 
		
		//Print out total salary.
		System.out.println("Total salary of all employees: " + totalSalary + "euro.");
		

	}

}
