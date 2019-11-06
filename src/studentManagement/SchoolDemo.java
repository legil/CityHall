package studentManagement;

import studentManagement.department.DepartmentDAO;
import studentManagement.department.DepartmentDAOImpl;
import studentManagement.student.StudentDAO;
import studentManagement.student.StudentDaoImpl;

public class SchoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentDAO sDAO = new StudentDaoImpl();
		DepartmentDAO dDAO = new DepartmentDAOImpl(sDAO);
		
		//Initial list
		sDAO.printList();
		System.out.println();
		//Show department list
		dDAO.showAllDept();
		System.out.println();
		//Add 2 students in department 1
		dDAO.addToDepartment(101, 1);
		dDAO.addToDepartment(102, 1);
		System.out.println();
		//Show students in department 1
		dDAO.studentsOfADept(1);
		System.out.println();
		//Add 1 student in department 2
		dDAO.addToDepartment(101, 2);
		dDAO.addToDepartment(102, 2);
		System.out.println();
		//Show students in department 2
		dDAO.studentsOfADept(2);
		System.out.println();
		//Remove a student from department 1
		dDAO.removeFromDepartment(101, 1);
		System.out.println();
		//Show students in department 1
		dDAO.studentsOfADept(1);

	}

}





