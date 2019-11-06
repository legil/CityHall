package weekone;

import java.util.Scanner;

public class InterestRate {
	public static void main(String [] args) {
		
		//Write a program that lets the user enter the interest rate, number of years anf loan amount,
		// and computes monthly payment and total payment. (see formula)
		
		double interestRate;
		double numOfYears;
		double loanAmount;
		
		double monthlyInterestRate;
		double monthlyPayment;
		
		
		//What is the APR / Interest rate?
		//22.4%
		
		//monthly interest rate = APR/12
		//22.4/12 = 1.87% x 100 = .0187
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Interest Rate?");
		interestRate = input.nextDouble();
		
		System.out.println("What is the number of years?");
		numOfYears = input.nextDouble();
		
		System.out.println("What is the Loan Amount?");
		loanAmount = input.nextDouble();
		
		monthlyInterestRate = (interestRate / 12) / 100; //0.0186
		//System.out.println(monthlyInterestRate);
		
		double denominator = Math.pow((1 + monthlyInterestRate), numOfYears * 12);
		
		monthlyPayment = (loanAmount * monthlyInterestRate) / 
						(1 - (1 / denominator));
		
		System.out.println("Your monthly payment is " + String.format("$%.2f", monthlyPayment));
		
		input.close();
	}
}
