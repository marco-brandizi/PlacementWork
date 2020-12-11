package exercise4;

import java.util.HashMap;
import java.util.Scanner;

public class NumberMap {

	public static void main(String[] args) {
		HashMap<Integer, String> numberMap = new HashMap<Integer, String>();
		
		numberMap.put(1, "One, Un, Uno");
		numberMap.put(2, "Two, Deux, Dos");
		numberMap.put(3, "Three, Trois, Tres");
		numberMap.put(4, "Four, Quatre, Cuatro");
		numberMap.put(5, "Five, Cinq, Cinco");
		numberMap.put(6, "Six, Six, Seis");
		numberMap.put(7, "Seven, Sept, Siete");
		numberMap.put(8, "Eight, Huit, Ocho");
		numberMap.put(9, "Nine, Neuf, Nueve");
		numberMap.put(10, "Ten, Dix, Diez");
		
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter a number from 1-10: ");
		String userInput = myObj.nextLine();
		int userNumb = Integer.parseInt(userInput);
		
		if (userInput != null) {
			//while (userInput != null) {
				if (numberMap.containsKey(userNumb)) {
					System.out.println("Number in English, French and Spanish: " + numberMap.get(userNumb));
					//do loop, ask for input, if not null compute result, if null then end
				} else {
					System.out.println("Number Not Within Range");
				}
			//}
		} else {
			System.out.println("No Number Entered");
		}

	}

}
