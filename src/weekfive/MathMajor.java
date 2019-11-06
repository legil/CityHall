package weekfive;

public class MathMajor extends Student2 {
	
	private boolean analyticalSkill;

	public MathMajor(int sID, String sName, int noOfSemester, int gpa, boolean analyticalSkill) {
		super(sID, sName, gpa);
		this.analyticalSkill = analyticalSkill;
		super.setNoOfSemester(4);
		
	}
	
	public void ancestor() {
		System.out.println("I am calling my ancestor!");
		super.useLibrary();
	}
	
	public void practiceLab() {
		System.out.println("As a math student I have practice lab!");
	}
	
	public void useLibrary() {
		System.out.println("As a Math student I use special math library!");
	}
	
	public void useLibrary(String msg) {
		super.useLibrary();
		System.out.println("Goodbye from student library. Welcome to the library of " + msg);
	}

	public boolean isAnalyticalSkill() {
		return analyticalSkill;
	}

	public void setAnalyticalSkill(boolean analyticalSkill) {
		this.analyticalSkill = analyticalSkill;
	}

}
