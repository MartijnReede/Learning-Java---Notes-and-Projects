package application;

import java.util.ArrayList;
import java.util.List; 

import javafx.animation.AnimationTimer;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LevelHandler {

	//GAME LAYOUT
	public static Pane root;
	
	//CURRENT LEVEL
	private static List<Rectangle> currentLevel;
	private static Group levelGroup;
		
	// ANIMATION TIMER	
	private static AnimationTimer timer;

	//BALL
	private static Rectangle ball;
	public static double ballSize = 10;
	private static double ballXspeed = 0;
	private static double ballYspeed = 1;
	private static double ballXpos = 600;
	private static double ballYpos = 280;

	//TOP BAR
	private static int score = 0;
	private static int level = 1;
	private static Label scoreDisplay;
	private static Label levelDisplay;
	private static boolean gameOver = false;

	//PLAYER
	static Rectangle player;
	public static double playerXpos = 350;
	private static double playerYpos = 480;
	private static double playerWidth = 100;
	private static double playerHeigth = 10;

	//PLAYER BALL COLLISSION
	public static double playerLeftBound;
	public static double playerLeftMiddleBound;
	public static double playerCenter;
	public static double playerRightMiddleBound;
	public static double playerRightBound;

		public static Pane topHandler() {
			
			Font font2 = Font.font("Verdana", FontWeight.EXTRA_BOLD,35);
			
			Pane top = new Pane();
			top.setMinHeight(100);
			top.setMinWidth(800);
			top.setMaxHeight(100);
			top.setMaxWidth(800);
			top.setStyle("-fx-background-color: black");
			
			scoreDisplay = new Label("Score: " + score);
			scoreDisplay.setFont(font2);
			scoreDisplay.setStyle("-fx-text-fill: lightgray");
			scoreDisplay.setPadding(new Insets(25,10,20,10));
			
			levelDisplay = new Label("Level: " + level);
			levelDisplay.setFont(font2);
			levelDisplay.setStyle("-fx-text-fill: lightgray");
			levelDisplay.setPadding(new Insets(25,10,10,625));
			
			
			Rectangle rect = new Rectangle();
			rect.setFill(Color.LIGHTGRAY);
			rect.setY(97);
			rect.setX(0);
			rect.setWidth(800);
			rect.setHeight(3);
			
			top.getChildren().addAll(scoreDisplay, levelDisplay, rect);

			return top;
		}
		
		public static Pane levelHandler() {
		
			// BALL
			ball = new Rectangle();
			ball.setX(ballXpos);
			ball.setY(ballYpos);
			ball.setWidth(ballSize);
			ball.setHeight(ballSize);
			ball.setArcHeight(8);
			ball.setArcWidth(8);
			ball.setFill(Color.LIGHTGRAY);
			
			// PLAYER
			player = new Rectangle();
			player.setWidth(playerWidth);
			player.setHeight(playerHeigth);
			player.setFill(Color.LIGHTGRAY);
			player.setArcHeight(7);
			player.setArcWidth(7);
			player.setX(playerXpos);
			player.setY(playerYpos);
			
			// GAMEPLAY SCREEN
			root = new Pane();
			root.setStyle("-fx-background-color: black");
			root.getChildren().addAll(ball, player);
			
			//LOAD LEVEL 
			currentLevel = Levels.getLevel(level);
			
			//CREATE GROUP FROM CURRENT LEVEL
			createLevel();
						
			// ANIMATIONTIMER
			timer = new AnimationTimer() {
				
				@Override
				public void handle(long arg0) {
					
					gameOver = false;
					ballXpos += ballXspeed;
					ballYpos += ballYspeed;
					
					// SCREEN BOUNDS
					if (ballYpos == 500 - ballSize) {
						gameOver();
						gameOver = true;
						resetVariables();
						timer.stop();
					}
					
					if (ballYpos == 0) {
						ballYspeed *= -1;
					}
					
					if (ballXpos == 800 - ballSize) {
						ballXspeed *= -1;
					}
					
					
					if (ballXpos == 0) {
						ballXspeed *= -1;
					}
					
					// PLAYER COLLISSION
					if (ballYpos == 470) {
										
						if (ballXpos >= playerLeftBound && ballXpos < playerLeftMiddleBound) {
							ballXspeed = -5;
							ballYspeed = -2.5;
						}
					
						if (ballXpos >= playerLeftMiddleBound && ballXpos < playerCenter) {
							ballXspeed = -2.5;
							ballYspeed = -5;
						}
					
						if (ballXpos >= playerCenter && ballXpos < playerRightMiddleBound) {
							ballXspeed = 2.5;
							ballYspeed = -5;
						}
					
						if (ballXpos >= playerRightMiddleBound && ballXpos < playerRightBound) {
							ballXspeed = 5;
							ballYspeed = -2.5;
						}
					}
					
					//BLOCK COLISSION
					int counter = 0;
					
					if (currentLevel.size() > 0) {
					
					for (Rectangle rects : currentLevel) {
						
						if (ballXpos + ballSize >= rects.getX() && ballXpos <= rects.getBoundsInLocal().getMaxX() + 0.5 && ballYpos + ballSize == rects.getY()) {
							levelGroup.getChildren().remove(counter);
							currentLevel.remove(counter);
							score += 10;
							updateScore();
							ballYspeed *= -1;
							break;
						}
						
						if (ballXpos + ballSize >= rects.getX() && ballXpos <= rects.getBoundsInLocal().getMaxX() + 0.5 && ballYpos == rects.getBoundsInLocal().getMaxY() + 0.5) {
							levelGroup.getChildren().remove(counter);
							currentLevel.remove(counter);
							score += 10;
							updateScore();
							ballYspeed *= -1;
							break;
						}
						
						if(ballYpos + ballSize >= rects.getY() && ballYpos <= rects.getBoundsInLocal().getMaxY() + 0.5 && ballXpos + ballSize == rects.getX()) {
							levelGroup.getChildren().remove(counter);
							currentLevel.remove(counter);
							score += 10;
							updateScore();
							ballXspeed *= -1;
							break;
						}
						
						if (ballYpos + ballSize >= rects.getY() && ballYpos <= rects.getBoundsInLocal().getMaxY() + 0.5 && ballXpos == rects.getBoundsInLocal().getMaxX() + 0.5) {
							levelGroup.getChildren().remove(counter);
							currentLevel.remove(counter);
							score +=10;
							updateScore();
							ballXspeed *= -1;
							break;
						}
	
					counter++;
					}
					}
			
					ball.setX(ballXpos);
					ball.setY(ballYpos);
					
					//LEVEL UP
					if (score == 280) {
						score += 100;
						levelUp();
					}
					
					if (score == 630) {
						gameOver = true;
						resetVariables();
						winner();
						timer.stop();
					}
				}
			};
			
			timer.start();
			return root;
		}

		public static void createLevel() { 
			
		levelGroup = new Group();
		
		for (Rectangle rect : currentLevel) {
	
			levelGroup.getChildren().add(rect);
		}
		root.getChildren().add(levelGroup);
	}
	
	public static void updateScore() {
		scoreDisplay.setText("Score: " + score);
	}
	
	public static void levelUp() {
		level += 1;
		root.getChildren().remove(levelGroup);
		levelDisplay.setText("Level: " + level);
		resetVariables();
		currentLevel = new ArrayList<Rectangle>();
		currentLevel = Levels.getLevel(level);
		createLevel();
	}
	
	public static void resetVariables() {
		playerXpos = 350;
		player.setX(playerXpos);
		ballXspeed = 0;
		ballYspeed = 1;
		ballXpos = 600; 
		ballYpos = 280;
		
		if (gameOver == true) {
			score = 0;
			level = 1;
		}
	}
	
	public static void gameOver() {
		Button newGame = new Button();
		newGame.setText("GAME OVER!");
		newGame.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD,40));
		newGame.setStyle("-fx-text-fill: lightgray; -fx-background-color: black; -fx-border-color: gray; -fx-border-width: 5px;");
		newGame.setOnAction(e -> {Main.game.setCenter(Main.center); Main.game.setTop(Main.top); });
		
		StackPane center = new StackPane();
		center.setStyle("-fx-background-color: black");
		center.getChildren().add(newGame);
		
		Main.game.setCenter(center);
	}
	
	public static void winner() {
		Button newGame = new Button();
		newGame.setText("YOU WON!!!");
		newGame.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD,40));
		newGame.setStyle("-fx-text-fill: linear-gradient(orange, purple); -fx-background-color: black; -fx-border-color: gray; -fx-border-width: 5px;");
		newGame.setOnAction(e -> {Main.game.setCenter(Main.center); Main.game.setTop(Main.top); });
		
		StackPane center = new StackPane();
		center.setStyle("-fx-background-color: black");
		center.getChildren().add(newGame);
		
		Main.game.setCenter(center);
	}
	
}