// Day 10: Binary Numbers

import java.util.*;

public class Day10 {
	
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = SCANNER.nextInt();
		SCANNER.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		SCANNER.close();
		
		String binary_n = Integer.toBinaryString(n);
		int realMax = 0;
		int tempMax = 0;
		
	 	for (int i = 0; i < binary_n.length(); i++) {
	 		if (binary_n.charAt(i) == '1') {
	 			tempMax += 1;
	 		} else {
	 			tempMax = 0;
	 		}
	 		
	 		if (tempMax > realMax) {
 				realMax = tempMax;
 			}
	 	}
	 	
	 	//System.out.printf("Binario: %s, maximos 1: %d",binary_n,  realMax);
	 	System.out.println(realMax);
		
	}
}
