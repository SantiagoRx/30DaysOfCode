// Day 03: Conditional Statements
import java.util.*;

public class Day03 {
	
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static void main (String[] args) {
		int N = SCANNER.nextInt();
		
		SCANNER.close();
		
		if (N % 2 != 0 || (N >= 6 && N <= 20)) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}
		
	}
}
