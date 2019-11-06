package weekthree;

public class TwoDimensionalArrays {
	public static void main(String[] args) {
		int[][] numArray = new int [5][2];
		int incrementBy = 1;
		for(int i = 0; i < numArray.length; i++) {
			for(int j = 0; j < numArray[i].length; j++) {
				numArray[i][j]= incrementBy++;
				
				System.out.print(numArray[i][j] + " ");
			}
			System.out.println(" ");
		}	
	}
}

class Random2D{
	public static void main(String[] args) {
		int [][] randArr = new int[3][4];
		for(int i = 0; i < randArr.length; i++) {
			for(int j = 0; j < randArr[i].length; j++) {
				randArr[i][j] = 1 + (int)(Math.random() * 12);
				
				System.out.print(randArr[i][j] + " ");
			}
			System.out.println(" ");
		}	
	}
}
