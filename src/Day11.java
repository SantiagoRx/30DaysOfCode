// Day 11: 2D Arrays
import java.util.*;

public class Day11 {
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		
		for (int i = 0; i < 6; i++) {
            String[] arrRowItems = SCANNER.nextLine().split(" ");
            SCANNER.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
		
		SCANNER.close();
		
		int maxSum =  Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length - 2; ++i) {
		      for (int j = 0; j < arr[i].length - 2; ++j) {
		        /*
		         * 16 hourglasses - graphical representation
		         * 
		         * System.out.println(arr[i][j] + " " + arr[i][j + 1] + " " + arr[i][j + 2]);
		         * System.out.println(" " + " " + arr[i + 1][j + 1] + " " + " ");
		         * System.out.println(arr[i + 2][j] + " " + arr[i + 2][j + 1] + " " + arr[i + 2][j + 2]);
		         */
		    	  int tempSum = 0;
		    	  tempSum += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
		    	  tempSum += arr[i + 1][j + 1];
		    	  tempSum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
		    	  
		    	  if (tempSum > maxSum) {
		    		  maxSum = tempSum;
		    	  }
		    	  
		      }
		 }
		
   	 
		System.out.println(maxSum);
	}
}
