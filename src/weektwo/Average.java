package weektwo;

import java.util.Arrays;

public class Average {
	public static void main(String[] args) {
		
		double sum = 0;
		int[] nums = new int[100];
		for(int i = 0; i <= nums.length-1; i++) {
			nums[i] = (i+1);
			sum += nums[i];
		}
	
		
		System.out.println(Arrays.toString(nums));
		
		double average = sum / (nums.length);
		System.out.println("sum is: " + sum);
		System.out.println("average is: " + average);
			
	}
}
