// Day 01: Data Types
import java.util.*;

public class Day01 {
	
	
	public static void main(String[] args) {
		
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
       
        /* Declare second integer, double, and String variables. */
        int my_int;
        double my_double;
        String my_string; // is the best place to learn and practice coding!
		
		Scanner scan = new Scanner(System.in);
		
		/* Read and save an integer, double, and String to your variables.*/
		my_int = Integer.parseInt(scan.next());
		my_double = Double.parseDouble(scan.next());
		my_string = scan.next();
		my_string += scan.nextLine();
		
		
		scan.close();
		
		System.out.println(String.format("%d", i + my_int));
		System.out.println(String.format("%.1f", d + my_double));
		System.out.println(s + my_string);

	}

}
