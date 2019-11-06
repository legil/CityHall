package weektwo;

public class Tuition{
	public static void main(String[] args) {
		int tuition = 10000;
		int years = 0;
		for(int i = 0; i <= (tuition * 2); i++) {
			tuition += (int)(tuition * 1.07);
			years++;
		}
		System.out.println(years);		
	}
}
