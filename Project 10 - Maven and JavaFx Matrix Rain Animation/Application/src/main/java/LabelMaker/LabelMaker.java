package LabelMaker;
import java.util.ArrayList; 
import java.util.List;
import RandomNumbers.RandomNumberGenerator;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;

public class LabelMaker {

	RandomNumberGenerator ranGen;
	
	public List<List<Label>> getLabels() {
		List<List<Label>> allLabels = new ArrayList<List<Label>>();
		ranGen = new RandomNumberGenerator();
	
		int width = 16;
		int heigth = 23;
		int translateX = 0;
		int translateY = 594;
		
		String availableChars = "ｦｱｳｴｵｶｷｹｺｻｼｽｾｿﾀﾂﾃﾅﾆﾇﾈﾊﾋﾎﾏﾐﾑﾒﾓﾔﾕﾗﾘﾜ";
		
		for (int j = 0; j < 63; j++) {
		List<Label> labels = new ArrayList<Label>();
			
			for (int i = 0; i < 28; i++) {
				Label label = new Label();
				label.setTextAlignment(TextAlignment.CENTER);
				String character = "";
				character += availableChars.charAt(ranGen.generate(availableChars.length()-1));
				label.setText(character);
				label.setMinSize(width, heigth);
				label.setMaxSize(width, heigth);
				label.setStyle("-fx-text-fill: black; -fx-font-weight: bold; -fx-font-size: 20px;");
				label.setTranslateX(translateX);
	 			label.setTranslateY(translateY);
				labels.add(label);
				translateY-=22;
			}
		allLabels.add(labels);	
		translateY = 594;
		translateX +=16;	
		}	
		
		return allLabels;
	}
	
}
