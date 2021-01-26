package application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class GameOver {
	
	public static Scene GameOverr() {
		
		VBox box = new VBox(10);
		
		StackPane gameOver = new StackPane();
		Label GO = new Label("GAME OVER!");
		
		Button tryAgain = new Button("Try  Again");
		tryAgain.setOnAction(e -> SnakeMain.anotherChance());
		
		GO.setFont(new Font("Times New Roman" , 40));
		box.setAlignment(Pos.CENTER);
		
		box.getChildren().addAll(GO, tryAgain);
		
		gameOver.getChildren().add(box);
		
		Scene scene = new Scene(gameOver, 500,500);
		
		return scene;
	}

}
