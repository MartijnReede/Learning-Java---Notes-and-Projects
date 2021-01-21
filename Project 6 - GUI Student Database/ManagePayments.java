package application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ManagePayments {

static TextField firstName2;	
static TextField lastName2;	
static int managePaymentsIndex;
static private Label notRemoved;

	public static VBox Display() {
		
        Label whatStudent = new Label("For which student would you like to manage payments?");
		
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
			managePaymentsIndex = StudentSearcher.getStudentIndex(firstName2.getText().toLowerCase(), lastName2.getText().toLowerCase());
			
			if (managePaymentsIndex == -1) {
				errorMessage();
			} else {
				managePayments(firstName2.getText(), lastName2.getText(), managePaymentsIndex);
			}
		});
				
		VBox payments = new VBox(10);
		payments.setPadding(new Insets(10,10,10,20));
		payments.getChildren().addAll(whatStudent, name, confirm);
		
		return payments;
	}

	public static void errorMessage() {
		Stage error = new Stage();
		Label notRemoved = new Label("ERROR!!\n\n" + 
				"The student with the name of: \n\n'"
				+ firstName2.getText() + " " + lastName2.getText() + "'\n\n"
				+ "Cannot be found, no payments managable for this student!");
		
		Button close = new Button("Close");
		close.setOnAction(e -> error.close());
		
		VBox errorBox = new VBox(10);
		errorBox.setPadding(new Insets(10,10,10,20));
		errorBox.getChildren().addAll(notRemoved, close);
		
		Scene scene = new Scene(errorBox, 400,200);
		error.setScene(scene);
		error.show();
	}
	
	public static void managePayments(String fn, String ln, int index) {
		
		Label label = new Label("Managing payments of student: " + fn + " " + ln + "\n\n"
				+ "Total depth of this student: $" + Main.getAllStudents().get(index).getClassesNotPayed() + ",-\n\n");
		
		HBox makePay = new HBox(10);
		Label howMuch = new Label("What amount is payed by the student?");
		TextField dollar = new TextField();
		dollar.setPromptText("Amount of $");
		
		makePay.getChildren().addAll(howMuch, dollar);
		
		Button confirm = new Button("Confirm payment");
		
		confirm.setOnAction(e -> receivePayment(dollar, managePaymentsIndex));
				
		VBox updatePayments = new VBox(10);
		updatePayments.setPadding(new Insets(10,10,10,20));
		updatePayments.getChildren().addAll(label, makePay, confirm);
		
		Main.updateMainScreen(updatePayments);
	}
	
	public static void receivePayment(TextField amount , int index) {
		
		int payment;
		
		try {
			payment = Integer.parseInt(amount.getText());
			
			if (payment > Main.getAllStudents().get(index).getClassesNotPayed()) {
				errorMessage(amount.getText(), 3);
			} else {
				Main.getAllStudents().get(index).updateDepth(payment);
				managePayments(firstName2.getText(), lastName2.getText(), managePaymentsIndex);
			}
			
		} catch (Exception e) {
			errorMessage(amount.getText(), 2);
		}
	}
	
	public static void errorMessage(String input, int errorLabel) {
		Stage error = new Stage();
		
			if (errorLabel == 3) {
				notRemoved = new Label("ERROR!!\n\n" + 
					"'$" + input + ",-'\n\n"
					+ "Is more than total depth, enter a smaller amount!");
			}
		
			if (errorLabel == 2) {
				notRemoved = new Label("ERROR!!\n\n" + 
					"'" + input + "'\n\n"
					+ "Is not a number, please enter a number!");
			}
		
		Button close = new Button("Close");
		close.setOnAction(e -> error.close());
		
		VBox errorBox = new VBox(10);
		errorBox.setPadding(new Insets(10,10,10,20));
		errorBox.getChildren().addAll(notRemoved, close);
		
		Scene scene = new Scene(errorBox, 400,175);
		error.setScene(scene);
		error.show();
	}
}
