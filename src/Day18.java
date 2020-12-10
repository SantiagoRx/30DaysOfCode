// Day 18: Queues and Stacks

import java.util.*;

public class Day18 {
	
	public LinkedList<Character> queue = new LinkedList<>();
	public Stack<Character> stack = new Stack<>();
	
	
	public void pushCharacter(char c) {
		stack.push(c);
	}
	
	public char popCharacter() {
		char element = 0;
		
		if (!stack.isEmpty()) {
			element = (char) stack.pop();
		}
		
		return element;
	}
	
	public void enqueueCharacter(char c) {
		queue.addLast(c);
	}
	
	public char dequeueCharacter() {
		char element = 0;
		
		if (!queue.isEmpty()) {
			element = (char) queue.remove(0);
		}
		
		return element;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        
        // Convert input String to an array of characters:
        char[] s = input.toCharArray();
        
        // Create a Solution object:
        Day18 p = new Day18();
        
        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        
        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }
        
      //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
       
	}
}
