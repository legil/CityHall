package weektwo;

import java.util.Scanner;

public class TwoAndThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number...");
		int num;
		
		num = input.nextInt();
		
		System.out.println("Is " + num + " divisible by 2 and 3? " + ((num % 2 == 0) && (num % 3 == 0)));
		System.out.println("Is " + num + " divisible by either 2 or 3? " + ((num % 2 == 0) || (num % 3 == 0)));
		System.out.println("Is " + num + " divisible by 2 or 3, but not both? " + ((num % 2 == 0) ^ (num % 3 == 0))); 
		
		input.close();
		
	}
}
