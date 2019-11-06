package weekthree;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String [] args) {
		int[] list = {77, 1, 5, 9};
		System.out.println(Arrays.toString(list));
		
		int[] list2 = reverse(list);
		
	}
	
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		for(int i = list.length-1, j = 0; i >= 0; i--, j++) {
			result[j] = list[i];
				
		}
	System.out.println(Arrays.toString(result));
		
		return result;
		
	}

}
