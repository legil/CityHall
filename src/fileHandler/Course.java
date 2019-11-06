package fileHandler;

public class Course {
	private String courseID;
	private String courseName;
	private String instructor;
	/**
	 * @param courseID
	 * @param courseName
	 * @param instructor
	 */
	public Course(String courseID, String courseName, String instructor) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.instructor = instructor;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	
	

}
