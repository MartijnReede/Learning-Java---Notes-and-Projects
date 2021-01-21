package application;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class InfoOfAllStudents {

	public static void Display() {
		
		Label allInfo = new Label();
		allInfo.setText(Main.getAllStudents().toString());
		
		VBox allInfo2 = new VBox();
		allInfo2.setPadding(new Insets(10,10,10,20));
		allInfo2.getChildren().add(allInfo);
		
		Main.updateMainScreen(allInfo2);
	}
	
}