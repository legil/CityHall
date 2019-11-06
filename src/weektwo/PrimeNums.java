package weektwo;

public class PrimeNums {
	public static void main(String[] args) {
		
		 int count = 0; //to track 20 prime numbers
		 for(int i = 2; count < 20; i++) { //i is the number we are testing ie 2, 3, 4...
			 boolean isPrime = true; //assume every num is a prime
			 
			 for(int j = i; j >= 2; j--) { //any number is divisible by 1 so we use 2
				 if( i != j && i % j == 0) { //j is actually the set of denominators
					 isPrime = false;
					 break;
				 }
			 }
			 if(isPrime) {
				 count++;  //add one to the count because we found a prime number
				 System.out.println(i + " is a prime. \t" + count);
			 }
		 }
	}
}