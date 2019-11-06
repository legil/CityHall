package weektwo;

import java.util.Scanner;

public class RepeatAddition {
	public static void main(String [] args) {
		int randNum1, randNum2, result, userInput;
		
		randNum1 = (int)(Math.random() * 10);
		randNum2 = (int)(Math.random() * 10);
		
		result = randNum1 + randNum2;
		
		System.out.println("What is the addition of " + randNum1 + " + " + randNum2 + "?");
		Scanner input = new Scanner(System.in);
		userInput = input.nextInt();
		
		while(result != userInput) {
			System.out.println("Incorrect answer! Please try again ----");
			userInput = input.nextInt();
		}
		
		System.out.println("Correct answer!");
		
		input.close();
	}
}
