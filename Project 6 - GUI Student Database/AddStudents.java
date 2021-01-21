package application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AddStudents {

	private static TextField amount;
	private static int amountOfStudents;
	private static int enteredStudents;
	private static TextField firstName2;
	private static TextField lastName2;
	private static ComboBox<String> grade2;
	private static int IDcounter = 0;

		public static VBox display() {
			
			// RESET OF VARIABLES.
			amountOfStudents = 0;
			enteredStudents = 1;
			
			// ENTER AMOUNT OF STUDENTS SCREEN.
			VBox addStudentsScreen = new VBox(10);
			addStudentsScreen.setPadding(new Insets(10,10,10,20));
			
			Label howMany = new Label("How many students would you like to add?");

			amount = new TextField();
			amount.setPromptText("Amount of students");
			amount.setPrefWidth(200);
			amount.setMaxWidth(200);
			
			Button confirm = new Button("Confirm");
			confirm.setOnAction(e -> checkAmount());
			
			addStudentsScreen.getChildren().addAll(howMany, amount, confirm);
			
			return addStudentsScreen;
		}
		
		public static void checkAmount() {
			
			//CHECKS IF INPUT IS AN INTEGER.
			try {
				amountOfStudents = Integer.parseInt(amount.getText());
				addStudent();
			
			} catch (Exception e) {
				Stage error = new Stage();
				
				Label errorLabel = new Label("ERROR!\n\n'" + amount.getText() +"'\n\nIs not a number, please insert a number!");
				Button errorButton = new Button("Close window");
				errorButton.setOnAction(f -> error.close());
				
				VBox errorLayout = new VBox(10);
				errorLayout.setPadding(new Insets(10,10,10,10));
				errorLayout.getChildren().addAll(errorLabel, errorButton);
				
				Scene errorScene = new Scene(errorLayout, 300,150);
				error.setScene(errorScene);
				error.show();
			}
		}
		
		public static void addStudent() {
			
			// INTRO LABEL.
			Label intro = new Label("Student " + enteredStudents + " of " + amountOfStudents + ".\n\n");
			intro.setFont(new Font ("Helvatica", 12));
			
			// NAME INPUT.
			HBox names = new HBox(10);
		
			Label firstName = new Label("First name: ");
			firstName2 = new TextField();
			firstName2.setPromptText("First name");
			
			Label lastName = new Label("Last name: ");
			lastName2 = new TextField();
			lastName2.setPromptText("Last name");
			
			names.getChildren().addAll(firstName, firstName2, lastName, lastName2);
			
			// GRADE INOPUT.
			Label grade = new Label("\nSelect the grade of the student.");
			grade2 = new ComboBox<>();
			grade2.getItems().addAll("Freshmen", "Sophmore", "Junior", "Senior");
			grade2.setValue("Freshmen");
		
			// CONFIRM BUTTON.
			Label emptySpace = new Label("\n");
			Button confirm2 = new Button("Confirm");
			confirm2.setOnAction(g -> receiveStudentData());
			
			VBox addingStudents = new VBox(10);
			addingStudents.setPadding(new Insets(10,10,10,20));
			addingStudents.getChildren().addAll(intro, names, grade, grade2, emptySpace, confirm2);
			
			Main.updateMainScreen(addingStudents);	
		}
		
		public static void receiveStudentData() {
				
			//PROCESSING USER INPUT.
			Student student = new Student();
			student.setFirstName(firstName2.getText());
			student.setLastName(lastName2.getText());
			student.setGrade(grade2.getValue());
			student.setUniqueID(uniqueIDGenerator(grade2.getValue()));
				
			Main.addStudent(student);
				
			if (enteredStudents == amountOfStudents) {
				addingComplete();
			} else {
				enteredStudents += 1;
				addStudent();
			}
		}
		
		public static void addingComplete() {
			
			// ADDING COMPLETE SCREEN.
			Label complete2 = new Label("All students are added to the database!");
			complete2.setFont(new Font("Helvatica", 12));
			
			VBox complete3 = new VBox(10);
			complete3.setPadding(new Insets(10,10,10,20));
			complete3.getChildren().add(complete2);
			
			Main.updateMainScreen(complete3);	
		}
		
		public static int uniqueIDGenerator(String grade) {
			
			int year = 0;
			
			if (grade.equals("Freshmen")) {
				year = 1;
			} else if	(grade.equals("Sophmore")){
				year = 2;
			} else if (grade.equals("Junior")) {
				year = 3;
			} else if (grade.equals("Senior")) {
				year = 4;
			}
			
			int studentID = (year * 10000) + IDcounter;
			IDcounter += 1;
			
			return studentID;
		}	
}	