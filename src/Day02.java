// Day 2: Operators
import java.util.*;

public class Day02 {
	
	static void solve(double mealCost, int tipPercent, int taxPercent) {
		double tip = (mealCost * tipPercent) / 100;
		double tax = (mealCost * taxPercent) / 100;
		
		double totalCost = mealCost + tip + tax;
		int totalCostInt = (int)Math.round(totalCost);
		
		// Test Case 1: 15
		// Test Case 2: 19
		System.out.println(String.valueOf(totalCostInt));
	}
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Test Case 1: 12.00 20 8
		// Test Case 2: 15.50 15 10
		double mealCost = Double.valueOf(scan.nextDouble());
		int tipPercent = Integer.valueOf(scan.nextInt());
		int taxPercent = Integer.valueOf(scan.nextInt());
		
		solve(mealCost, tipPercent, taxPercent);
		
		scan.close();
		
	}
}
