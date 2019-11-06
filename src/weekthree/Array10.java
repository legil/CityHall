package weekthree;

import java.util.Arrays;

public class Array10 {
	
	public static void generateElement(int[] array, int position) {
		array[position] = (int)(1 + Math.random() * 15);
		
		for(int i = 0; i < position; i++) {
			if(array[i] == array[position]) {
				array[position] = (int)(1 + Math.random() * 15);
				i = -1;
				
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		
		for(int i = 0; i < 10; i++) { 
			for(int position = 0; position < 10; position++) {
				generateElement(array, position);
			}
			
			System.out.println(Arrays.toString(array));
		}	
	}
}
