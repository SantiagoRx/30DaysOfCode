// Day 6: Let's Review

import java.util.*;

public class Day06 {
	
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Number of cases
		int T = SCANNER.nextInt();
			
		for (int j = 0; j < T; j++) {
			String myString = SCANNER.next();
			
			char[] myCharArray = myString.toCharArray();
			String oddChar = "";
			String evenChar = "";
			
			for(int i = 0; i < myString.length(); i++) {
				if(i % 2 != 0) {
					oddChar += myCharArray[i];
				} else {
					evenChar += myCharArray[i];
				}
			}
			
			System.out.println(evenChar + " " + oddChar);
		}
		
		SCANNER.close();
	}
	
}
