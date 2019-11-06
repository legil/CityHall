package weekfive;

public class Person {
	private static String a = "unmodified";
	private  String b = "unmodified";
	public static void setA(String newA) {
		a = newA;
	}
	public static String getA() {
		return a;
	}
	
	public void setB(String newB) {
		this.b = newB;
	}
	
	public String getB() {
		return this.b;
	}

}
