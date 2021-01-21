package application;
	
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Main extends Application {

	private static Stage window;	
	private static BorderPane mainScreen;
	private static List<Student> allStudents;

		public static void main(String[] args) {
			
			launch(args);
		}
		
		public void start(Stage window) throws Exception {
			
			Main.window = window;
			allStudents = new ArrayList<Student>();
			
			// TOP MENU
			
			
			Label topText = new Label("                                                                                  STUDENT DATABASE                                                               ");
			topText.setPadding(new Insets(10,10,10,10));
			topText.setFont(new Font("Helvatica", 20));
			
			Button info = new Button("App info");
			info.setOnAction(e -> mainScreen.setCenter(InfoPage.Display()));
			
			HBox topView = new HBox(10);
			topView.setPadding(new Insets(10,10,10,10));
			topView.getChildren().addAll(topText, info);
		
			// LEFT MENU
			VBox menu = new VBox(10);
			menu.setPadding(new Insets(10,10,10,10));
			
			Button but1 = new Button("Add students");
			but1.setMinSize(150, 51);
			but1.setOnAction(e -> mainScreen.setCenter(AddStudents.display()));
			
			Button but2 = new Button("Remove student");
			but2.setMinSize(150, 51);
			but2.setOnAction(e -> mainScreen.setCenter(RemoveStudents.Display()));
			
			Button but3 = new Button("Manage Classes");
			but3.setMinSize(150, 51);
			but3.setOnAction(e -> mainScreen.setCenter(ManageClasses.Display()));
			
			Button but4 = new Button("Manage Payments");
			but4.setMinSize(150, 51);
			but4.setOnAction(e -> mainScreen.setCenter(ManagePayments.Display()));
			
			Button but5 = new Button("Info of single student");
			but5.setMinSize(150, 51);
			but5.setOnAction(e -> mainScreen.setCenter(InfoOfOneStudent.Display()));
			
			Button but6 = new Button("Info of all students");
			but6.setMinSize(150, 51);
			but6.setOnAction(e -> InfoOfAllStudents.Display());
			
			Button but7 = new Button("Exit the program");
			but7.setMinSize(150, 51);
			but7.setOnAction(e -> exitTheProgram());
			
			menu.getChildren().addAll(but1,but2,but3,but4,but5,but6,but7);
			
			// BORDERPANE LAYOUT
			mainScreen = new BorderPane();
			mainScreen.setTop(topView);
			mainScreen.setLeft(menu);
			
			Scene mainScene = new Scene(mainScreen, 1100,520);
			
			window.setScene(mainScene);
			window.setResizable(false);
			window.setTitle("Student Database");
			window.show();
			}
			
			public static void updateMainScreen(VBox center) {
				mainScreen.setCenter(center);
			}
		
			public static void addStudent(Student student) {
				allStudents.add(student);
			}
			
			public static List<Student> getAllStudents() {
				return allStudents;
			}
			
			public static void removeStudent(int index) {
				allStudents.remove(index);
			}
			
			public static void updateClasses(String selectedClass, int index) {
				allStudents.get(index).updateEnrolledClasses(selectedClass);
			}

			public static void exitTheProgram() {
				Label exitMessage = new Label("ARE YOU SURE?\n\n" + "All data will be lost!!!\n\n");
				
				Button yes = new Button("YES!");
				yes.setOnAction(e -> window.close());
				
				VBox exit = new VBox(10);
				exit.getChildren().addAll(exitMessage, yes);
				exit.setPadding(new Insets(10,10,10,20));
		
				mainScreen.setCenter(exit);
			}		
	}
