package InheritanceExercise;

public class Employee {
	private long employeeID;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary;
	private double specialAllowance = 250.80;
	private double hra = 1000.50;
	
	public Employee(int id, String name, String address, long phone, double salary) {
		employeeID = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
		basicSalary = salary;
	}
	
	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
	
	public void calculateSalary() {
		double salary = basicSalary + (getBasicSalary() * specialAllowance/100.0) + (basicSalary * hra/100);
		System.out.println("salary: " + String.format("%.2f", salary));
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 10* getBasicSalary() / 100;
		System.out.println("transport allowance: " + String.format("%.2f", transportAllowance));
	}
}
