package application;
import javafx.animation.AnimationTimer; 
import javafx.application.Application; 
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class MainGame extends Application implements EventHandler<KeyEvent> {

// GAME SCREEN
BorderPane root;
StackPane startScreen;
	
// TIMER
AnimationTimer timer;
AnimationTimer timer2;

// LEVEL MECHANICS
boolean playerWin;
private int level = 1;
String message;
int counter = 4;
boolean gameOver = false;
	
// PLAYER SCORES + GAME NAME	
int	playerScore = 0;
int computerScore = 0;
Label plScore;
Label gameName;
Label compScore;

// BALL
Circle ball;
double ballRadius = 10;
double ballXpos = 400;
double ballYpos = 200;
double ballYspeed = 3.9;
double ballXspeed = 4;

// PLAYER
Rectangle player;
double playerWidth = 15;
double playerHeigth = 150;
double playerXpos = 0;
double playerYpos = 175;
double playerSpeed = 8;

// COMPUTER
Rectangle computer;
double computerWidth = 15;
double computerHeigth = 100;
double computerXpos = 785;
double computerYpos = 175;
double computerSpeed = 3;
double computerMoveUp = computerSpeed * -1;
double computerMoveDown = computerSpeed;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage window) {
			
			// GAME LAYOUT
			root = new BorderPane();
			
			// TOP LAYOUT
			plScore = new Label("PLAYER: " + playerScore);		
			plScore.setFont(new Font("Times New Roman", 25));
			plScore.setPadding(new Insets(10,10,10,10));
			
			gameName = new Label("PONG");
			gameName.setFont(new Font("Times New Roman", 25));
			gameName.setPadding(new Insets(10,10,10,215));
			
			compScore = new Label("COMPUTER: " + computerScore);
			compScore.setFont(new Font("Times New Roman", 25));
			compScore.setPadding(new Insets(10,10,10,170));
			
			HBox topScores = new HBox();
			topScores.getChildren().addAll(plScore, gameName, compScore);
			
			Label blackTop = new Label();
			blackTop.setMaxSize(800, 10);
			blackTop.setStyle("-fx-background-color: linear-gradient(white, black)");
			
			VBox topLayers = new VBox();
			topLayers.getChildren().addAll(topScores,blackTop);
			
			// BOTTOM LAYOUT
			Label blackBottom = new Label();
			blackBottom.setStyle("-fx-background-color: linear-gradient(black, white)");
			blackBottom.setMaxSize(800, 10);
		
			// CENTER LAYOUT
			startScreen = new StackPane();
			
			VBox buttons = new VBox(10);
			Button ready = new Button("New game");
			ready.setMinSize(200, 50);
			ready.setMaxSize(200, 50);
			ready.setFont(new Font("Times New Roman", 20));
			ready.setOnAction(e -> startNewGame());
			
			Button scoreReset = new Button("App info");
			scoreReset.setMinSize(200, 50);
			scoreReset.setMaxSize(200, 50);
			scoreReset.setFont(new Font("Times New Roman", 20));
			scoreReset.setOnAction(e -> appInfoPage());
			
			buttons.getChildren().addAll(ready, scoreReset);
			
			buttons.setAlignment(Pos.CENTER);
			startScreen.getChildren().add(buttons);
			
			// TOTAL SCREEN CONSTRUCTION
			root.setBottom(blackBottom);
			root.setTop(topLayers);
			root.setCenter(startScreen);
			Scene scene = new Scene(root,800,500);
			
			scene.setOnKeyPressed(this);
			
			window.setResizable(false);
			window.setScene(scene);
			window.show();
	}
	
	// GAME MECHANICS
	public void startNewGame() {
		
		gameOver = false;
		
		ball = new Circle();
		ball.setRadius(ballRadius);
		ball.setCenterX(ballXpos);
		ball.setCenterY(ballYpos);
		ball.setFill(Color.BLACK);
		
		player = new Rectangle();
		player.setWidth(playerWidth);
		player.setHeight(playerHeigth);
		player.setFill(Color.BLACK);
		player.setX(playerXpos);
		player.setY(playerYpos);
		
		computer = new Rectangle();
		computer.setWidth(computerWidth);
		computer.setHeight(computerHeigth);
		computer.setFill(Color.BLACK);
		computer.setX(computerXpos);
		computer.setY(computerYpos);
		
		root.setCenter(new Pane(ball, player, computer));
	
		timer = new AnimationTimer() {

			@Override
			public void handle(long arg0) {
				
				// BALL MOVEMENT
				ballYpos += ballYspeed;
				ballXpos += ballXspeed;
				
				// BALL Y MOVEMENTS
				if (ballYpos + ballRadius > 412) {
					ballYspeed *= -1;
				}
				
				if (ballYpos - ballRadius < 0) {
					ballYspeed *= -1;
				}
			
				//  PLAYER LOSE
				if (ballXpos + ballRadius < -10) {
					computerScore += 1;
					ballXspeed *= -1;
					updateScoreText();
					resetBall();
					playerWin = false;
					winLose();
					timer.stop();
				}
				
				// PLAYER COLLISION
				if (ballXpos < playerWidth + ballRadius && ballYpos > playerYpos && ballYpos < playerYpos + playerHeigth) {
					ballXspeed *= -1;
					ballXpos += 5;
				}
				
				// COMPUTER COLLISION	
				if (ballXpos > 800 - playerWidth - ballRadius && ballYpos > computerYpos && ballYpos < computerYpos + computerHeigth) {
					ballXspeed *= -1;
					ballXpos += -5;
				}
				
				// COMPUTER LOSE
				if (ballXpos - ballRadius > 805) {
					playerScore += 1;
					updateScoreText();
					resetBall();
					playerWin = true;
					winLose();
					timer.stop();
				}
			
				// COMPUTER POSITION	
				if (ballYpos > (computerYpos + computerHeigth / 2) && computerYpos + computerHeigth < 412) {
					computerYpos += computerMoveDown;
				}
	
				if (ballYpos < (computerYpos + computerHeigth / 2) && computerYpos > 2) {
					computerYpos += computerMoveUp;
				}
			
				
			// RENDER GAMESCREEN
			computer.setY(computerYpos);
			ball.setCenterX(ballXpos);
			ball.setCenterY(ballYpos);
			}
		};
			
		timer.start();
	}
	
	@Override
	public void handle(KeyEvent event) {
		
		// PLAYER MOVEMENT
		if (event.getCode() == KeyCode.UP && playerYpos > 0) {
			playerYpos -= playerSpeed;
			player.setY(playerYpos);
		}
		
		if (event.getCode() == KeyCode.DOWN && playerYpos + playerHeigth < 412) {
			playerYpos += playerSpeed;
			player.setY(playerYpos);
		}
	}
	
	public void updateScoreText() {
		plScore.setText("PLAYER: " + playerScore);
		compScore.setText("COMPUTER: " + computerScore);
	}
	
	public void resetBall() {
		ballXpos = 400;
		ballYpos = 200;
	}
	
	public void resetScores() {
		playerScore = 0;
		computerScore = 0;
		updateScoreText();
	}
	
	public void winLose() {
		
		// PLAYER WIN
			if (playerWin == true && playerScore == 3) {
			message = "YOU WIN! LEVEL " + level + " COMPLETE!";
			level++;
			resetScores();
			if (level <=3 ) {
				levelChange();
			}
			
		} else if (playerWin == true) {
			message = "YOU WIN!";
		}
		
		// PLAYER LOSE
		if (playerWin == false && computerScore == 3) {
			gameOver = true;
			message = "GAME OVER!";
			
	 	} else if (playerWin == false) {
			message = "YOU LOSE!";
		}
		
		timer2 = new AnimationTimer() {
			
			long prefTime = 0;
			long td = 0;
			
			@Override
			public void handle(long now) {
			
				td = now - prefTime;
				
				if (td > 1.5e9) {
					if (counter == 4) {
						StackPane winOrLose = new StackPane();
						Label showMessage = new Label(message);
						showMessage.setFont(new Font("Times New Roman", 50));
						winOrLose.getChildren().add(showMessage);
						root.setCenter(winOrLose);					
					}
					
					if (counter == 0) {
						timer2.stop();
						counter = 5;
						startNewGame();
					}
											
					if (counter < 4) {
						if (gameOver == true) {
							root.setCenter(startScreen);
							resetScores();
							timer2.stop();
							return;
						}
						
						StackPane winOrLose = new StackPane();
						Label showMessage = new Label(String.valueOf(counter));
						showMessage.setFont(new Font("Times New Roman", 50));
						winOrLose.getChildren().add(showMessage);
						root.setCenter(winOrLose);
					}
					
					counter--;
					prefTime = now;
				}
			}
		};
		
		timer2.start();
		
		if (level == 4) {
			timer2.stop();
			winningScene();
		}
	}
	
	public void levelChange() {
		
		if (level == 1) {
			ballYspeed = 3.9;
			ballXspeed = 4;
			playerHeigth = 150;
			computerSpeed = 3;
		
		} else if (level == 2) {
			ballYspeed = 5;
			ballXspeed = 6;
			playerHeigth = 130;
			computerSpeed = 3.8;
			
		} else if (level == 3) {
			ballYspeed = 6;
			ballXspeed = 8;
			playerHeigth = 130;
			computerSpeed = 5;
		}
	}
	
	public void winningScene() {
		
		VBox winner =  new VBox(15);
		winner.setAlignment(Pos.CENTER);
		Label masterOfPong = new Label("YOU ARE A TRUE PONG MASTER!");
		masterOfPong.setFont(new Font("Times New Roman", 40));
		Button confirmMaster = new Button("Confirm");
		
		winner.getChildren().addAll(masterOfPong, confirmMaster);
	
		confirmMaster.setOnAction(e -> {
			resetScores();
			level = 1;
			levelChange();
			root.setCenter(startScreen); });

		root.setCenter(winner);
	}
	
	public void appInfoPage() {
		VBox appInfo = new VBox(30);
		appInfo.setPadding(new Insets (30,10,10,20));
		
		Label infoText = new Label();
		infoText.setText("Game made by Martijn Reede 17-01-2021");
		
		Button confirm = new Button("confirm");
		confirm.setOnAction(e -> root.setCenter(startScreen));
		
		appInfo.getChildren().addAll(infoText, confirm);
		root.setCenter(appInfo);
	}
}