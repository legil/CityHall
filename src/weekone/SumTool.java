package weekone;

import java.lang.Math;
import java.util.Scanner;


public class SumTool {
	
	public static void main(String[] args) {
		int num1 =  0 + (int) (Math.random() * 10);
		int num2 = 0 + (int) (Math.random() * 10);
		
		
		
		System.out.println("What is " + num1 + " + " + num2 + "?");
		Scanner input = new Scanner(System.in);
		int response = input.nextInt();
		
		System.out.println("Your answer was " + (response == (num1+num2)));
		
		System.out.println();
		
		input.close();
		
		//syso +ctrl space 
		//main +ctrl space
		
	}
}

