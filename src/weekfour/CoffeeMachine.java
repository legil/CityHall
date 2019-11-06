package weekfour;

import java.util.Scanner;

public class CoffeeMachine {
	
	static int water = 200;
	static int milk = 50;
	static int coffeeBeans = 15;

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("Write how many cups of coffee you will need: ");
    	int cupsOfCoffee = input.nextInt();
    	
    	System.out.println("For " + cupsOfCoffee + " cups of coffee you will need: ");
    	
    	System.out.println((water * cupsOfCoffee) + " ml");
    	System.out.println((milk * cupsOfCoffee) + " ml");
    	System.out.println((coffeeBeans * cupsOfCoffee) + " g");
    	

        System.out.println("Starting to make coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Coffee is ready!");

        input.close();
    }
}
