package weekone;

import java.util.Scanner;

public class SalesTax {
	public static void main(String[] args) {
		//Write a program that displays the sales tax with two 
		//digits after the decimal point. Use current NY sales tax rate -8.875%
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter total price...");
		double price = input.nextDouble();
		double taxRate = .08875;
		double salesTax = taxRate * price;
		
		System.out.format("The sales tax to be charged is " +  String.format("$%.2f", salesTax));
		
		input.close();
		
	}

}
