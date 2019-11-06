package weekthree;

import java.util.Arrays;

public class Array3D {
	public static void main(String[] args) {
		//depth 3, 5 rows, 3 columns 
		//declare, inintialize,
		//print/access
		
		int[][][] arr = new int [5][3][3];
		int n=0;
		
		for(int i = 0; i < arr.length; i++) {//which 2d array
			for(int j = 0; j < arr[i].length; j++) { //which row of the 2d array?
				for(int k = 0; k < arr[i][j].length; k++) {//which column 
				arr[i][j][k] = n++;
			}
		}
	}
		
		System.out.print(Arrays.deepToString(arr));
	}

}
