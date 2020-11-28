// Day 08: Dictionaries and Maps
import java.util.*;

public class Day08 {

	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = SCANNER.nextInt();
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {
			String name = SCANNER.next();
			int phone = SCANNER.nextInt();
			
			phoneBook.put(name, phone);
		}
		
		
		while (SCANNER.hasNext()) {
			String searchName = SCANNER.next();
			if (phoneBook.containsKey(searchName)) {
				System.out.println(searchName + "=" + phoneBook.get(searchName));
			} else {
				System.out.println("Not found");
			}
		}
		
		SCANNER.close();
	}
	
}
