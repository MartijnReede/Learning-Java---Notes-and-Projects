package application;
import java.util.ArrayList; 
import java.util.List;
import javafx.scene.shape.Rectangle;

public class Levels {

private static List<Rectangle> allRectangles;	
private static List<RectangleSpecs> levelInfo;	
	
	public static List<Rectangle> getLevel(int level) {
		
		if (level == 1) {
			
			levelInfo = new ArrayList<RectangleSpecs>();
			allRectangles = new ArrayList<Rectangle>();	
			level1();
				
			for (RectangleSpecs specs : levelInfo) {
				
				Rectangle rect = new Rectangle();
				rect.setX(specs.getXloc());
				rect.setY(specs.getYloc());
				rect.setWidth(specs.getWidth());
				rect.setHeight(specs.getHeigth());
				
				if (specs.getColor() == 1) {
					rect.setStyle("-fx-fill: orange; -fx-stroke: lightgray; -fx-stroke-width: 1;");	
				
				} else if (specs.getColor() == 2) {
					rect.setStyle("-fx-fill: DarkOrange; -fx-stroke: lightgray; -fx-stroke-width: 1;");
				
				} else if (specs.getColor() == 3) {
					rect.setStyle("-fx-fill: orangered; -fx-stroke: lightgray; -fx-stroke-width: 1;");
				
				} else if (specs.getColor() == 4) {
					rect.setStyle("-fx-fill: FireBrick; -fx-stroke: lightgray; -fx-stroke-width: 1;");
				}
				
				allRectangles.add(rect);
			}
		}
				
		if (level == 2) {
			
			allRectangles = new ArrayList<Rectangle>();
		    levelInfo = new ArrayList<RectangleSpecs>();
			level2();
			
				for (RectangleSpecs specs : levelInfo) {
				
				Rectangle rect = new Rectangle();
				rect.setX(specs.getXloc());
				rect.setY(specs.getYloc());
				rect.setWidth(specs.getWidth());
				rect.setHeight(specs.getHeigth());
				
				if (specs.getColor() == 4) {
					rect.setStyle("-fx-fill: #D557D6; -fx-stroke: lightgray; -fx-stroke-width: 1;");	
				
				} else if (specs.getColor() == 3 || specs.getColor() == 5) {
					rect.setStyle("-fx-fill: #AC54D4; -fx-stroke: lightgray; -fx-stroke-width: 1;");
				
				} else if (specs.getColor() == 2 || specs.getColor() == 6) {
					rect.setStyle("-fx-fill: #8451D2; -fx-stroke: lightgray; -fx-stroke-width: 1;");
				
				} else if (specs.getColor() == 1 || specs.getColor() == 7) {
					rect.setStyle("-fx-fill: #5A4FCF; -fx-stroke: lightgray; -fx-stroke-width: 1;");
				}
				allRectangles.add(rect);
			}
		}
		return allRectangles;
	}



	public static void level1() {
		
		double Xcor = 110;
		double Ycor = 60;
		
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				RectangleSpecs rect1 = new RectangleSpecs(Xcor, Ycor, i);
				levelInfo.add(rect1);
				Xcor += 80;
			}
			
			Xcor = 110;
			Ycor += 40;
		}
	}
	
	public static void level2() {
		
		double Xcor1 = 350;
		double Xcor2 = 350;
		double Ycor = 60;
		int blocks = 1;
		boolean increase = true;
		
		for (int i = 1; i < 8; i++) {
			
			if (i == 4) {
				increase = false;
			}
			
			for (int j = 0; j < blocks; j++) {
				RectangleSpecs rect2 = new RectangleSpecs(Xcor1, Ycor, i);
				levelInfo.add(rect2);
				Xcor1 += 80;
			}
			
			Ycor += 40;
			
			if (increase == true) {
				Xcor2 -= 80;
				Xcor1 = Xcor2;
				blocks += 2;
			}else if (increase == false) {
				Xcor2 += 80;
				Xcor1 = Xcor2;
				blocks -= 2;
			}
		}
	}
}


