package weektwo;

public class Ones {
	public static void main(String[] args) { 
		int x = 1;
		
	System.out.println("(x>1) & (x++<10)? " + ((x>1)&((x++))<10));
	System.out.println("(1>x) && (1>x++)? " + ((1>x) && (1>x++)));
	System.out.println("(1==x) || (10>x++)? " + ((1==x) || (10>x++)));
		
	}
		
}

