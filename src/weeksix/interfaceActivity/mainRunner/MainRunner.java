package weeksix.interfaceActivity.mainRunner;

import java.util.List;
import java.util.ArrayList;

import weeksix.interfaceActivity.boat.BoatI;
import weeksix.interfaceActivity.car.CarI;
import weeksix.interfaceActivity.vehicle.Vehicle;

public class MainRunner extends Vehicle {
	public static void main(String[] args) {
		Bocar bcar = new Bocar();
		bcar.canFloat();
		bcar.canRow();
		
		bcar.canDrive();
		bcar.canHonk();
		bcar.isFun("Car is more fun!");
		bcar.isFun();
		bcar.movePassengers();
		
	    System.out.println(bcar.hp); //non-static way thru object-should be accessed statically
		System.out.println(CarI.hp); //static way
		
		/*
		 * MainRunner mr = new MainRunner(); mr.automotive = true; mr.noOfDoors = 7;
		 */
		
		bcar.setAutoMotive(true);
		bcar.setNoOfDoors(8);
		
		System.out.println(bcar.isNoOfDoors());
		System.out.println(bcar.isAutoMotive());
		
		
		//BoatI bi = new Bocar();//instantiating concrete class and assinging to interface
		//List li = new ArrayList();
		//makes code reusable
	}

}
