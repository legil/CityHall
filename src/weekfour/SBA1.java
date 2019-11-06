package weekfour;

import java.util.Arrays;
import java.util.Scanner;

public class SBA1 {
	
	//Write a program to sum up all the even number till 25th number in the Fibonacci series.
	
	public static void main(String [] args) {
		
		int beforePrev = 0;
		int prev = 1;
		
		int sum = prev; //sum will start at 1
		
		int [] nums = new int[25];
		nums[1] = prev; //first 2 numbers
		nums[0] = beforePrev;
		
		for(int i = 2; i < nums.length; i++){
			
			prev = nums[i - 1]; //assigning last 2 indices
			beforePrev = nums[i-2];
			
			nums[i] = (prev + beforePrev); //sums the last 2 numbers and assigns to current index
			sum = sum + nums[i]; //sums numbers as we traverse through loop

		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println("The sum of the first " + nums.length + " fibonacci numbers is " + sum);
	}	
}


class SBA1Problem2 {
		/*
		 * A word is said to be “abecedarian” if the letters in the word appear in alphabetical order. For example, the following are all 6-letter English abecedarian words.

		abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow, bijoux, biopsy, cestuy, chintz, deflux, dehors, dehort, deinos, diluvy, dimpsy

		Write a program for checking whether a given word (String) is abecedarian, assuming that the word contains only lower-case letters. Your process can be iterative or recursive.
		 */
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word"); //prompt user for a word
		String word = input.next();
		
		System.out.println(isAbecedarian(word) ? word + " is in alphabetical order!" : word + " is NOT in alphabetical order"); //prints whether true or false based on what method returns
		input.close(); //close Scanner
	}
	
	static boolean isAbecedarian(String word) {
		boolean inOrder = true; //default true
		
		for(int i = 0; i < word.length() - 1; i++) { 
			if((word.toLowerCase().charAt(i)) > (word.toLowerCase().charAt(i+1))) { //traverse through string and check if any letter compared to the next one is out of order
				inOrder = false; //if out of order set inOrder to false
			}
		}
	
		return inOrder; //return the boolean value we found
	}
}
