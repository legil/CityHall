package weeksix.abstraction;

public class MainRunner {
	public static void main(String[] args) {
		//Animal anm = new Animal();
		Animal anm = new Human(true, false, 2, true);
		
		anm.canMove();
		//anm.areCarnivorous();
	
	}
}
