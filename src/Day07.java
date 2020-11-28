// Day 07: Arrays 

import java.util.*;

public class Day07 {
	
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static void main(String[] args) {
		int arraySize = SCANNER.nextInt();
		SCANNER.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		Integer[] myArray = new Integer[arraySize];
		
		String[] arrayValues = SCANNER.nextLine().split(" "); 
		SCANNER.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int i = 0; i < arraySize; i++) {
			int arrayItem = Integer.parseInt(arrayValues[i]);
			myArray[i] = arrayItem;
		}
		
		SCANNER.close();
		
		String reverseArray = "";
		
		for (int i = myArray.length - 1; i >= 0; i--) {
			reverseArray += String.valueOf(myArray[i]) + " ";
		}
		
		System.out.println(reverseArray.trim());
	}

}
