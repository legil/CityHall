/**
 * 
 */
package studentManagement.student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahmshahparan
 *
 */
public class StudentDaoImpl implements StudentDAO {

	// list is working as a database
	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Max", 100);
		Student student2 = new Student("Lucy", 101);
		Student student3 = new Student("Laila", 102);
		students.add(student1);
		students.add(student2);
		students.add(student3);
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		Student lookup = null;
		for (Student s : students) {
			if (s.getRollNo() == rollNo) {
				lookup = s;
			}
		}
		return lookup;
	}

	@Override
	public void updateStudent(int roll, String name) {
		Student student = getStudent(roll);
		student.setName(name);
		System.out
				.println("Student: Roll No " + (student.getRollNo()) + ", updated in the database with name: " + name);
	}

	@Override
	public void deleteStudent(int rollNo) {
		Student student = getStudent(rollNo);
		students.remove(student);
	}

	
	@Override
	public void addStudent(String name, int roll) {

		Student s = null;

		for (Student student : students) {
			if (student.getRollNo() == roll) {
				System.out.println("Roll no. already exists!");
				return;
			} else {
				s = new Student(name, roll);
			}
		}

//		for(int i = 0; i< students.size(); i++) {
//			if (students.get(i).getRollNo() == roll) {
//				System.out.println("Roll no. already exists!");
//				return;
//			}else {
//				s = new Student(name, roll);
//				students.add(s);
//				break;
//			}
//		}
		students.add(s);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see studentManagement.StudentDAO#printList()
	 */
	@Override
	public void printList() {
		System.out.println("================Updated Student Database================");
		for (Student elm : getAllStudents()) {
			System.out.println("Student: [RollNo : " + (elm.getRollNo()) + ", Name : " + elm.getName() + " ]");
		}

	}
}
