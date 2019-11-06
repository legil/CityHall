/**
 * 
 */
package studentManagement.department;

import java.util.List;

import studentManagement.student.Student;

public class Department {
	
	private int deptId;
	private String deptName;
	private List<Student> studentList;
	
	
	public Department(int deptId, String deptName, List<Student> studentList) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.studentList = studentList;
	}



	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getdeptName() {
		return deptName;
	}


	public void setdeptName(String deptName) {
		this.deptName = deptName;
	}


	public List<Student> getStudentList() {
		return studentList;
	}


	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	
}
