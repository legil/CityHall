package weekthree;

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number...");
		int number = input.nextInt();
		int numFactorial = computeFactorial(number);
		System.out.println(number + "! = " + numFactorial);
		
	}
	
	static int computeFactorial(int num) {
		int result = 1;
		
		if(num >= 1 && num != 0) {
			result = num * computeFactorial(num-1);
		} else if(num == 0) {
			result = 1;
		}
		
		return result;
	}

}
