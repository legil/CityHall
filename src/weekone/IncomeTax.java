package weekone;

import java.util.Scanner;


public class IncomeTax {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double taxRate = 0;
		
		System.out.println("Please enter status:" + "\n"+
							"1 if Single" + "\n" + 
							"2 if Married; Filing Jointly" + "\n"+
							"3 if Married; Filing Separately" + "\n" +
							"4 if Head Of Household"
							);
		
		int status = input.nextInt();
		
		System.out.println("Please enter income...");
		int income = input.nextInt();
		
		
		
		if(status == 1) {
			if(0 > income && income < 8350) {
				taxRate = income * .10;
			} else if(8351 > income && income < 33950) {
				taxRate = income * .15;
			} else if(33951 > income && income < 82250) {
				taxRate = income * .25;
			} else if (82251 > income && income < 171550) {
				taxRate = income * .28;
			} else if (171551 > income && income < 372950) {
				taxRate = income * 33;
			} else if (income > 371951) {
				taxRate = income * .38;
			}
		}
		else if(status == 2) {
			if(0 > income && income < 16700) {
				taxRate = income * .10;
			} else if(16701 > income && income < 67900) {
				taxRate = income * .15;
			} else if(67901 > income && income < 137050) {
				taxRate = income * .25;
			} else if (137051 > income && income < 208850) {
				taxRate = income * .28;
			} else if (208851 > income && income < 372950) {
				taxRate = income * .33;
			} else if (income > 371951) {
				taxRate = income * .38;
			}
		}
		else if(status == 3) {
			if(0 > income && income < 8350) {
				taxRate = income * .10;
			} else if(8351 > income && income < 33950) {
				taxRate = income * .15;
			} else if(33951 > income && income < 68525) {
				taxRate = income * .25;
			} else if (68526 > income && income < 104425) {
				taxRate = income * .28;
			} else if (104426 > income && income < 186475) {
				taxRate = income * .33;
			} else if (income > 186476) {
				taxRate = income * .35;
			}
		}
		else if(status == 4) {
			if(0 > income && income < 11950) {
				taxRate = income * .10;
			} else if(11951 > income && income < 45500) {
				taxRate = income * .15;
			} else if(45501 > income && income < 117450) {
				taxRate = income * .25;
			} else if (117451 > income && income < 190200) {
				taxRate = income * .28;
			} else if (190201 > income && income < 372950) {
				taxRate = income * .33;
			} else if (income > 371951) {
				taxRate = income * .35;
			}
		}
		else {
			System.out.println("ERROR: Wrong status code");
		}

			
		System.out.println("Your status code is: "+ status + "\n" +
								"Your income is:" + income + "\n" +
								"You owe " + String.format("$%.2f", taxRate) + " in taxes this year");
		
		input.close();	
	}

}
	


