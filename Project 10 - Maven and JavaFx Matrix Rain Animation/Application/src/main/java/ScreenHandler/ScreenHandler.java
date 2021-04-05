package ScreenHandler;

import java.util.ArrayList; 
import java.util.List; 
import LabelMaker.LabelMaker;
import RandomNumbers.RandomNumberGenerator;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ScreenHandler {

	private Stage stage;
	private LabelMaker labelMaker;
	private List<List<Label>>allLabels;
	private AnimationTimer timer;
	
	public ScreenHandler(Stage stage) {
		this.stage=stage;
		labelMaker = new LabelMaker();
		allLabels = labelMaker.getLabels();
		createScreen();
	}
	
	public void createScreen() {
		Pane pane = new Pane();
		
		for (List<Label> labels : allLabels) {
			pane.getChildren().addAll(labels);
		}
		pane.setStyle("-fx-background-color:  #0D0208");
		
		Scene scene = new Scene(pane, 1000, 600);
		stage.setScene(scene);
		stage.setResizable(false);
		
		startAnimation();
	}
	
	public void startAnimation() {
		
		RandomNumberGenerator ranGen = new RandomNumberGenerator();
		List<Integer> activeColumns = new ArrayList<Integer>();
		
		DropShadow ds1 = new DropShadow();
		//ds1.setRadius(20);
		ds1.setSpread(0.3);
		
		for (int i = 0; i < 63; i++) {
			activeColumns.add(-28);
		}
		
		timer = new AnimationTimer() {
			
			@Override
			public void handle(long now) {
				
				try {
					Thread.sleep(75);
				} catch (InterruptedException e) {
				}
				
				int col = ranGen.generate(180);
				
				if (col >= 0 && col <63) {
					if (activeColumns.get(col) <= -1) {
						activeColumns.set(col, 27);
					}
				}
						
				for (int i = 0; i<activeColumns.size(); i++) {
							
				if (activeColumns.get(i) >= 0) {	
					allLabels.get(i).get(activeColumns.get(i)).setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 20px;");
					ds1.setColor(Color.rgb(0, 255, 65));
					allLabels.get(i).get(activeColumns.get(i)).setEffect(ds1);
				}
							
				if (activeColumns.get(i) >= 0 && activeColumns.get(i) <= 26) {
					allLabels.get(i).get(activeColumns.get(i)+1).setStyle("-fx-text-fill: #00FF41; -fx-font-weight: bold; -fx-font-size: 20px;");		
				}
							
				if (activeColumns.get(i) >= -3 && activeColumns.get(i) <= 24 ) {
					allLabels.get(i).get(activeColumns.get(i)+3).setStyle("-fx-text-fill: #008F11; -fx-font-weight: bold; -fx-font-size: 20px;");	
				}
						
				if (activeColumns.get(i) >= -15 && activeColumns.get(i) <= 12) {
					allLabels.get(i).get(activeColumns.get(i)+15).setStyle("-fx-text-fill: #003B00; -fx-font-weight: bold; -fx-font-size: 20px;");
					allLabels.get(i).get(activeColumns.get(i)+15).setEffect(null);
				}
		
				if (activeColumns.get(i) < 10 && activeColumns.get(i) > -18) {
					allLabels.get(i).get(activeColumns.get(i)+18).setStyle("-fx-text-fill: black; -fx-font-weight: bold; -fx-font-size: 20px;");
				}
								
				int firstNumber = activeColumns.get(i);
					activeColumns.set(i, firstNumber -1);
				}						
			}	
		};
		timer.start();
	}
}
