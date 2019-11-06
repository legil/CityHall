package weekthree;

public class Factorial {
	public static void main(String[] args) {
		int n = 6;
		int result;
		
		for(result = 1; n >= 1; n--) {
			result *= n;
			
		}
		System.out.println(result);
		
		
		
		/*
		 * USING RECURSION
		 * 
		 * class FactorialExample2{  
			 static int factorial(int n){    
			  if (n == 0)    
			    return 1;    
			  else    
			    return(n * factorial(n-1));    
			 }    
			 public static void main(String args[]){  
			  int i,fact=1;  
			  int number=4;//It is the number to calculate factorial    
			  fact = factorial(number);   
			  System.out.println("Factorial of "+number+" is: "+fact);    
			 }  
			}  
		 */

	}
}
