package weekone;

import java.util.Scanner;

public class HexToDecimal {
	public static void main(String args[]){  
		//OO to FF -> decimal value
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a hexadecimal value");
		String hexVal = input.next();
 
		int decimal=Integer.parseInt(hexVal,16);  
		System.out.println(decimal);  
		input.close();
	}
	
		
	}  

