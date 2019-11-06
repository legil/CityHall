package weektwo;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		//Create a loop that will take an integer from user input.
		//If the integer is odd, add 1 and then divide that by 2 and print the new number.
		//If the integer is even, just divide by 2 and print the new number.
		//Continue doing this until you reach 1.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer...");
		int num = input.nextInt();
		
		while(num >= 1) {
			num = half(num);
			num--;
		}
		
		input.close();
	}
	
	static int half(int num) {
		if(num % 2 != 0) { //if number is odd
			num = num / 2 + 1;
			System.out.println("The number plus 1 and divided by 2 is " + num);	
		} 
		else { //if number is even
			num = num / 2; 
			System.out.println("The number divided in half is " + num);	
		}
		return num;
	}		
}


class Problem2{
	public static void main(String[] args) {
		//Ask the user to input multiple words separated by commas (,)
		//Put those words into a String array, and print out that String array 
		//for the user to see.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter multiple words separated by commas...");
		
		String[] words = input.next().split(",");
		System.out.println(Arrays.toString(words));
		input.close();
		
	}
}

class Problem3{
	public static void main(String[] args) {
		/*
		 * Did you know that using a loop, you can examine a String one letter at a time? 
	The two key built-in String methods are length() and charAt().

	length() returns an int representing the total number of characters in the String 
	charAt( int n ) returns character at position n of the string (the character positions start at 0)
	
	Try using to print the character and position number for every character in a string from user input!
	
	Your output could look like the following:
	What is your message?
	>Hello World
	
	Here are all the characters, one at a time:
	0: 'H'
	1: 'e'
	2: 'l'
	3: 'l'
	4: 'o'
	5: ' '
	6: 'W'
	7: 'o'
	8: 'r'
	9: 'l'
	10: 'd'
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a message...");
		String word = input.nextLine();
		for(int i = 0; i< word.length(); i++) {
			System.out.println(i + ": '" + word.charAt(i) + "'");
		}
		input.close();
	}
}

class Problem4{
	public static void main(String[] args) {
		/*
		 * Create an integer named [pin] and set it to a 4-digit number.
		Welcome the user to your application and ask them to enter their pin.
		If they get it wrong, print out "INCORRECT PIN. PLEASE TRY AGAIN"
		Keep asking them to enter their pin until they get it right.
		Finally, print "PIN ACCEPTED. YOU HAVE $0.00 IN YOUR ACCOUNT. GOODBYE."
		 */
		
		int createdPin = 0, enteredPin = 0; 
		
		Scanner input = new Scanner(System.in);
		
		//prompt user to create a 4-digit pin
		while(Integer.toString(createdPin).length() != 4) { //if int is not 4 digits
			System.out.println("Please CREATE your four-digit pin...");
			createdPin = input.nextInt();
		} 
		
		//prompt user to enter the same pin they created
		while(enteredPin != createdPin) { //if not matching
			System.out.println("Please enter your pin number: ");
			enteredPin = input.nextInt();
		}
		
		System.out.println("PIN ACCEPTED. You have $0.00 in your account. GOODBYE."); //if match
		input.close();
	}
}

class Problem5{
	public static void main(String[] args) {
		/*
		 * A complicated Pattern

		Write a program in Java to display a pattern like this:
		 
		    *
		   * *
		  * * *
		 * * * *
		* * * * *
		
		Modify the program so that the user can specify how many rows it should have.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of rows to display...");
		int numRows = input.nextInt();
		 
		  
        // outer loop for number of rows 
		for (int i = 1; i <= numRows; i++) 
        { 
  
            // inner loop for number of spaces 
            for (int j = numRows; j > i; j--) 
            { 
                System.out.print(" "); 
            } 
   
            //  inner loop for number of stars
            for (int k=1; k<=i*2; k++) 
            {  
                	if(k%2 !=0)
                		System.out.print("*");
                	else 
                		System.out.print(" ");
            }
                
            
            System.out.println();
            } 
   
            // end line after each row 
             
            input.close();
            
            //attempt this upside down
            
        } 
	
		
    } 
	
