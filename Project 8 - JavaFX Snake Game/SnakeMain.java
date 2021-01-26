package application;
import java.util.LinkedList; 
import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class SnakeMain extends Application implements EventHandler<KeyEvent> {

// GAME SCREEN
Scene game;
Group root;
BorderPane gameCenter;
static Scene startScene;

// SNAKE
private static double snakeSize = 10; // deze moet de verhouding 10 hebben!
static Stage window;
private static int screenSize = 500;

// SNAKE FOOD
private double foodPosX;
private double foodPosY;
private int eatFood = 0;

//SNAKE MOVEMENT
private static double posX = (screenSize / 2) - (snakeSize * 1.5) + 5;
private static double posY = (screenSize / 2) - (snakeSize / 2) + 5;
private static long snakeSpeed = (long)1e8;
private int speedUp = 0;
private static int direction = 1;
AnimationTimer timer;

//SNAKE POSITIONS
private static LinkedList<Rectangle> snake = new LinkedList<Rectangle>();
private static LinkedList<Positions> positions = new LinkedList<Positions>();

//SCORE
private static int scoreCount;
Label scoreDisplay;
Label bestScoreDisplay;
private static int bestScore = 0;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage screen) throws Exception {
		
		//GAME WINDOW
		window = screen;
		
		StackPane startScreen = new StackPane();
		Button newGame = new Button("New game");
		newGame.setOnAction(e -> startGame());
		
		startScreen.getChildren().add(newGame);
		newGame.setAlignment(Pos.CENTER);
		
		startScene = new Scene(startScreen, screenSize, screenSize);
		
		window.setScene(startScene);
		window.setResizable(false);
		window.show();

	}
	
	//CREATE SNAKE
	public void startGame() {
	
		root = new Group();
		
		Rectangle a = new Rectangles((screenSize / 2) - (snakeSize / 2) + 5 , (screenSize / 2) - (snakeSize * 1.5) + 5,snakeSize);
		Rectangle b = new Rectangles((screenSize / 2) - (snakeSize / 2) + 5 , (screenSize / 2) - (snakeSize * 0.5) + 5,snakeSize);
		Rectangle c = new Rectangles((screenSize / 2) - (snakeSize / 2) + 5 , (screenSize / 2) - (snakeSize * -0.5) + 5, snakeSize);
		
		snake.push(a);
		snake.push(b);
		snake.push(c);
		
		Positions u = new Positions((screenSize / 2) - (snakeSize / 2) + 5, (screenSize / 2) - (snakeSize * 1.5) + 5);
		Positions v = new Positions((screenSize / 2) - (snakeSize / 2) + 5, (screenSize / 2) - (snakeSize * 0.5) + 5);
		Positions w = new Positions((screenSize / 2) - (snakeSize / 2) + 5, (screenSize / 2) - (snakeSize * -0.5) + 5);
		
		positions.push(u);
		positions.push(v);
		positions.push(w);
		
		for (Rectangle s : snake) {
			 root.getChildren().add(s);
		}
		
		game = new Scene(root, screenSize, screenSize);
		window.setScene(game);
		
		moveSnake(); 
	}
	
	//STARTING SNAKE MOVEMENT
	public void moveSnake() {
		
		gameCenter = new BorderPane();
		scoreDisplay = new Label("Points: " + Integer.toString(scoreCount));
		scoreDisplay.setPadding(new Insets(10,10,10,10));
		scoreDisplay.setFont(new Font("Times New Roman", 15));
		
		bestScoreDisplay = new Label("Best score: " + Integer.toString(bestScore));
		bestScoreDisplay.setPadding(new Insets(10,10,10,400));
		bestScoreDisplay.setFont(new Font("Times New Roman", 15));
		
		Rectangle topBorder = new Rectangles(35,0 , 500, 5);
		
		getRandomLocation();
		
		timer = new AnimationTimer() {

			long prefTime;
			
			@Override
			public void handle(long now) {
				
			long timeDif = now - prefTime;	
			eatFood = 0;
			
			if (timeDif > (long)snakeSpeed) {	
				prefTime = now;
				
				if (speedUp == 5) {
					snakeSpeed -= 9000000;
					speedUp = 0;
				}
				
				// DIRECTION
				if (direction == 1) {
					posX -= snakeSize;
				} else if (direction == 2) {
					posX += snakeSize;
				} else if (direction == 3) {
					posY -= snakeSize;
				} else if (direction == 4) {
					posY += snakeSize;
				}
				
				// SNAKE FOOD SPAWN
				if (posX == foodPosX && posY == foodPosY) {
					getRandomLocation();
					scoreCount++;
					speedUp++;
					eatFood = 1;
					scoreDisplay.setText("Points: " + Integer.toString(scoreCount));
				}
				
				// MAKE FOOD RECTANGLE
				Rectangle f = new Rectangles(foodPosY, foodPosX, snakeSize, "Food");
				
				// SNAKE RECTANGLES ADD AND LIST UPDATE
				Rectangle r = new Rectangles(posY, posX, snakeSize);
				snake.add(r);
				
				if (eatFood == 0) {
				 snake.pop();
				 positions.pop();
				}
				
				// CHECK SNAKE DOESNT HIT HIMSELF
				for (Positions pos : positions) {
					if (pos.getXposition() == posX && pos.getYposition() == posY) {
						window.setScene(GameOver.GameOverr());
						timer.stop();
					}
				}
				
				// CHECK SNAKE DOESN'T GO OUT OF BOUNDS
				if (posX < 0 || posX > 495 || posY < 40 || posY > 495) {
					timer.stop();
					window.setScene(GameOver.GameOverr());
					
				}
				
				// MAKE NEW GROUP AND ADD LIST TO IT
				root = new Group();
				
				for (Rectangle s : snake) {
					root.getChildren().add(s);			
				}	
				
				root.getChildren().add(f);
				
				gameCenter.setCenter(new Pane(root, scoreDisplay, bestScoreDisplay, topBorder));		
				
				// UPDATING SNAKE POSITIONS TO POSITIONS TRACKER
				Positions p = new Positions(posY, posX);
				positions.add(p);
			}
		}
		};
		
		game = new Scene(gameCenter, screenSize,screenSize);
		game.setOnKeyPressed(this);
		window.setScene(game);
		timer.start();
	}
	
	//GAME CONTROLS
	@Override
	public void handle(KeyEvent event) {
		
		if (event.getCode() == KeyCode.UP && direction != 4) {
			direction = 3;
		}
		if (event.getCode() == KeyCode.DOWN && direction != 3) {
			direction = 4;
		}
		if (event.getCode() == KeyCode.LEFT && direction != 2) {
			direction = 1;
		}
		if (event.getCode() ==KeyCode.RIGHT && direction != 1) {
			direction = 2;
		}
	}
	
	//FOOD LOCATION
	public void getRandomLocation() {
		
		int randomNumber1 = new Random().nextInt(50);
		int randomNumber2 = new Random().nextInt(45) + 4;
		
		foodPosX = randomNumber1 * 10;
		foodPosY = randomNumber2 * 10;
	}
	
	//RESET VARIABLES
	public static void anotherChance() {
		
		if (scoreCount > bestScore) {
			bestScore = scoreCount;
		}
		
		snake.clear();
		positions.clear();
		posX = (screenSize / 2) - (snakeSize * 1.5) + 5;
		posY = (screenSize / 2) - (snakeSize / 2) + 5;
		scoreCount = 0;
		direction = 1;
		snakeSpeed = (long)1e8;
		
			window.setScene(startScene);
	}

}

