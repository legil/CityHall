package weekfive;

public class Student {
	private int studentID;
	private String firstName;
	private String lastName;
	private String studentPhone;
	
	public Student(int id, String fname, String lname, String phoneNum) {
		studentID = id;
		firstName = fname;
		lastName = lname;
		studentPhone = phoneNum;
	}
	
	public void setPhone(String phone) {
		studentPhone = phone;
	}
	
	public String getPhone() {
		return studentPhone;
	}	
	
	public String toString() { //overwrites object toString()
		return "I'm " +firstName+ ", my student id is " +studentID+ ".";
	}
}
