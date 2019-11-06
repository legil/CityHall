package weekfive;

public class Student2 {
	private int sID;
	private String sName;
	int noOfSemester;
	private static int GPA;
	private static String collegeName = "XYZ";

	public Student2(int sID, String sName, int gpa) {
		this.sID = sID;
		this.sName = sName;
		this.noOfSemester = noOfSemester;
		this.GPA = gpa;
	}

	public void useLibrary() {
		System.out.println("As a student I can use library!");
	}
	
	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getNoOfSemester() {
		return noOfSemester;
	}

	public void setNoOfSemester(int noOfSemester) {
		this.noOfSemester = noOfSemester;
	}
	
	public static int getGPA() {
		return GPA;
	}

	public static void setGPA(int gpa) {
		GPA = gpa;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student2.collegeName = collegeName;
	}
	
}
