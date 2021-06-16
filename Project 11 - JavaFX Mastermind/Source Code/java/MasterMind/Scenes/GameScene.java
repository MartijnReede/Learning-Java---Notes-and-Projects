package MasterMind.Scenes;

import java.util.ArrayList;
import java.util.List;

import MasterMind.GameRunner.GameRunner;
import MasterMind.Shapes.ColoredCirclePane;
import MasterMind.Shapes.ComputerFeedbackOnTurnCirclesPane;
import MasterMind.Shapes.GameControl;
import MasterMind.Utils.CodeChecker;
import MasterMind.Utils.RandomColorPicker;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class GameScene {
	

	/* Color 0: Red.
	 * Color 1: Blue.
	 * Color 2. Green.
	 * Color 3. Orange.
	 * Color 4. Purple.
	 * Color 5. Yellow.
	 */
	
	private GameRunner gameRunner;
	private GridPane gridPaneCenter;
	private GridPane gridPaneLeft;
	private GridPane gridPaneBottom;
	private List<Color> code;
	private List<Color> currentTurnChosenColors;
	private int currentRowPosition = 10;
	private int currentColumnPosition = 0;
	private boolean easyGameMode;
	
	public GameScene (GameRunner gameRunner, boolean easyGameMode) {
		this.gameRunner = gameRunner;
		this.easyGameMode = easyGameMode;
	}
	
	public Scene getGameScene() {
			
		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 40);
	
		Label top = new Label("MASTERMIND");
		top.setStyle("-fx-background-color: #808080; -fx-text-fill: black;");
		top.setFont(font);
		top.setMinWidth(500);
		top.setMinHeight(50);
		top.setPadding(new Insets(0, 0, 0, 45));
		
		gridPaneCenter = new GridPane();
		gridPaneCenter.setPadding(new Insets(5, 5, 5, 5));
		gridPaneCenter.setHgap(5);
		gridPaneCenter.setVgap(8);
		gridPaneCenter.setStyle("-fx-background-color: #808080");
		gridPaneCenter.getColumnConstraints().add(new ColumnConstraints(50));
		gridPaneCenter.getRowConstraints().add(new RowConstraints(50));
		
		gridPaneLeft = new GridPane();
		gridPaneLeft.setPadding(new Insets(5, 10, 5, 45));
		gridPaneLeft.setHgap(5);
		gridPaneLeft.setVgap(8);
		gridPaneLeft.setStyle("-fx-background-color: #808080");
		gridPaneLeft.getColumnConstraints().add(new ColumnConstraints(50));
		gridPaneLeft.getRowConstraints().add(new RowConstraints(50));
		
		gridPaneBottom = new GridPane();
		gridPaneBottom.setPadding(new Insets(5, 5, 10, 110));
		gridPaneBottom.setHgap(5);
		gridPaneBottom.setHgap(5);
		gridPaneBottom.setVgap(8);
		gridPaneBottom.setStyle("-fx-background-color: #808080");
		gridPaneBottom.getColumnConstraints().add(new ColumnConstraints(50));
		gridPaneBottom.getRowConstraints().add(new RowConstraints(50));
		
		setCode();
		createEmptyGameBoard();
		createGameControls();
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(top);
		borderPane.setCenter(gridPaneCenter);
		borderPane.setLeft(gridPaneLeft);
		borderPane.setBottom(gridPaneBottom);
		
		Scene gameScene = new Scene(borderPane, 400, 815);
		
		newTurn();
		
		return gameScene;
	}
	
	private void setCode() {
			
		RandomColorPicker colorPicker = new RandomColorPicker();
		code = colorPicker.createMasterMindCode(easyGameMode);
		
		for (int i = 0; i < 4; i++) {
			gridPaneCenter.add(new ColoredCirclePane(Color.BLACK, true), i, 0);
		}
	}

	private void createEmptyGameBoard() {	
		
		for (int i = 1; i < 11; i++) {
			gridPaneLeft.add(new ComputerFeedbackOnTurnCirclesPane(), 0, i);
			
			for (int j = 0; j < 4; j++) {
				gridPaneCenter.add(new ColoredCirclePane(Color.LIGHTGREY, false), j, i);
			}
		}
	}
	
	private void createGameControls() {
		
		int colorCount = 0;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				if (j < 3) {
					gridPaneBottom.add(new GameControl(colorCount, this), j, i);
					colorCount ++;
				} else if (j == 3 && i == 0) {
					gridPaneBottom.add(new GameControl("SET", this), j, i);
				} else {
					gridPaneBottom.add(new GameControl("DEL", this), j, i);
				}
			}
		}	
	}
	
	private void newTurn() {
		currentTurnChosenColors = new ArrayList<Color>();
	}
	
	public void setColor(Color color) {
		if (currentColumnPosition < 4) {
			gridPaneCenter.add(new ColoredCirclePane(color, false), currentColumnPosition, currentRowPosition);
			currentColumnPosition ++;
			currentTurnChosenColors.add(color);
		}
	}
	
	public void deleteColorFromCurrentTurn() {
		if (currentColumnPosition >= 1) {
			currentColumnPosition --;
			gridPaneCenter.add(new ColoredCirclePane(Color.LIGHTGREY, false), currentColumnPosition, currentRowPosition);	
			currentTurnChosenColors.remove(currentTurnChosenColors.size()-1);
		}
	}
	
	public void confirmCurrentTurn() {
		
		CodeChecker codeChecker = new CodeChecker();
		List<Color> computerFeedbackOnTurn = codeChecker.checkCode(code, currentTurnChosenColors);
		
		if (currentRowPosition > 0) {
			gridPaneLeft.add(new ComputerFeedbackOnTurnCirclesPane(computerFeedbackOnTurn), 0, currentRowPosition);
		}
		
		currentColumnPosition = 0;
		currentRowPosition -= 1;
		
		if ((computerFeedbackOnTurn.contains(Color.PINK) || computerFeedbackOnTurn.contains(Color.WHITE)) && currentRowPosition == 0) {
			new WinOrLoseScene("YOU LOSE!!", gameRunner);
			
			for (int i = 0; i < code.size(); i++) {
				gridPaneCenter.add(new ColoredCirclePane(code.get(i), true), i, 0);
			}
			
		} else if (!computerFeedbackOnTurn.contains(Color.PINK) && !computerFeedbackOnTurn.contains(Color.WHITE)) {
			new WinOrLoseScene("YOU WIN!!!", gameRunner);
			
			for (int i = 0; i < code.size(); i++) {
				gridPaneCenter.add(new ColoredCirclePane(code.get(i), true), i, 0);
			}
			
		} else {
			newTurn();
		}
	}		
}
