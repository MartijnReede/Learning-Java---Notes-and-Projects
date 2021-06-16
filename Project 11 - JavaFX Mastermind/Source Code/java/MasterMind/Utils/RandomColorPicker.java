package MasterMind.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.scene.paint.Color;

/* Color 0: Red.
 * Color 1: Blue.
 * Color 2. Green.
 * Color 3. Orange.
 * Color 4. Purple.
 * Color 5. Yellow.
 */

public class RandomColorPicker {
	
	public List<Color> createMasterMindCode(boolean onlyUniqueColors){
		List<Color> masterMindCode = new ArrayList<Color>();
		
		Random randomGenerator = new Random();
		
		while (masterMindCode.size() != 4) {
			Color color = null;
			int randomNumber = randomGenerator.nextInt(6);
			
			if (randomNumber == 0) color = Color.RED;
			else if (randomNumber == 1) color = Color.BLUE;
			else if (randomNumber == 2) color = Color.GREEN;
			else if (randomNumber == 3) color = Color.ORANGE;
			else if (randomNumber == 4) color = Color.PURPLE;
			else if (randomNumber == 5) color = Color.YELLOW;
			
			if (onlyUniqueColors && !masterMindCode.contains(color)) {
				masterMindCode.add(color);
			} else if (onlyUniqueColors == false) {
				masterMindCode.add(color);
			}
		}
		return masterMindCode;
	}
	
	
	
}
