// Day 12: Inheritance

import java.util.*;

class Persona {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Persona(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Persona {
	
	private int[] scores;
	
	Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		this.scores = scores;
	}
	
	char calculate() {
		int sumScores = 0;
		char grade;
		
		for (int i = 0; i < this.scores.length; i++) {
			sumScores += this.scores[i];
		}
		
		int average = sumScores / this.scores.length + 1;
		
		if (average >= 90) {
			grade = 'O';
		} else if (average >=80 && average < 90) {
			grade = 'E';
		} else if (average >= 70 && average < 80) {
			grade = 'A';
		} else if (average >= 55 && average < 70) {
			grade = 'P';
		} else if (average >= 40 && average < 55) {
			grade = 'D';
		} else {
			grade = 'T';
		}
		
		return grade;
	}
}


public class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
