package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rectangles extends Rectangle {
	
	public Rectangles(double y, double x, double size) {
		this.setY(y);
		this.setX(x);
		this.setWidth(size);
		this.setHeight(size);
		this.setFill(Color.BLACK);
	}
	
	public Rectangles(double y, double x, double width, double heigth) {
		this.setY(y);
		this.setX(x);
		this.setWidth(width);
		this.setHeight(heigth);
		this.setFill(Color.BLACK);
	}
	
	public Rectangles (double y, double x, double size, String food) {
		this.setY(y);
		this.setX(x);
		this.setWidth(size);
		this.setHeight(size);
		this.setFill(Color.DARKVIOLET);
	}

}

	

