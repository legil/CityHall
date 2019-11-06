package StudentInterface;

import java.util.Scanner;

public class DAOPatternDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		StudentDAO students = new StudentDAOImpl();
		students.addStudent(new Student("Mayra", 1));
		//students.updateStudent();
		
		System.out.println(students);
		System.out.println("Do you want to add");
		Student student1 = new Student("john", 123);
		students.addStudent(student1);
		System.out.println(students);
		
		//System.out.println(student.getRollNo());
		
	}

}
