package MasterMind.Scenes;

import java.util.Arrays;
import java.util.List;

import MasterMind.GameRunner.GameRunner;
import MasterMind.Shapes.ColoredCirclePane;
import MasterMind.Shapes.ComputerFeedbackOnTurnCirclesPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class WelcomeScene {
	
	private GameRunner gameRunner;
	private List<Color> feedbackExplList  = Arrays.asList(Color.WHITE, Color.PINK, Color.SADDLEBROWN, Color.WHITE);
	
	public WelcomeScene(GameRunner gameRunner) {
		this.gameRunner = gameRunner;
	}
	
	public Scene getWelcomeScene() {
		
		Font fontTitle = Font.font("Verdana", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 40);
		Font fontLeft = Font.font("Verdana", FontWeight.EXTRA_BOLD, 15);
		Font fontRight = Font.font("Verdana", 12);
		
		Label top = new Label("MASTERMIND");
		top.setStyle("-fx-background-color: #808080; -fx-text-fill: black;");
		top.setFont(fontTitle);
		top.setMinWidth(500);
		top.setMinHeight(50);
		top.setPadding(new Insets(0, 0, 0, 45));
		
		//LEFT PANE
		
		Button startButton = new Button("New Game \n  (normal)");
		startButton.setFont(fontLeft);
		startButton.setMinWidth(150);
		startButton.setMinHeight(150);
		startButton.setLayoutX(200);
		startButton.setLayoutY(200);
		startButton.setStyle("-fx-background-color: #90EE90");
		startButton.setOnAction(e -> gameRunner.startGame(true));
		
		Button startButtonHard = new Button("New Game \n    (hard)");
		startButtonHard.setFont(fontLeft);
		startButtonHard.setMinHeight(150);
		startButtonHard.setMinWidth(150);
		startButtonHard.setLayoutX(200);
		startButtonHard.setLayoutY(200);
		startButtonHard.setStyle("-fx-background-color: #FF6347");
		startButtonHard.setOnAction(e -> gameRunner.startGame(false));
		
		Label howToWin = new Label("How to win?");
		howToWin.setPadding(new Insets(10, 0, 0, 20));
		howToWin.setFont(fontLeft);
		howToWin.setStyle("-fx-background-color: #999999;  -fx-background-radius: 3px;");
		
		Pane howToWinPane = new Pane();
		howToWinPane.setMinHeight(150);
		howToWinPane.setMinWidth(150);
		howToWinPane.setStyle("-fx-background-color: #999999; -fx-background-radius: 3px;");
		howToWinPane.getChildren().add(howToWin);
		ColoredCirclePane hiddenCodeBlock = new ColoredCirclePane(Color.BLACK, true);
		hiddenCodeBlock.setLayoutX(50);
		hiddenCodeBlock.setLayoutY(60);
		howToWinPane.getChildren().add(hiddenCodeBlock);
		
		Label computerFeedback = new Label("Feedback of \ncomputer");
		computerFeedback.setPadding(new Insets(10, 0, 0, 26));
		computerFeedback.setFont(fontLeft);
		
		Pane computerFeedbackColors = new ComputerFeedbackOnTurnCirclesPane(feedbackExplList);
		computerFeedbackColors.setLayoutX(50);
		computerFeedbackColors.setLayoutY(115);
		
		Rectangle rect = new Rectangle();
		rect.setWidth(56);
		rect.setHeight(56);
		rect.setLayoutX(47);
		rect.setLayoutY(112);
		rect.setFill(Color.web("#808080"));
		
		
		Pane computerFeedbackPane = new Pane();
		computerFeedbackPane.setMinWidth(150);
		computerFeedbackPane.setMinHeight(285);
		computerFeedbackPane.getChildren().addAll(computerFeedback, rect, computerFeedbackColors);
		computerFeedbackPane.setStyle("-fx-background-color: #999999; -fx-background-radius: 3px;");
		
		GridPane leftGridPane = new GridPane();
		leftGridPane.setVgap(5);
		leftGridPane.setHgap(5);
		leftGridPane.setPadding(new Insets(0,0,0,5));
		leftGridPane.add(startButton, 0, 1);
		leftGridPane.add(startButtonHard, 0, 2);
		leftGridPane.add(howToWinPane, 0, 3);
		leftGridPane.add(computerFeedbackPane, 0, 4);

		
		//RIGHT PANE
		
		Label normalGameExpl = new Label("The code to hack has only unique \ncolors.");
		normalGameExpl.setFont(fontRight);
		normalGameExpl.setAlignment(Pos.TOP_LEFT);
		normalGameExpl.setPadding(new Insets(10,10,10,10));
		normalGameExpl.setMinHeight(150);
		normalGameExpl.setMinWidth(235);
		normalGameExpl.setStyle("-fx-background-color: #999999; -fx-background-radius: 3px;");
		
		Label hardGameExpl = new Label("The code to hack may contain \nduplicate colors.");
		hardGameExpl.setFont(fontRight);
		hardGameExpl.setAlignment(Pos.TOP_LEFT);
		hardGameExpl.setPadding(new Insets(10,10,10,10));
		hardGameExpl.setMinHeight(150);
		hardGameExpl.setMinWidth(235);
		hardGameExpl.setStyle("-fx-background-color: #999999; -fx-background-radius: 3px;");
		
		Label howToWinExpl = new Label("Guess the colors behind these \nblack blocks.");
		howToWinExpl.setFont(fontRight);
		howToWinExpl.setPadding(new Insets(10,10,10,10));
		howToWinExpl.setAlignment(Pos.TOP_LEFT);
		howToWinExpl.setMinHeight(150);
		howToWinExpl.setMinWidth(235);
		howToWinExpl.setStyle("-fx-background-color: #999999; -fx-background-radius: 3px;");
		
		Label computerFeedbackExpl = new Label("BROWN CIRCLE:\n"
				+ "A brown circle means that one of \nthe colors is placed on the correct \nposition.\n\n" 
				+ "PINK CIRCLE:\n"
				+ "A pink circle means that one of \nthe placed colors matches a color \nfrom the code, but it is not placed \non the correct position.\n\n"
				+ "WHITE CIRCLE:\n"
				+ "A white circle means that one of \nthe placed colors does not exists \nin the code.");
		computerFeedbackExpl.setFont(fontRight);
		computerFeedbackExpl.setPadding(new Insets(10, 10, 10, 10));
		computerFeedbackExpl.setAlignment(Pos.TOP_LEFT);
		computerFeedbackExpl.setStyle("-fx-background-color: #999999; -fx-background-radius: 3px;");
		computerFeedbackExpl.setMinHeight(285);
		computerFeedbackExpl.setMinWidth(235);
		
		GridPane rightGridPane = new GridPane();
		rightGridPane.setVgap(5);
		rightGridPane.setHgap(5);
		rightGridPane.setPadding(new Insets(5, 5, 5, 5));
		rightGridPane.add(normalGameExpl, 0, 0);
		rightGridPane.add(hardGameExpl, 0, 1);
		rightGridPane.add(howToWinExpl, 0, 2);
		rightGridPane.add(computerFeedbackExpl, 0, 3);
		
		BorderPane startPane = new BorderPane();
		startPane.setStyle("-fx-background-color: #808080;");
		startPane.setTop(top);
		startPane.setLeft(leftGridPane);
		startPane.setCenter(rightGridPane);
		
		Scene welcomeScene = new Scene(startPane, 400, 815);
		
		return welcomeScene;
	}
	
}
