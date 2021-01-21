package application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InfoOfOneStudent {
	private static int infoIndex;
	private static TextField firstName2;
	private static TextField lastName2;
		
		public static VBox Display() {
			
			Label whatStudent = new Label("About which student would you like to view information?");
			
			Label firstName = new Label("First name: ");
			firstName2 = new TextField();
			firstName2.setPromptText("First name");
				
			Label lastName = new Label("Last name: ");
			lastName2 = new TextField();
			lastName2.setPromptText("Last name");
			
			HBox name = new HBox(10);
			name.getChildren().addAll(firstName, firstName2, lastName, lastName2);
			
			Button confirm = new Button("Confirm");
			confirm.setOnAction(e -> {
				infoIndex = StudentSearcher.getStudentIndex(firstName2.getText().toLowerCase(), lastName2.getText().toLowerCase());
				if (infoIndex == -1) {
					errorMessage();
				} else {
					viewInfo(infoIndex);
				}
				});
						
			VBox info = new VBox(10);
			info.setPadding(new Insets(10,10,10,20));
			info.getChildren().addAll(whatStudent, name, confirm);
				
			return info;
		}
			
		public static void errorMessage() {
			Stage error = new Stage();
			Label notRemoved = new Label("ERROR!!\n\n" + 
					"The student with the name of: \n\n'"
					+ firstName2.getText() + " " + lastName2.getText() + "'\n\n"
					+ "Cannot be found, no information can be shown!");
			
			Button close = new Button("Close");
			close.setOnAction(e -> error.close());
			
			VBox errorBox = new VBox(10);
			errorBox.setPadding(new Insets(10,10,10,20));
			errorBox.getChildren().addAll(notRemoved, close);
			
			Scene scene = new Scene(errorBox, 400,200);
			error.setScene(scene);
			error.show();
		}	
			
			
		public static void viewInfo(int index) {
			Label allInfo = new Label();
			allInfo.setText(Main.getAllStudents().get(index).toString());
				
			VBox allInfo2 = new VBox();
			allInfo2.setPadding(new Insets(10,10,10,20));
			allInfo2.getChildren().add(allInfo);
				
			Main.updateMainScreen(allInfo2);
		}
			
}		