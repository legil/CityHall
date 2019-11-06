package InheritanceExercise;

public class InheritanceActivity {
	public static void main(String[] args) {
		Manager manager1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000.00);
		Trainee trainee1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000.00);
		
		manager1.calculateSalary();
		trainee1.calculateSalary();
		
		manager1.calculateTransportAllowance();
		trainee1.calculateTransportAllowance();	
	}
}
