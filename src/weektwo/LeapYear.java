package weektwo;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a year:");
		int year = input.nextInt();
		
		System.out.println("Year (" + year + " % 4 == 0) or (" + year + " % 100 != 0) + is " + (((year%4==0) && (year%100!=0))||(year%400==0)));
		System.out.println((((year % 4  == 0)|| (year % 100 != 0)) &&(year%400==0)));
		

	input.close();
	
	
	}

}
