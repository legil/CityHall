package weekone;

import java.util.Scanner;

public class SecondsToMins {
	
	//Write a program that obtains minutes and remaining seconds from seconds
	public static void main (String args[]) {
		
		//take in number of seconds from user
		//convert seconds to mins
		//display mins and seconds
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of seconds...");
		int seconds = input.nextInt();
		
		int mins = seconds / 60;
		int remainingSeconds = seconds % 60;
		
		System.out.println("In " + seconds + " seconds, there are " + mins + " minutes plus " + remainingSeconds + " seconds");
		
		input.close();
		
		
	}
}
