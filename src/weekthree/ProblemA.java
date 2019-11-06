package weekthree;

class ProblemA {
	public static void main(String[] args) {
		int x = compute(1, 2);
		
		System.out.println(x);
		
		///////////////////////////////////////////////
		printLine();
	}
	
	public static int compute(int x, int y) {
		int result = x + y;
		
		return result;
	}
	
	
	public static void printLine() {
		System.out.println("HI!");
	}

}
