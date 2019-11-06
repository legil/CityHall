package weekone;

import java.util.Scanner;

public class Assignment1 {
	//Solution to the first problem
	/*Create a String named [name]
			Create an integer named [age]
			Create a double named [wage]

			Your code should ask the following question
			Hello. What's your name?

			Set [name] to the user's input

			Your code should ask the following question
			Hi [name]! How old are you?

			Set [age] to the user's input

			Your code should ask the following question
			So you're [age], eh? That's not old at all!
			How much do you make, [name]?

			Set [wage] to the user's input

			Finally, output this line
			[wage]! That's really good for your [age]!
			*/
			public static void main(String[] args) {
				
				String name = "";
				int age;
				double wage;
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("Hello, What is your name?");
				name = input.next();
				
				System.out.println("Hello, " + name + "! How old are you?");
				age = input.nextInt();
				
				System.out.println("So you're " + age + ", eh? That's not old at all! \n" +
						"How much do you make, " + name + "?");
				wage = input.nextDouble();
				
				System.out.println("$" + wage + "! That's really good for " + age + "!");
				
				input.close();
			}

}

class Problem2{
	public static void main(String[] args) {
		/*
		 * 2. Data Mining

			First, print the following line:
			Please enter the following information so I can sell it for a profit!
			
			Then, prompt the user for the following pieces of information:
			First Name as a String named [fname]
			Last Name as a String named [lname]
			Grade (9-12) as an int named [grade]
			Student ID as an int named [id]
			Login as a String named [login]
			GPA (0.0-4.0) as a double named [gpa]
			
			Finally, print the following lines:
			Your Information:
			Login: [login]
			ID: [id]
			Name: [lname], [fname]
			GPA: [gpa]
			Grade: [grade]
		 * 
		 * 
		 */
		
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter first name...");
		String fname = input.next();
		
		System.out.println("Please enter last name...");
		String lname = input.next();
		
		System.out.println("Please enter grade...");
		int grade = input.nextInt();
		
		System.out.println("Please enter Student ID...");
		int id= input.nextInt();
		
		System.out.println("Please enter Login...");
		String login = input.next();
		
		System.out.println("Please enter GPA...");
		double gpa = input.nextDouble();
		
		System.out.println("Your information:");
		System.out.println("Login: " + login + "\n" +
							"ID: " +  id + "\n" +
							"Name: " + lname + ", " + fname + "\n" + 
							"GPA: " + gpa + "\n" + 
							"Grade: " + grade);
		
		input.close();
	}
}

class Problem3{
	public static void main(String[] args) {
		/*
		 * Ask the user for their name. 
			Then display their name to prove that you can recall it. 
			Ask them for their age. 
			Then display what their age would be five years from now. 
			Then display what their age would be five years ago.
			
			An example of your output could be:
			Hi there. What's your name? 
			>Shahparan
			
			Hi, Shahparan! My name is Java. Nice to meet you.
			How old are you? 
			>31
			
			Did you know that in five years you will be 36 years old?
			And five years ago you were 26! Imagine that!
		 * */
		
		System.out.println("Hi there. What is your name?");
		
		Scanner input = new Scanner(System.in);
		
		String name = input.next();
		System.out.println("Hi " + name + ", My name is Java. Nice to meet you." + "\n" + "How old are you?");
		
		int age = input.nextInt();
		System.out.println("Did you know that in five years you will be " + (age+5) + " years old?");
		System.out.println("And five years ago you were " + (age-5) + "! Imagine that!");
		
		input.close();
		 
	}
}

class Problem4{
	public static void main(String[] args) {
		/*
		 * Make a simple numeric calculator. 
			It should prompt the user for three numbers. 
			Then add the numbers together and divide by 2. 
			Display the result. 
			Your program must support numbers with decimals and not just integers.
			
			An example of your output could be:
			What is your first number? 
			>1.1
			
			What is your second number? 
			>2.2
			
			What is your third number? 
			>5.5
			
			(1.1 + 2.2 + 5.5) / 2 is... 
			4.4!
		 */
		
		double num1;
		double num2;
		double num3;
		double result;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first number?");
		num1 = input.nextDouble();
		
		System.out.println("What is your second number?");
		num2 = input.nextDouble();
		
		System.out.println("What is your third number?");
		num3 = input.nextDouble();
		
		result = (num1 + num2 + num3) / 2;
		
		System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ") / 2 is..." + "\n" + result + "!");
		
		input.close();
		
	}
}

class Problem5{
	public static void main(String[] args) {
		/*
			The body mass index (BMI) is commonly used by health and nutrition professionals 
			to estimate human body fat in populations.
	
			It is computed by taking the individual's weight (mass) in kilograms 
			and dividing it by the square of their height in meters.
	
			An example of your output could be:
			Your height in m: 
			>1.75
	
			Your weight in kg: 
			>73
	
			Your BMI is 23.83673
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight in kilograms?");
		double weightInKg = input.nextDouble();
		
		System.out.println("What is your height in meters?");
		double heightInMeters = input.nextDouble();
		
		double bmi = weightInKg / Math.pow(heightInMeters, 2);
		
		System.out.println("Your BMI is " + bmi);
		
		input.close();
	}
}
