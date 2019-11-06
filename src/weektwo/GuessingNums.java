package weektwo;

import java.util.Scanner;

public class GuessingNums {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int randomNum = 0 + (int) (Math.random() * 101);
		
		System.out.println("Please enter a guess!");
		int userInput = input.nextInt();
		
		while (userInput != randomNum) {
			if(userInput < randomNum) {
				System.out.println("Input is too low. Try again ---");
			} else if(userInput > randomNum) {
				System.out.println("Input is too high. Try again ---");
				
			} 
			userInput = input.nextInt();
		}
		
		System.out.println("Correct, that is the right number!");

		input.close();	
		
	}
}
