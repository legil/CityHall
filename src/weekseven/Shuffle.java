package weekseven;

import java.util.HashSet;

public class Shuffle {
	public static void main(String[] args) {
		
		HashSet<char[]> st = new HashSet<char[]>();

		char[] chars = {'a', 'p', 'q', 'r', 'z' }; //Find and print all the 120 combinations
		st.add(chars);
		
		
		while (st.size() < 120) {
			char[] newChars = shuffle(chars).toCharArray();
			st.add(newChars);
		}
		
		for(char[] c : st) {
			System.out.print(c);
			System.out.print(" ");
		}
		
		System.out.println(st.size());
		
	}
	
	public static String shuffle(char [] c) {
		String s = "";
		for (int i = c.length - 1; i > 0; i--) { // makes less chance of picking the same index
			
			int random = (int) (Math.random() * (i + 1));
	
			// swap myList[i] with myList[j]
	
			int temp = c[i]; // swap
			c[i] = c[random];
			c[random] = (char) temp;
			
			
			s += String.copyValueOf(c);
	
		}
		//System.out.println(Arrays.deepToString(chars));
		return s;
	}
}
