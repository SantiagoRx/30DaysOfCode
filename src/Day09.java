// Day 09: Recursion
import java.util.*;

public class Day09 {
	
	static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n -1);
		}
	}

	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = SCANNER.nextInt();
		SCANNER.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int result = factorial(n);
		
		SCANNER.close();
		
		System.out.printf("factorial(%d)=%d", n, result);
	}
}
