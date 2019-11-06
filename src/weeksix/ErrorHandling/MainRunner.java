package weeksix.ErrorHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRunner {
	public static void main(String[] args) throws Throwable {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the first number:");

		try {
			double a = scn.nextDouble();
			System.out.println("Please enter the second number");
			double b = scn.nextDouble();
			System.out.println("Enter 1 to add, 2 to divide");
			int c = scn.nextInt();

			ErrorCalculator calc = new ErrorCalculator();

			if (c == 1) {
				calc.add(a, b);

			} else if (c == 2) {
				calc.division((int) a, (int) b);
			}
		} //Note the exception hierarchy
		/*
		catch (InputMismatchException e) {
			System.out.println("Check your input!");
		}
		catch(ArithmeticException e) {
			System.out.println("Divisor cannot be 0");
		}*/
		catch (Exception e){
			//add another try catchblock to handle this
			//throw new Exception("Something went wrong!");
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of code!");

	}

}
