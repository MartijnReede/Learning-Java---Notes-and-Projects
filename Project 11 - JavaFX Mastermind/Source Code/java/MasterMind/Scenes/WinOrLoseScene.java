package MasterMind.Scenes;

import MasterMind.GameRunner.GameRunner;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class WinOrLoseScene {

	public WinOrLoseScene(String text, GameRunner gameRunner) {
		
		Stage stage = new Stage();
		Font fontYouWin = Font.font("Verdana", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30);
		Font fontOK = Font.font("Verdana", FontWeight.EXTRA_BOLD, 15);
		
		Label label = new Label(text);
		label.setFont(fontYouWin);
		label.setPadding(new Insets(17, 0, 0, 28));
		
		Button button = new Button("OK");
		button.setOnAction(e -> {stage.close(); gameRunner.welcomeScreen();});
		button.setFont(fontOK);
		button.setStyle("-fx-background-color: black; -fx-text-fill: white;");
		button.setLayoutX(100);
		button.setLayoutY(70);
		
		Pane pane = new Pane();
		pane.setMinHeight(250);
		pane.setMinWidth(250);
		pane.setStyle("-fx-background-color: lightGray");
		pane.getChildren().add(label);
		pane.getChildren().add(button);
		
		stage.setOnCloseRequest(e -> {stage.close(); gameRunner.welcomeScreen();});
		
		Scene winningScene = new Scene(pane, 250, 120);
		
		stage.setScene(winningScene);
		stage.show();
	}
	
}
