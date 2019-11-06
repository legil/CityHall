package weekthree;


public class FibonacciRecursion {
	public static void main(String[] args) {
		int nth = 10;
		for(int i = 0; i< nth; i++) {
			System.out.println(fibonacciPrint(i) + " ");
		}

	}

	public static int fibonacciPrint(int n) {
		if (n <= 1) { //n==0, n==1
			return n;
		} else {
			return fibonacciPrint(n - 1) + fibonacciPrint(n - 2);
		}

	}
}
