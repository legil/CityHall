package weekone;

import java.lang.Math;

public class AToZ {
	public static void main(String[] args) {
		double randValue = 65 + (int)(Math.random() * 26);
		//int randValue = (int) 'A' + (int)(Math.random() * 26);
		System.out.println((char)randValue);
	}

}
