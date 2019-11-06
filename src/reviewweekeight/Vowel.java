package reviewweekeight;
import java.util.HashMap;
import java.util.Map;

//Find the value of "Cookie Cutter"
//Print out each vowel
//Sum up the ASCII value of all the vowels (only) and print out the total value of that sum

public class Vowel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] cA = "Cookie Cutter".toCharArray();
		for( char c: cA) {
			if ("aeiou".indexOf(c) >=0 || "AEIOU".indexOf(c) >= 0) {
				System.out.println(c + " : " + (int) c);
			}
			add(hm, c);
		}
		
		vowelSum(hm);
	}
	public static void add(Map<Character, Integer> hm, char c) {
		if (hm.containsKey(c)) {
			hm.put(c, hm.get(c) + 1);
		} else {
			hm.put(c, 1);
		}
	}
	public static void vowelSum(Map<Character, Integer> hm) {
		int vowelSum = 0;
		for (char c : hm.keySet()) {
			if ("aeiou".indexOf(c) >= 0) {
				vowelSum += "aeiou".charAt("aeiou".indexOf(c)) * hm.get(c);
			} else if ("AEIOU".indexOf(c) >= 0){
				vowelSum += "AEIOU".charAt("AEIOU".indexOf(c)) * hm.get(c);
			}
		}
		System.out.println("The sum for all the vowels are " + vowelSum);
	}	
}