package weektwo;

import java.util.Scanner;

public class PrimeCheck {
	
	static boolean checkPrime(int numberToCheck) {
		for(int i = (numberToCheck / 2); ((i>=2) || (numberToCheck < 2)) ; i--) {
			if(numberToCheck<2 || numberToCheck % i == 0) {
				return false;
			}
		}
			
		return true;
	}

		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("What is the number you want to check if its a prime number?");
			int numberToCheck = input.nextInt();
			
			System.out.println(checkPrime(numberToCheck));
			
			input.close();
			
		}
	

}
