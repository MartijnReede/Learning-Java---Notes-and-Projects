package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public class Main extends Application implements EventHandler<KeyEvent> {

	public static BorderPane game;
	public static StackPane center;
	public static HBox top;
	private static Scene gameScene;
		
		public static void main(String[] args) {
		
			launch(args);
		}

		@Override
		public void start(Stage window) throws Exception {
			
			//START GAME SCREEN
			Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 70);
			Font font2 = Font.font("Verdana", FontWeight.EXTRA_BOLD,40);
			
			game = new BorderPane();
			
			top = new HBox();
			top.setMinHeight(100);
			top.setMinWidth(800);
			top.setStyle("-fx-background-color: black");
			
			Label brickBreaker = new Label("BRICK BREAKER!");
			brickBreaker.setFont(font);
			brickBreaker.setPadding(new Insets(15,10,10,75));
			brickBreaker.setStyle("-fx-text-fill: linear-gradient(orange, purple);");
			top.getChildren().add(brickBreaker);
			
			Button newGame = new Button();
			newGame.setText("NEW GAME");
			newGame.setFont(font2);
			newGame.setStyle("-fx-text-fill: lightgray; -fx-background-color: black; -fx-border-color: gray; -fx-border-width: 5px;");
			newGame.setOnAction(e -> {game.setTop(LevelHandler.topHandler()); game.setCenter(LevelHandler.levelHandler()); });
			
			center = new StackPane();
			center.setStyle("-fx-background-color: black");
			center.getChildren().add(newGame);
			
			game.setTop(top);
			game.setCenter(center);
			
			gameScene = new Scene(game, 800,600);
			gameScene.setOnKeyPressed(this);
			
			window.setScene(gameScene);
			window.setResizable(false);
			window.show();
		}

		@Override
		public void handle(KeyEvent event) {
			
			if (event.getCode() == KeyCode.LEFT) {
				LevelHandler.playerXpos -= 20;
				LevelHandler.player.setX(LevelHandler.playerXpos);
				
				
				LevelHandler.playerLeftBound = LevelHandler.playerXpos - 10;
				LevelHandler.playerLeftMiddleBound = LevelHandler.playerXpos + 25;
				
				LevelHandler.playerCenter = LevelHandler.playerXpos + 50;
				
				LevelHandler.playerRightMiddleBound = LevelHandler.playerXpos + 75;
				LevelHandler.playerRightBound = LevelHandler.playerXpos + 110;
				
		
			}
				
			if (event.getCode() == KeyCode.RIGHT) {
				LevelHandler.playerXpos += 15;
				
				LevelHandler.player.setX(LevelHandler.playerXpos);
				LevelHandler.playerLeftBound = LevelHandler.playerXpos - 10;
				LevelHandler.playerLeftMiddleBound = LevelHandler.playerXpos + 25;
				
				LevelHandler.playerCenter = LevelHandler.playerXpos + 50;
				
				LevelHandler.playerRightMiddleBound = LevelHandler.playerXpos + 75;
				LevelHandler.playerRightBound = LevelHandler.playerXpos + 110;
			}
				
		}
		
	}
