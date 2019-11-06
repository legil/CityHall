package weektwo;

import java.util.Scanner;

public class GCD {
	public static void main(String [] args) {
		int num1=0, num2=0, gcd=0, min;
		
		Scanner input = new Scanner(System.in);
		
		while(num1 <= 0 || num2 <= 0) {
			System.out.println("PLease enter a first number");
			num1=input.nextInt();
		
			System.out.println("Please enter a second number");
			num2=input.nextInt();
		}
		
		int max = Math.max(num1, num2);
		min = Math.min(num1, num2);
		
		for(int i = 1; i <= min; i++) {
			if(((min % i) == 0) && ((max % i) == 0)){
				gcd = i;
			}
		}
		
		
		System.out.println("The greatest common denominator is " + gcd);
		
		input.close();
		
		
	}

}
