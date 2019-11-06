package studentManagement.department;

import java.util.List;
public interface DepartmentDAO {
	
	
	public List<Department> getAllDepartments();
    public Department getADepartment(int deptId);
    public void updateDepartment(int deptId, String deptName);
    public void deleteDepartment(int deptId);
    public void addDepartment(String deptName, int deptId);
    public void addToDepartment(int rollNo, int deptId);
    public void removeFromDepartment(int rollNo, int deptId);
    public void studentsOfADept(int deptId);
    public void showAllDept();
}

