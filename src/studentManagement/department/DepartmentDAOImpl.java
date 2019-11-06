/**
 * 
 */
package studentManagement.department;

import java.util.ArrayList;
import java.util.List;

import studentManagement.student.Student;
import studentManagement.student.StudentDAO;
import studentManagement.student.StudentDaoImpl;

/**
 * @author ahmshahparan
 *
 */
public class DepartmentDAOImpl implements DepartmentDAO {

	List<Department> departments;
	StudentDAO studentDao;

	public DepartmentDAOImpl(StudentDAO studentDao) {
		this.studentDao = studentDao;
		departments = new ArrayList<Department>();
		Department dept1 = new Department(1, "CSE", new ArrayList<>());
		Department dept2 = new Department(2, "EE", new ArrayList<>());
		Department dept3 = new Department(3, "Arts", new ArrayList<>());
		departments.add(dept1);
		departments.add(dept2);
		departments.add(dept3);
	}

	@Override
	public List<Department> getAllDepartments() {
		return departments;
	}

	@Override
	public Department getADepartment(int deptId) {
		Department lookup = null;
		for (Department d : departments) {
			if (d.getDeptId() == deptId) {
				lookup = d;
			}
		}
		return lookup;
	}

	@Override
	public void updateDepartment(int deptId, String deptName) {
		Department dept = getADepartment(deptId);
		dept.setdeptName(deptName);
		System.out.println("Department: Id No " + (dept.getDeptId()) + 
				", updated in the database with name: " + deptName);
	}

	@Override
	public void deleteDepartment(int deptId) {
		Department dept = getADepartment(deptId);
		departments.remove(dept);

	}

	@Override
	public void addDepartment(String deptName, int deptId) {
		Department d = null;

		for (Department dept : departments) {
			if (dept.getDeptId() == deptId) {
				System.out.println("Dept ID already exists!");
				return;
			} else {
				d = new Department(deptId, deptName, null);
			}
		}
		departments.add(d);
	}

	@Override
	public void addToDepartment(int rollNo, int deptId) {
		Student s = studentDao.getStudent(rollNo);
		Department d = getADepartment(deptId);
		//Dept -> StudentList -> add -> s
		d.getStudentList().add(s);

	}

	@Override
	public void removeFromDepartment(int rollNo, int deptId) {
		Student s = studentDao.getStudent(rollNo);
		Department d = getADepartment(deptId);
		//Dept -> StudentList -> remove -> s
		d.getStudentList().remove(s);

	}

	@Override
	public void studentsOfADept(int deptId) {
		System.out.println("========Student list of dept "+deptId+"================");
		System.out.println("Size of the dept: " + getADepartment(deptId).getStudentList().size());
		for(Student s: getADepartment(deptId).getStudentList()) {
			System.out.printf("[Roll: %d, Name: %S]%n", s.getRollNo(), s.getName());
		}
	}
	
	public void showAllDept() {
		System.out.println("================Updated Department Database================");
		for (Department elm : getAllDepartments()) {
			System.out.println("Department: [ID : " + (elm.getDeptId()) 
					+ ", Name : " + elm.getdeptName() + " ]");
		}

	}

}










