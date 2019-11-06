package StudentInterface;

import java.util.List;

public class StudentDAOImpl implements StudentDAO{
	
	private List<Student> list;

	
	public List getAllStudents() {
		// TODO Auto-generated method stub
		return list;
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		list.set(list.indexOf(student), student);
	}

	
	public void deleteStudent() {
		// TODO Auto-generated method stub
		//list.remove(list.indexOf(o));
	}

	
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		list.add(student);
	}

}
