package weeksix.interfaceActivity.mainRunner;

import weeksix.interfaceActivity.boat.BoatI;
import weeksix.interfaceActivity.car.CarI;
import weeksix.interfaceActivity.vehicle.Vehicle;

public class Bocar extends Vehicle implements BoatI, CarI {

	@Override
	public void canRow() {
		System.out.println("We can row a boat!");
	}

	@Override
	public void canFloat() {
		System.out.println("Boat can float!");
	}

	@Override
	public void canDrive() {
		System.out.println("A car can be driven!");
	}

	@Override //makes it part of an interface implementation
	public void canHonk() {
		System.out.println("A car can honk!");	
	}
	
	@Override
	public void isFun() {
		System.out.println("This must be having fun in the boat, risky btw!");
	}
	
	public void isFun(String msg) {
		System.out.println(msg);
		
	}
	
	protected void movePassengers() {
		System.out.println("Bocar can move 8 passengers");
	}
	
	void assignVar() {
		Bocar bcar = new Bocar();
		bcar.setAutoMotive(true);
		bcar.setNoOfDoors(6);
	}
}
