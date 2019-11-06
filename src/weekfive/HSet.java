package weekfive;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HSet {
	public static void main(String[] args) {
		//int [] numbers = {5, 1, 55, 22, 5, 0, 1};
		
		String [] numbers = {"Mango", "Orange", "Apple", "mango", "Apple"};
		Set<String> set = new HashSet<String>();
		
		for(int i = 0; i < numbers.length; i++) {
			set.add(numbers[i]);

		}
		
		System.out.println(set); //removes dupes and sorted
		
		Set<String> strings = new TreeSet<String>(set);
		
		
		
		
		
		
	}

}
