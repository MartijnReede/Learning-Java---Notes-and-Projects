package MasterMind.Shapes;

import MasterMind.Scenes.GameScene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class GameControl extends Button {
	
	private String color0 = "-fx-background-color: red;";
	private String color1 = "-fx-background-color: blue;";
	private String color2 = "-fx-background-color: green;";
	private String color3 = "-fx-background-color: orange;";
	private String color4 = "-fx-background-color: purple;";
	private String color5 = "-fx-background-color: yellow;";
		
	public GameControl(int colorNumber, GameScene gameScene) {
		
		String colorStyle;
		Color color;
		if (colorNumber == 0) {
			colorStyle = color0;
			color = Color.RED;
		} else if (colorNumber == 1) {
			colorStyle = color1;
			color = Color.BLUE;
		} else if (colorNumber == 2) {
			colorStyle = color2;
			color = Color.GREEN;
		} else if (colorNumber == 3) {
			colorStyle = color3;
			color = Color.ORANGE;
		} else if (colorNumber == 4) {
			colorStyle = color4;
			color = Color.PURPLE;
		} else {
			colorStyle = color5;
			color = Color.YELLOW;
		}
		
		this.setMinWidth(50);
		this.setMinHeight(50);
		this.setOnAction(e -> gameScene.setColor(color));
		this.setStyle("-fx-background-insets: 0; -fx-border-radius: 20px; -fx-border-color: black; "
				+ "-fx-border-width: 3px; -fx-background-radius: 25px;" + colorStyle);
	}
	
	public GameControl(String buttonText, GameScene gameScene) {
		
		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 15);
		
		if (buttonText.equals("SET")) {
			this.setOnAction(e -> gameScene.confirmCurrentTurn());
		} else if (buttonText.equals("DEL")) {
			this.setOnAction(e -> gameScene.deleteColorFromCurrentTurn());
		}
		
		this.setMinWidth(50);
		this.setMinHeight(50);
		this.setText(buttonText);
		this.setFont(font);
		this.setStyle("-fx-background-radius: 25px; -fx-background-color: black;"
				+ "-fx-text-fill: white;");
	}
}
