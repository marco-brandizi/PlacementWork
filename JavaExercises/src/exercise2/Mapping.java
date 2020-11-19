package exercise2;

import java.util.HashMap;
import java.util.Scanner;

public class Mapping {

	public static void main(String[] args) {
		HashMap<String, String> nameMap = new HashMap<String, String>();
		nameMap.put("a1234", "Steve Jobs");
		nameMap.put("a1235", "Scott McNealy");
		nameMap.put("a1236", "Jeff Bezos");
		nameMap.put("a1237", "Larry Ellison");
		nameMap.put("a1238", "Bill Gates");
		
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter an ID: ");
		String userInput1 = myObj.nextLine();
		
		if (userInput1 != null) {
			
			String userInputL = userInput1.substring(0,1).toLowerCase() + userInput1.substring(1);
			
			if (nameMap.containsKey(userInputL)) {
				
				System.out.println("VALID KEY");
				System.out.println("RELATED NAME: " + nameMap.get(userInputL));
				
			} else {
				
				System.out.println("INVALID KEY");
				
			}
			
		} else {
			
			System.out.println("INVALID");
			
		}
		
		//if (nameMap.containsKey(userInput1)) {
			
			//System.out.println("The Key you inputted exists in the Map");
			//String userInputL = userInput1.substring(0,1).toLowerCase() + userInput1.substring(1);
			//System.out.println("The name related to that key is " + nameMap.get(userInputL));
			
		//} else {
			
			//System.out.println("Either The Key you inputted doesn't exist in the Map or you didn't type in a valid Name or Key.");
		//}
		
		
		

	}

}
