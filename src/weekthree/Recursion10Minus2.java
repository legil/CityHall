package weekthree;

public class Recursion10Minus2 {
	public static void main(String[] args) {
		recurse(10);
		
	}
	
	static int recurse(int n) {
		if(n >= 0) {
			System.out.println(n);
			n = recurse(n-2);
		}
		return n;
	}

}



