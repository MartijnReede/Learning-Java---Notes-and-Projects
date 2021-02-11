
public class IfElseStatmentsAndSwitchConditions {

	public static void main(String[] args) {
		
		// Control flow --> Possibility to branch out in other directions. 
		
		boolean hungry = true;
	
		// if (hungry == true) is not necessary!! the boolean value is true or false by itself. 
		
		if (hungry) {
			System.out.println("I am starving!");
		} else {
			System.out.println("I am not hungry.");
		}
		
		if (2 == 2) {
			System.out.println("This will always play since 2 equals 2.");
		} else {
			System.out.println("This will never play since 2 == 2 is not false.");
		}
		
		int hungerRating = 5;
		
		if (hungerRating < 6) {
			System.out.println("Not hungry!");	
		} else {
			System.out.println("I am starving!");
		}
		
		// Use of the not-operator "!". 
		if (!(hungerRating < 6)) {
			System.out.println("Not hungry!");
		} else {
			System.out.println("I am starving!");
		}
		
		// Other if-else examples
		int favoriteTemp = 27;
		int currentTemp = 18;
		String opinion;
		
		if(currentTemp  < favoriteTemp - 20){
			opinion = "It is very... very.... cold";
		} else if (currentTemp < favoriteTemp - 8 ) {
			opinion = "It's kinda cold";
		} else if (currentTemp > favoriteTemp + 8) {
			opinion = "It's kinda warm";
		} else if (currentTemp > favoriteTemp + 20 ) {
			opinion = "It's boiling hot!";
		} else {
			opinion = "It's a beautiful day!";
		}
		
		System.out.println(opinion);
	
		int month = 6;
		String monthString;
		
		switch(month){
		
		case 1:
			monthString = "Januari";
			break;	
		
		case 2:
			monthString = "Februari";
			break;	
		
		case 3:
			monthString = "March";
			break;	
		
		case 4:
			monthString = "April";
			break;	
		
		case 5:
			monthString = "May";
			break;	
		
		case 6:
			monthString = "June";
			break;	
		
		case 7:
			monthString = "Juli";
			break;	
		
		case 8:
			monthString = "August";
			break;	
		
		default:
			monthString = "No idea";
		}
		
		System.out.println(monthString);
	}
}
