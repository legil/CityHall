/**
 * 
 */
package studentManagement;

import java.util.Scanner;

import studentManagement.student.Student;
import studentManagement.student.StudentDAO;
import studentManagement.student.StudentDaoImpl;

/**
 * @author ahmshahparan
 *
 */
public class DaoPatternDemo {

	public static void main(String[] args) {

		StudentDAO studentDao = new StudentDaoImpl();

		// get all students
		studentDao.printList();

		System.out.println("================Business Need================");
		Scanner input = new Scanner(System.in);

		// add the student
		boolean keepAdding = true;

		while (keepAdding) {
			System.out.println("Do you want to add a new student? Enter 1 to add, 2 to skip.");
			int in = input.nextInt();

			if (in == 2) {
				keepAdding = false;
			} else {
				System.out.println("Please enter the roll no: ");
				int roll = input.nextInt();
				System.out.println("Please enter the name: ");
				String name = input.next();
				studentDao.addStudent(name, roll);
				studentDao.printList();
				System.out.println();
			}
		}

		// get the student
		System.out.println("Please provide the student roll you want to retrieve?");
		int studentRoll = input.nextInt();
		Student retrieveStudent = studentDao.getStudent(studentRoll);
		System.out.println(
				"Student: [RollNo : " + (retrieveStudent.getRollNo()) + ", Name : " + retrieveStudent.getName() + " ]");

		// update a student
		System.out.println("Please provide the student roll you want to update?");
		int roll = input.nextInt();
		System.out.println("Please provide the new student name?");
		String name = input.next();
		studentDao.updateStudent(roll, name);

		// delete a student
		System.out.println("Please provide the student roll you want to delete?");
		int deleteRoll = input.nextInt();
		studentDao.deleteStudent(deleteRoll);
		System.out.println("Student has been deleted from from database with roll: " + (deleteRoll));

		// after operation
		studentDao.printList();
	}
}
