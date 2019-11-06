package weektwo;

import java.util.Scanner;

public class SubtractionProbs {
	public static void main(String [] args) {
		
		int count = 0;
		int response;
		int answer;
		int numCorrect = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(count < 5) {
			int randomNum1 = (int)(Math.random()* 10); //generate 2 random nums for each iteration
			int randomNum2 = (int)(Math.random() * 10);
			
			
			System.out.println("What is " + randomNum1 + " - " +randomNum2 + "?");
			answer = randomNum1 - randomNum2;
			response = input.nextInt(); 
			
			if(response == answer) {
				numCorrect += 1;
			}

			count++;
			
		}
		
		System.out.println("You got " + numCorrect + " / 5 questions right!");
		
		input.close();
	}

}
