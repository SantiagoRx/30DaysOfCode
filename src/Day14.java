// Day 14: Scope

import java.util.*;

class Difference {
	private int[] elements;
	public int maximumDifference;
	
	public Difference(int[] elements) {
		this.elements = elements;
	}
	
	/*void computeDifference() {
		int maximumTemp = 0;
		for (int i = 0; i < this.elements.length - 1; i++) {
			for (int j = i + 1; j < this.elements.length; j++) {
				if (elements[i] != elements[j]) {
					maximumTemp = Math.abs(elements[i] - elements[j]);
					if (maximumTemp > this.maximumDifference) {
						this.maximumDifference = maximumTemp;
					}
					System.out.printf("|%d - %d| = %d\n", elements[i], elements[j], Math.abs(elements[i] - elements[j]));
				}
			}	
		}
	}*/
	
	void computeDifference() {
		int max = elements[0];
		int min = elements[0];
		
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < min) {
				min = elements[i];
			}
			if (elements[i] > max) {
				max = elements[i];
			}
		}
		
		this.maximumDifference = Math.abs(max - min);
	}
}


public class Day14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
	}
}
