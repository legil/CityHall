package weeksix.interfaceActivity.vehicle;

public class Vehicle {
	private boolean autoMotive = true;
	private int noOfDoors;
	
	protected void movePassengers() {
		System.out.println("All the vehicles can move passengers");
	}

	public boolean isAutoMotive() {
		return autoMotive;
	}

	public void setAutoMotive(boolean autoMotive) {
		this.autoMotive = autoMotive;
	}

	public int isNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int i) {
		this.noOfDoors = i;
	}
	
	

}
