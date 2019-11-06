package weeksix.ErrorHandling;

public class ErrorCalculator {
	
	void printResult(String method, double result) {
		System.out.println("a" + method + "b" + "=" + result);
	}
	
	int add(int a, int b) {
		int res = a + b;
		printResult("+", res);
		return a + b;
	}
	
	double add(double a, double b) {
		double res = a + b;
		printResult("+", res);
		return a + b;
	}
	
	double division(double a, double b) {//throws IllegalArgumentException, Exception{
		if(b == 0) {
			//throw new ArithmeticException();
			//System.out.println("Hello!");
			throw new IllegalArgumentException("Value of second number cannot be 0!"); //IllegalArgumentException
		}
		
		double res = a / b;
		
		printResult("/", res);
		return a / b;
	}

}
