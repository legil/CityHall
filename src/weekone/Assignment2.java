package weekone;

import java.util.Scanner;

public class Assignment2 {
	/*
		* Write a Java program that reads a number in inches, converts it to meters. 
		Note: One inch is 0.0254 meter.
		
		Example:
		Input a value for inch: 1000
		Expected Output: 1000.0 inch is 25.4 meters
	 */
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number of inches");
		double inches = input.nextDouble();
		
		double meters = inches * 0.0254; 
		
		System.out.println(inches + " inches equals " + meters + " meters");
		
		input.close();
	}
}

class A2P2{
	/*
	 * Write a Java program that takes two numbers as input and display the product of two numbers.

		Example:
		Input first number: 25
		Input second number: 5
		Expected Output: 25 x 5 = 125
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first number?");
		int num1= input.nextInt();
		
		System.out.println("What is your second number?");
		int num2 = input.nextInt();
		
		int output = num1 * num2;
		
		System.out.println("Input first number: " + num1 + "\n" + 
							"Input second number: " + num2 + "\n" + 
							"Expected output: " + num1 + " x " + num2 + " = " + output);
		
		input.close();
	}
}

class A2P3{
	/*
	 * Write a Java program that takes a number and prints the results of it multiplied from 1 to 10

		Example:
		Input a number: 8
		Expected Output:
		8 x 1 = 8
		8 x 2 = 16
		8 x 3 = 24
		...
		8 x 10 = 80
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number to multiply...");
		int num = input.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		
		input.close();
	}
}
