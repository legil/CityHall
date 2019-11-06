package StudentInterface;

import java.util.List;

public interface StudentDAO {
	public List getAllStudents();
	
	public void updateStudent(Student student);
	
	public void deleteStudent();
	
	public void addStudent(Student student);

}
