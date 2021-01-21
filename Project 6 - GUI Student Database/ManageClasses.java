package application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ManageClasses {

static TextField firstName2;
static TextField lastName2;
static int manageClassesIndex;
private static Label notRemoved;
	
	public static VBox Display() {
		
		Label whatStudent = new Label("For which student would you like to manage classes?");
		
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
			manageClassesIndex = StudentSearcher.getStudentIndex(firstName2.getText().toLowerCase(), lastName2.getText().toLowerCase());
			if (manageClassesIndex == -1) {
				errorMessage(1);
			} else {
				enrollForClass(firstName2.getText(), firstName2.getText(), manageClassesIndex);
			}
			});
				
		VBox searchStudentManageClasses = new VBox(10);
		searchStudentManageClasses.getChildren().addAll(whatStudent, name, confirm);
		searchStudentManageClasses.setPadding(new Insets(10,10,10,20));
		
		return searchStudentManageClasses;
	}
	
	private static void enrollForClass(String fn, String ln, int index) {
		
		Label enrollingIntro = new Label();
	
		enrollingIntro.setText(
			"You are managing classes of student: " + firstName2.getText() + " " + lastName2.getText() + ".\n\n" +
			"This student has enrolled for: \n" + message(index) +
						
			"\nCurrent dept of this student is:  $ " + Main.getAllStudents().get(index).getClassesNotPayed() + ",-\n\n" + 
				
			"Please select a class below. Each class costs 600$."
		);
		
		ComboBox<String> classes = new ComboBox<String>();
		classes.getItems().addAll("Programming", "Game Development", "Science", "Mathematics", "App Design");
		classes.setValue("Programming");
		
		Button enroll = new Button("Enroll for this class");
		enroll.setMinSize(250, 30);
		
		Button delete = new Button("Remove from enrolled class(es)");
		delete.setMinSize(250, 30);
		
		VBox enrollForClass = new VBox(10);
		enrollForClass.setPadding(new Insets(10,10,10,20));
		enrollForClass.getChildren().addAll(enrollingIntro, classes, enroll, delete);
		
		enroll.setOnAction(e -> {
			for (String cls : Main.getAllStudents().get(manageClassesIndex).getEnrolledClasses()) {
				if (cls.equals(classes.getValue())) {
					errorMessage(3);
				return;	
				}
			}
			
			Main.updateClasses(classes.getValue(), manageClassesIndex);
			Main.getAllStudents().get(index).increaseClassesNotPayed();
			enrollForClass(firstName2.getText(), firstName2.getText(), manageClassesIndex);
		});
		
		delete.setOnAction(e -> {
			removeClass(classes.getValue(), manageClassesIndex);	
	    });
		
		Main.updateMainScreen(enrollForClass);
	}
	
	public static String message(int index) {
		
		String message = "-\n";
		
		for (String rolledClass : Main.getAllStudents().get(index).getEnrolledClasses()) {
			message += rolledClass + "\n";
		}
		
		message += "-\n";
		return message;
	}
	
	public static void removeClass(String selectedClass, int indexnr) {
		
		int count = 0;
		
		for (String classes : Main.getAllStudents().get(indexnr).getEnrolledClasses()) {
			if (classes.equals(selectedClass)) {
				Main.getAllStudents().get(indexnr).getEnrolledClasses().remove(count);
				Main.getAllStudents().get(indexnr).decreaseClassesNotPayed();
				enrollForClass(firstName2.getText(), firstName2.getText(), manageClassesIndex);
				return;
			} 
			count++;
		}
		
		errorMessage(2);
	}
	
	private static void errorMessage(int errorLabel) {
		Stage error = new Stage();
		
		if (errorLabel == 3) {
			notRemoved = new Label("ERROR!!\n\n" + 
				"The student is allready enrolled for this class.\n" +
				"Please try again!");
		}
		
		if (errorLabel == 2) {
			notRemoved = new Label("ERROR!!\n\n" + 
				"The student was not enrolled for the class you are trying to remove.\n" +
				"Please try again!");
		}
		
		if (errorLabel == 1) {
			notRemoved = new Label("ERROR!!\n\n" + 
				"The student with the name of: \n\n'"
				+ firstName2.getText() + " " + lastName2.getText() + "'\n\n"
				+ "Cannot be found, no classes managable for this student!");
		}
			
		Button close = new Button("Close");
		close.setOnAction(e -> error.close());
		
		VBox errorBox = new VBox(10);
		errorBox.setPadding(new Insets(10,10,10,20));
		errorBox.getChildren().addAll(notRemoved, close);
		
		Scene scene = new Scene(errorBox, 450,180);
		error.setScene(scene);
		error.show();
	}
}
