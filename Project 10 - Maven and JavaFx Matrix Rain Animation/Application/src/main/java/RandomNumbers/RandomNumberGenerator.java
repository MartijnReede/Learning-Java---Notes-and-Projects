package RandomNumbers;
import java.util.Random;

public class RandomNumberGenerator {

	public int generate(int max) {
		int chosenNumber = new Random().nextInt(max);
		return chosenNumber;
	}
}
