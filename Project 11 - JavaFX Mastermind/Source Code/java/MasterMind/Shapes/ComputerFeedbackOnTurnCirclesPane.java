package MasterMind.Shapes;

import java.util.List;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ComputerFeedbackOnTurnCirclesPane extends Pane {
	
	public ComputerFeedbackOnTurnCirclesPane() {
		
		double xPos = 11.5;
		double yPos = 11.5;
		
		for (int i = 0; i < 4; i++) {
			Circle feedbackCircle = new Circle();
			feedbackCircle.setRadius(6);
			feedbackCircle.setFill(Color.LIGHTGRAY);
			feedbackCircle.setLayoutX(xPos);
			feedbackCircle.setLayoutY(yPos);
			this.getChildren().add(feedbackCircle);
			
			if (xPos == 11.5) {
				xPos += 27;
			} else if (xPos == 38.5) {
				xPos -= 27;
				yPos += 27;
			}
		}
		this.getChildren().add(new HorizontalRectangle());
		this.getChildren().add(new VerticalRectangle());
		this.setStyle("-fx-background-color: #999999; -fx-background-radius: 6px");
		this.setMinHeight(50);
		this.setMinWidth(50);
	}
	
	public ComputerFeedbackOnTurnCirclesPane(List<Color> computerFeedbackOnTurn) {
		
		double xPos = 11.5;
		double yPos = 11.5;
		
		for (Color color : computerFeedbackOnTurn) {
			Circle feedbackCircle = new Circle();
			feedbackCircle.setRadius(6);
			feedbackCircle.setFill(color);
			feedbackCircle.setLayoutX(xPos);
			feedbackCircle.setLayoutY(yPos);
			this.getChildren().add(feedbackCircle);
			
			if (xPos == 11.5) {
				xPos += 27;
			} else if (xPos == 38.5) {
				xPos -= 27;
				yPos += 27;
			}
		}
		
		this.getChildren().add(new HorizontalRectangle());
		this.getChildren().add(new VerticalRectangle());
		this.setStyle("-fx-background-color: #999999; -fx-background-radius: 6px");
		this.setMinHeight(50);
		this.setMinWidth(50);
	}
}
