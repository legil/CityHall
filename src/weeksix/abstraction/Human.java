package weeksix.abstraction;

public class Human extends Animal{
	boolean canThink;

	/**
	 * @param canThink
	 */
	public Human(boolean canThink, boolean canBreathe, int noOfLegs, boolean predator) {
		super(canBreathe, noOfLegs, predator);
		this.canThink = canThink;
	}
	
	void areCarnivorous(){
		System.out.println("Humans can move by walking and running!");
	}
	
	void canMove(){
		System.out.println("Humans can eat anything!");
	}

	@Override
	void limited() {
		// TODO Auto-generated method stub
	}

	@Override
	void limited(int a) {
		// TODO Auto-generated method stub
	}

	
	
	

}
