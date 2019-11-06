package weekone;

import java.util.Scanner;

public class CelsiusToFarenheit {
	public static void main(String [] args) {
		
		//Write a formula that computes celcius from farenheit
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter degrees in Farenheit...");
		
		double degreesInFarenheit = input.nextDouble();
		double degreesInCelcius;
		
		degreesInCelcius = (5.0/9.0) * (degreesInFarenheit - 32);
		
		System.out.println(degreesInCelcius);
		
		input.close();
	
	}
}
