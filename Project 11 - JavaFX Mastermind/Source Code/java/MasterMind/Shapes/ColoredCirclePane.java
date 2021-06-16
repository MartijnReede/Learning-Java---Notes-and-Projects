package MasterMind.Shapes;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ColoredCirclePane extends Pane {
	
	public ColoredCirclePane(Color circleColor, boolean isCode) {
		Circle circle = new Circle();
		circle.setFill(circleColor);
		circle.setRadius(10);
		circle.setLayoutX(25);
		circle.setLayoutY(25);
		
		if (isCode) this.setStyle("-fx-background-color: black; -fx-background-radius: 6px;");
		else this.setStyle("-fx-background-color:#999999 ; -fx-background-radius: 6px");
		
		this.setMinHeight(50);
		this.setMinWidth(50);
		this.getChildren().add(circle);
	}
}
