/**
 * 
 */
package weekone;

import java.util.Scanner;

/**
 * @author lesliegil
 *
 */
public class AreaCalculator {
	public static void main (String[] args) {
		
		//declaring variables
		double radius;
		double area;
		
		//assign input variable
		Scanner input = new Scanner(System.in); 
		System.out.println("Please enter radius..."); 
		radius = input.nextDouble(); 
		
		//calculate the area
		area = radius * radius * 3.14159;
		
		//print info
		System.out.println("The radius is " +radius + ", therefore the area will be " +area);	
	
		//close Scanner
		input.close();
	}
}
