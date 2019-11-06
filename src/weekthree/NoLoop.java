package weekthree;

public class NoLoop {
	public static void main(String[] args) {
		repeat(5);
		
		
	}
	
	public static void repeat(int n) {
		if(n > 0) {
			System.out.println("Welcome to Java");
			repeat(n-1);
		}
		
	}
}