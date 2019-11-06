package weekone;

import java.util.Arrays;

public class SecondMin {
	public static void main(String args[]) {
		
		// find the second smallest number in an arrayß
		int[] nums = new int[] {10, 20, 1, 5, 30};
		System.out.println(Arrays.toString(nums));
		
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < min1) {
				min1 = nums[i];
			}
		}
		
		for(int j = 0; j < nums.length; j++) {
			if(nums[j] > min1 && nums[j] < min2)  {
				min2 = nums[j];
			}
		}
		
		System.out.println(min1);
		System.out.println(min2);
		
		/*
		//by sorting
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		//second smallest becomes nums[1]
		*/	
		
	}
}
