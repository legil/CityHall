package weekone;

import java.util.Scanner;

public class TriAngles {
	//Write a program that prompts the user to enter the 
	//x-and y-coordinates of the three corner points in a triangle and then displays the triangle’s angles. 
	
	public static void main(String[] args) {
		double x, y;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter X cooridinate");
		x = input.nextDouble();
		
		
		System.out.println("Please enter Y cooridinate");
		y = input.nextDouble();	
		
		input.close();
		
	}
}
