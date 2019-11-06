package weekfive;

public class PhysicsMajor extends Student2 {
	boolean gravityLab;
	
	public PhysicsMajor(int sID, String sName, int noOfSemester,  boolean gravityLab) {
		super(sID, sName, noOfSemester);
		this.gravityLab = gravityLab;
		
		// TODO Auto-generated constructor stub
	}

	public boolean isGravityLab() {
		return gravityLab;
	}

	public void setGravityLab(boolean gravityLab) {
		this.gravityLab = gravityLab;
	}

	public void useLibrary() {
		System.out.println("As a physics student, I use a special physics library");
	}
	
	public void useLibrary(String msg) {
		System.out.println("From physics class: Welcome to the library of " + msg);
	}
	
	public void invokeGeek() {
		geekProducer();
	}
	
	public static void geekProducer() {
		System.out.println("Physics made me a geek!");	
	}	
}
