package application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RemoveStudents {

private static int removeIndex;	
private static TextField firstName2;
private static TextField lastName2;

	public static VBox Display(){
		
		Label removeWho = new Label("Which student would you like to remove from the database?");
		
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
		
		removeIndex = StudentSearcher.getStudentIndex(firstName2.getText().toLowerCase(), lastName2.getText().toLowerCase());
		if (removeIndex == -1) {
			errorMessage();
		} else {
			Main.removeStudent(removeIndex);
			removingComplete();
		}
		});
		
		VBox whatStudent = new VBox(10);
		whatStudent.setPadding(new Insets(10,10,10,20));
		whatStudent.getChildren().addAll(removeWho, name, confirm);
		
		return whatStudent;
		
		}
	
		public static void errorMessage() {
			
			Stage error = new Stage();
			Label notRemoved = new Label("ERROR!!\n\n" + 
					"The student with the name of: \n\n'"
					+ firstName2.getText() + " " + lastName2.getText() + "'\n\n"
					+ "Cannot be found, the student is not removed from the database!");
			
			Button close = new Button("Close");
			close.setOnAction(e -> error.close());
			
			VBox errorBox = new VBox(10);
			errorBox.setPadding(new Insets(10,10,10,20));
			errorBox.getChildren().addAll(notRemoved, close);
			
			Scene scene = new Scene(errorBox, 400,200);
			error.setScene(scene);
			error.show();
		}
		
		public static void removingComplete() {
			
			Label complete2 = new Label("Student removed!");
			complete2.setFont(new Font("Helvatica", 12));
			
			VBox complete3 = new VBox(10);
			complete3.setPadding(new Insets(10,10,10,20));
			complete3.getChildren().add(complete2);
			
			Main.updateMainScreen(complete3);
		}
}
