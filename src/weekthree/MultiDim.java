package weekthree;

import java.util.Arrays;

public class MultiDim {
	public static void main(String[] args) {
		//int [][] numberArr = new int[6][5];
		int [][] numberArr = new int [][] {{ 10, 12, 43, 11, 22}, 
									{20, 45, 56, 1, 33}, 
									{30, 67, 32, 14, 44}, 
									{40, 12, 87, 14, 55}, 
									{50, 86, 66, 13, 66}, 
									{60, 53, 44, 12, 11}};
									
		int rows = 6; 
		int columns = 5; 
		int i, j;
		
		for(i = 0; i < numberArr.length; i++) {
			for(j=0; j < numberArr[i].length; j++) {
				System.out.print(numberArr[i][j] + " ");
				
			}
			System.out.println( "" );
		}
		
		System.out.println(Arrays.deepToString(numberArr));	
	}

}
