package weekthree;

import java.util.Arrays;

public class InPlaceReverse {
	public static void main(String [] args) {
		int[] list = { 27, 5, 9, 10};
		int size = list.length;
		
			for( int i = 0, j = size - 1; i < size / 2; i++, j-- ){
				//swap list[i], list[j]
			    int temp = list[i];
			    list[i] = list[j];
			    list[j] = temp;
			}
	
		System.out.println(Arrays.toString(list));
	}
}

