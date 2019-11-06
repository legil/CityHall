package weektwo;

import java.util.Arrays;

public class RandomShuffle {
	public static void main(String[] args) {
		
		int[] myList =  {40, 30, 20, 50, 90, 45, 35, 10};
		for(int i = myList.length -1; i > 0; i--) {  //makes less chance of picking the same index
			//Generate an index j randomly with 0 <= j <= i
			int random = (int)(Math.random() * (i + 1));
		
		
			//swap myList[i] with myList[j]
		
			int temp = myList[i]; //swap
			myList[i] = myList[random];
			myList[random] = temp;
		
		}
		
		System.out.println(Arrays.toString(myList));
	}
}
			
				
			/*
	//to swap:
	 * int arr[] = {99, 79}
	 * 
	 * arr[0] = arr[1];//79
	 * arr[1] = arr[0] //79
	 * 
	 * 
	 * fix:
	 * int temp = arr[0];
	 * arr[0] = arr[1]
	 * arr[1] = temp;
	 */
			

class Shifting{
	public static void main(String[] args) {
		String[] myList = {"C#","Java","Python","Ruby","C++"};
		System.out.println(Arrays.toString(myList));
		
		
		int shiftNum = 2;
		String temp1 = myList[0];
		String temp2 = myList[1];
		
		while(shiftNum > 0) {
			//shift elements left 
			for(int i = 1; i < myList.length; i++) {
				myList[i] = myList[i];
			}
		
			//move the first element to fill in the last position 
			myList[myList.length - 2] = temp1;
			myList[myList.length - 1] = temp2;
			shiftNum--;
		}

		System.out.println(Arrays.toString(myList));
	}
}

