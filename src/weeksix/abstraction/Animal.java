package weeksix.abstraction;

public abstract class Animal {
	boolean canBreathe; //vars cannot be abstract
	int noOfLegs;
	boolean predator;
	
	public Animal(boolean canBreathe, int noOfLegs, boolean predator) {
		this.canBreathe = canBreathe;
		this.noOfLegs = noOfLegs;
		this.predator = predator;
	}

	void canMove() {
		System.out.println("All animals can move");
	}
	
	void limitedLongevity() {
		System.out.println("All animals die");
	}
	
	abstract void limited();
	
	abstract void limited(int a);
	
	
	
	
	/**
	 * @param canBreathe
	 * @param noOfLegs
	 * @param predator
	 */
	

}
