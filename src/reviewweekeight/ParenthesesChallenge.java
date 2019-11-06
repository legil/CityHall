package reviewweekeight;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesesChallenge {
	
	/*
	 * Given a string consisting of curly braces, square brackets and/or parenthesis,
	 * check if the string is balanced. In other words, for every opening brace/bracket/parens
	 * there is a closing brace/bracket/parens in the string 
	 * 
	 * Example input: {[()]} --> "Balanced"
	 * 				  {[({[})]} --> "Not Balanced"
	 */
	

	public static boolean isBalanced(String userInput, Stack<Character> stack) {
		for (int i = 0; i < userInput.length(); i++) {
			// add opening braces
			if (userInput.charAt(i) == '{' || userInput.charAt(i) == '[' || userInput.charAt(i) == '(') {
				stack.push(userInput.charAt(i));
			} // end if
			else if (stack.peek() == '{' && userInput.charAt(i) == '}'
					|| stack.peek() == '[' && userInput.charAt(i) == ']'
					|| stack.peek() == '(' && userInput.charAt(i) == ')') {
				stack.pop();
			}
		} // end for
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// {[({[]})]} - Balanced, returns true
		Stack<Character> stack = new Stack<Character>();
		System.out.println("Enter a string: ");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();

		if (isBalanced(userInput, stack)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
		input.close();

	}

}
