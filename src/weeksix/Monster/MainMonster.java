package weeksix.Monster;

public class MainMonster {
	public static void main(String [] args) {
		//Monster monster = new Monster();
		Monster fmonster = new FireMonster();
		Monster wmonster = new WaterMonster();
		Monster smonster = new StoneMonster();
		
		
		System.out.println(fmonster.attack());
		System.out.println(wmonster.attack());
		System.out.println(smonster.attack());
		System.out.println(smonster.attack());
		//System.out.println(monster.attack());
		
	}

}
