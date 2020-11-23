// Day 04: Class vs. Instance
import java.util.*;

class Person {
	private int age;
	
	Person (int initialAge) {
		if (initialAge < 0) {
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		
		this.age = initialAge;
	}
	
	public void yearPasses() {
		this.age++;
	}
	
	public void amIOld() {
		if (this.age < 13) {
			System.out.println("You are young.");
		} else if (this.age >= 13 && this.age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}
}

public class Day04 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Number of cases
		int T = scan.nextInt();
		
		for (int i = 0; i < T; i++) {
			int age = scan.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		
		scan.close();
	}
}
