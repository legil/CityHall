package weektwo;


import java.util.Scanner;

public class InputArray {
	public static void main(String [] args) {
		int arr[] = new int[5];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter number " + (i + 1) + " : ");
			arr[i] = input.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Number " + (i + 1) + ":" + arr[i]);
			
		}
		
		input.close();
		
	}

}


class RandomArray{
	public static void main(String[] args) {
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("PLease enter the number of elements you want in the array");
		length = input.nextInt();
		
		int[] arr = new int[length];
		for(int i = 0; i < length; i++) {
			arr[i] = 30 + (int) (Math.random() * 31);
		}
		
		for(int num: arr) {
			System.out.println(num);
		}
		
		input.close();
	}
}



class Min{
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = (int) (Math.random() * 50);
			System.out.println(arr[i]);
		}
		
		int min = arr[0];
		
		for(int i = 1; i < 5; i++) {
			if(arr[i] < min)
				min = arr[i]; 
		}
		
		System.out.println(min);
		
		
		/*int[] arr = {30, 2, 10, 4, 3};
		int min = arr[0];
		
		Arrays.sort(arr);
		
		System.out.print(arr[0]);
		*/
			
		
	}
}


//next problems in deck : summing, find the largest element
