package MasterMind.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.scene.paint.Color;

public class CodeChecker {
	
	/* PINK = Placed color exists in the code, but it is not on the right position. 
	 * BROWN = Placed color is on the right position.
	 * WHITE = Nothing of the above.
	 */
	
	public List<Color> checkCode(List<Color> code, List<Color> currentTurnChosenColors){
		
		List<Color> computerFeedbackOnTurn = new ArrayList<Color>();
		
		for (int i = 0; i < currentTurnChosenColors.size(); i++) {
			
			if (currentTurnChosenColors.get(i).equals(code.get(i))) {
				computerFeedbackOnTurn.add(Color.SADDLEBROWN);
			} else if (code.contains(currentTurnChosenColors.get(i))) {
				computerFeedbackOnTurn.add(Color.PINK);
			}
		}
	
		while (computerFeedbackOnTurn.size() < 4) {
			computerFeedbackOnTurn.add(Color.WHITE);
		}
		
		computerFeedbackOnTurn = changeIndexPositions(computerFeedbackOnTurn);
		
		return computerFeedbackOnTurn;
	}
	
	public List<Color> changeIndexPositions(List<Color> computerFeedbackOnTurn) {
				
		Random rand = new Random();
		for (int i = 0; i < 4; i++) {
			int randomNumber1 = rand.nextInt(4); 
			int randomNumber2 = rand.nextInt(4);
			
			Color temp = computerFeedbackOnTurn.get(randomNumber1);
			computerFeedbackOnTurn.set(randomNumber1, computerFeedbackOnTurn.get(randomNumber2));
			computerFeedbackOnTurn.set(randomNumber2, temp);			
		}
		return computerFeedbackOnTurn;
	}
}
