package application;

public class RectangleSpecs {

	private double X;
	private double Y;
	private int color;
	private double brickWidth;
	private double brickHeigth;

	public RectangleSpecs(double X, double Y, int color) {
		this.X = X;
		this.Y = Y;
		this.color = color;
		this.brickWidth = 79;
		this.brickHeigth = 39;
	}
	
	public double getXloc() {
		return X;
	}
	
	public double getYloc() {
		return Y;
	}
	
	public int getColor() {
		return color;
	}
	
	public double getWidth() {
		return brickWidth;
	}
	
	public double getHeigth() {
		return brickHeigth;
	}
}




