package weekfive;

import java.util.HashMap;
import java.util.Map.Entry;

public class RandomHashMap {
	public static void main(String [] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		
		for(int i = 0; i < 30; i++) {
			char randomChar = (char) (65 + Math.random() * 26);
			int randomInt = (int) (1 + Math.random() * 100);
			map.put(randomChar,randomInt);
		}
		
		for(Entry<Character, Integer> x: map.entrySet()) {
			System.out.println(x.getKey() + ": " + x.getValue());
		}
		
		//System.out.println(map);
		
		System.out.println("Map size is: " + map.size());
		
		
		
	}

}
