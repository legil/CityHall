package InheritanceExercise;

public class Manager extends Employee {
	
	public Manager(int id, String name, String address, long phone, double salary) {
		super(id, name , address, phone, salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 15*getBasicSalary()/100;
		System.out.println("transport allowance: " + String.format("%.2f", transportAllowance));
	}
	
}
