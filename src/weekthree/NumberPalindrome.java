package weekthree;

import java.util.Scanner;

public class NumberPalindrome {
	//Write a Java program to check if a number is a palindrome is Java (Eg: 121 is a palindrome, 321 is not
	//Write your program in a way that if you need a string later, it is a minimal change
	
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number...");
		String number = Integer.toString(input.nextInt());
		
		System.out.println(palindromeCheck(number));
		input.close();
		
	}
	
	static boolean palindromeCheck(String number) {
		
		String reversed = "";
		for(int i = number.length()-1; i >= 0; i--) {
			reversed = reversed + number.charAt(i);
		}
		
		return number.equalsIgnoreCase(reversed); //reversed.toLowerCase() //practice ternary operator
		//alternative solution: can approach from both ends to midpoint
	}
		
}


