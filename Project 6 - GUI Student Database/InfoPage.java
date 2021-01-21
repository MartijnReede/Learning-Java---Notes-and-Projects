package application;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class InfoPage {
	
	public static VBox Display() {
		
		Label appInfo = new Label();
		appInfo.setText("MADE BY: \n\n- Martijn Reede\n\n"
				+ "MY GOALS FOR THIS STUDENT DATATBASE: \n\n"
				+ "- Make it possible to add students to the database.\n"
				+ "- Generate a unique ID for the students, starting with a number that refers to the grade of the student.\n"
				+ "- Make it possible to remove students from the database.\n"
				+ "- Manage classes for students.\n"
				+ "- Manage payments for students.\n"
				+ "- View information about a single student.\n"
				+ "- View information about all students.\n"
				+ "- Only accept correct data from the users and inform them when this is not the case.\n\n");
				
		
		VBox info = new VBox(10);
		info.setPadding(new Insets(10,10,10,20));
		info.getChildren().add(appInfo);
		
		return info;
	}
}
