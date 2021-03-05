package Database;

public class DatabaseConnectionManager {

boolean connection;
	
	public DatabaseConnectionManager() {
		connection = true;
	}
	
	public boolean getConnection() {
		return connection;
	}
	
	public void connect() {
		connection = true;
		System.out.println("Connected to the database.");
	}
	
	public void disconnect() {
		connection = false;
		System.out.println("Disconnected from the database.");
	}
}
