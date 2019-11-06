package reviewweekeight;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class UniqueUsername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Declare HashMap
		LinkedHashMap<String, Integer> hmap = new LinkedHashMap<String, Integer>();
		
		// Declare Scanner
		Scanner input = new Scanner(System.in);
		
		// Flag for loop
		boolean flag = true;
		
		// As long as the flag is true
		while(flag) {
			// Ask the user for a user name
			System.out.println("Enter a username: ");
			String userInput = input.next();
			// If they enter exit, break out of the loop
			if(userInput.toLowerCase().equals("exit")) {
				break;
			}
			// If the key is already in the map, increment its value
			// Example: An empty HashMap, I enter Bob, it skips the if and goes into the else
			// Bob gets put into the Hash map with a value of 1. If I enter Bob again, I add 1 to the
			// value of Bob. So, Bob now has a value of 2. Now, what I want to do, is make a 
			// temp string that concats Bob with its value, however my value is 2, so I should
			// minus 1. So once I minus 1 from the value and then I concat. That's how I get "Bob1"
			else if(hmap.containsKey(userInput)) {
				hmap.put(userInput, hmap.get(userInput)+1); // bob : 2
				int tempValue = hmap.get(userInput)-1; // 1
				String temp = userInput + tempValue; // "bob1"
				hmap.put(temp, 1); // add "bob1" to the hashmap
			}
			else {
				hmap.put(userInput, 1); // bob initially 1
			}
		}
		
		// Print just the key using lambda expression
		hmap.forEach((key, value) -> {
			System.out.println(key);
		});
		
		// Close Scanner
		input.close();

	}

}
