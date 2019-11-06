package weeksix;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class AllCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Part 1
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<String> names = new ArrayList<String>();
		TreeSet<Character> chars = new TreeSet<Character>();
		names.add("mariia");
		names.add("saiful");
		names.add("julian");
		names.add("soumba");
		names.add("kun");
		names.add("michael");
		names.add("elsa");
		names.add("ricardo");
		names.add("moez");
		names.add("xavier");
		names.add("ying");
		names.add("prishanti");
		//names.add("quasi");
		//names.add("walter");

		// For each name in the names list, the loop checks if the alphabet letter
		// of the name is not in the set. If not add it to the set
		names.forEach((n) -> {
			for (int i = 0; i < n.length(); ++i)
				if (!chars.contains(n.charAt(i)))
					chars.add(n.charAt(i));
		});

		System.out.println(chars); // prints out all the unique characters found

		// if the size of set is 26, all alphabet letters are present
		System.out.println("The combined names " + (chars.size() == 26 ? "contains" : "doesn't contain")
				+ " all 26 characters a-z");

//		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Part 2
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Asks user for a string of characters
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string of characters (e.g: abzghiftr): ");
		String charInput = scan.next().toLowerCase(); // converts input to ower case
		TreeSet<Character> charSet = new TreeSet<Character>();

		// checks if each alphabet character is in the set
		// if not, add it to set
		for (int i = 0; i < charInput.length(); ++i)
			if (!charSet.contains(charInput.charAt(i)))
				charSet.add(charInput.charAt(i));

		String name = "";
		// infinite loop until user enters exit
		while (true) {
			boolean isPossible = true; // boolean to assume name can be produced from string of characters
			System.out.println("\nEnter a name to see if it can be created by your string of characters.");
			System.out.println("You can enter \"exit\" without quotation marks to exit the loop");

			name = scan.next().toLowerCase(); // convert it to lower case

			if (name.equals("exit")) // if user enters exit, exit loop
				break;

			else {
				// check if each character of the name is in the set
				// if it's not in the set, the name can't be produced from the string of
				// characters
				// set boolean to false and break the loop
				for (int i = 0; i < name.length(); ++i)
					if (!charSet.contains(name.charAt(i))) {
						isPossible = false;
						break;
				}
					
				// print if it's possible or not
				System.out.println(name + " " + (isPossible ? "can" : "can't")
						+ " be produced from the string of characters " + charSet);
			}
		}
		scan.close(); // close scanner
	}
}
