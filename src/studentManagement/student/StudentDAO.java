/**
 * 
 */
package studentManagement.student;

import java.util.List;

/**
 * @author ahmshahparan
 *
 */
public interface StudentDAO {
	
	public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(int rollNo, String name);
    public void deleteStudent(int rollNo);
    public void addStudent(String name, int rollNo);
    public void printList();
}
