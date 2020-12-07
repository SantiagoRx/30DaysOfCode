// Day 16: Exceptions

import java.util.*;

public class Day16 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String S = in.next();
		
		try {
			int myInt = Integer.parseInt(S); 
			System.out.printf("%d", myInt);
			
		} catch(Exception e) { 
			System.out.printf("Bad String");
			
		}
	}
}
