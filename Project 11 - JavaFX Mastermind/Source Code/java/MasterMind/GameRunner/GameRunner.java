package MasterMind.GameRunner;

import MasterMind.Scenes.GameScene;
import MasterMind.Scenes.WelcomeScene;
import javafx.stage.Stage;

public class GameRunner {

	private Stage stage;
	private WelcomeScene welcomeScene;
	private GameScene gameScene;
	
	public GameRunner(Stage stage) {
		this.stage = stage;
		welcomeScreen();
	}
	
	public void welcomeScreen() {
		welcomeScene = new WelcomeScene(this);
		stage.setScene(welcomeScene.getWelcomeScene());		
	}
	
	public void startGame(boolean normalDifficulty) {
		gameScene = new GameScene(this, normalDifficulty);
		stage.setScene(gameScene.getGameScene());
		
	}
	
	
	

	
	
}
